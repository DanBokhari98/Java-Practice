import java.io.*;
import java.util.Scanner;

public class Example { 
	public static void main(String [] args) throws IOException {
		//creates new file, Over - writes files of the same name
		PrintWriter pw = new PrintWriter("names.txt");
		//avoids over-writing files
		FileWriter fw = new FileWriter("names.txt", true);
		
		//Passes the name of a file into the object as reference to read
		File myFile = new File("Customers.txt");
		//Allows you to read data from a file
		Scanner inputFile = new Scanner(myFile);
		
		
		
		//Reading Data from a file
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename = keyboard.nextLine();
		File file = new File(filename);
		Scanner inFile = new Scanner(file);
		
		//Detecting the end of the file and displaying the contents in the file
		while(inFile.hasNext()) {
			String str = inFile.nextLine();
			System.out.println(str);
		}
		inFile.close(); // closes the file after reading
	}
		
}
