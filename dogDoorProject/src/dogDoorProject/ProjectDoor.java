package dogDoorProject;
import java.util.Scanner;

public class ProjectDoor {
	public static void main(String [] args) {
		System.out.println("Enter pin number");
		Scanner in = new Scanner(System.in);
		
		Dog myDog = new Dog("roof-roof", true);
		Dog neighborDog = new Dog("BarkBark", false);
		dogDoor myDoor = new dogDoor();
	
		String s = in.nextLine();
		Remote dogDoorControl = new Remote();
		dogDoorControl.isCorrect(s);
		
		//myDoor.unlock(neighborDog);
	

	}

}
