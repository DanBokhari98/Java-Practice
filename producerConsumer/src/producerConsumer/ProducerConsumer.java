package producerConsumer;

import java.util.LinkedList;
 
public class ProducerConsumer{
    public static void main(String[] args) throws InterruptedException{
        final ProdConsum production = new ProdConsum();
        // Create producer thread
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{ production.produce(); }
                catch(InterruptedException e){e.printStackTrace();}
            }
        });
        // Create consumer thread
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{ production.consume(); }
                catch(InterruptedException e){ e.printStackTrace();}
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    public static class ProdConsum{
        int max = 3;
        LinkedList<Integer> list = new LinkedList<>(); // we Use linked list because it has a removeFirst method.
        public void consume() throws InterruptedException {
            while (true){
                synchronized (this){ // reference to current object
                    // consumer thread waits while list is empty
                    while (list.size() == 0) wait();
                    //Once the first job is in the list it performs the task
                    int valueCur = list.removeFirst();
                    //finished the assignment and removes it from the list.
                    System.out.println("Consumer ate: " + valueCur);
                    notify(); // Notifies producer thread
                    Thread.sleep(1500);
                }
            }
        }
        public void produce() throws InterruptedException{
            int value = 0;
            while (true){ // run loop
                synchronized (this){ // reference to current object
                    // producer thread waits while list is full
                    while (list.size() == max) wait();
                    System.out.println("Producer created: " + value);
                    list.add(value++); // adds work
                    // notifies the consumer thread to begin consumption.
                    notify();
                    Thread.sleep(1500);
                }
            }
        } 
    }
}
