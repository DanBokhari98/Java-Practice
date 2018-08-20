
public class Main {
	public static void main() throws InterruptedException {
		Test test = new Test(25);
		Student[] student = new Student[20];
		for (int i = 0; i < student.length; i++) {
            student[i]=new Student("Student " + (i+1),test);
            student[i].setTimePerQuestion();
        }
        for (int i = 0; i < student.length; i++) {
            student[i].start();
        }
        for (int i = 0; i < student.length; i++) {
            
        }
	}
}
