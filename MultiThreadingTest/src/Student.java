import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class Student extends Thread{
	 private int timePerQuestion;
     private String name;
     private Test test;
     public static Random r = new Random();
     public Student(String s, Test t) {
         name = s;
         test=t;
     }
     
     public void setTimePerQuestion() {
         timePerQuestion = r.nextInt(21) + 10;
     }

     public void getTimePerQuestion() {
         System.out.println(name + " takes on average " + timePerQuestion + " seconds to answer a question");
     }

     public void run() {
         for (int i = 0; i < test.getQuestions(); i++) {
        	 try {
				TimeUnit.SECONDS.sleep(timePerQuestion);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
             System.out.println(name + " has answered question " + (i + 1));
         }
     }
}
