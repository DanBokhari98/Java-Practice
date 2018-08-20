import java.io.*;
import java.util.Scanner;
public class ReadMe {

static PrintWriter pw;	
static FileWriter fw;
static File myFile;
static Scanner inFile;
private static Scanner keyboard;
private static Scanner keyboard2;

	//Creates a new file
	public static void createFile(String file) throws FileNotFoundException {
		if(!file.contains(".txt")) {
			throw new IllegalArgumentException("Wrong format"); 
		}
		PrintWriter pw = new PrintWriter(file);
		pw.close();

	}
	
	//if the file exist we can overwrite the contents inside / add to them
	public static void appendFile(PrintWriter pw, String file) throws IOException {
		fw = new FileWriter(file, true);
		myFile = new File(file);
		//allows me to read file
		inFile = new Scanner(myFile);
		
	}
	
	
	//allows me to write to the file
	public static void writeToFile(String str) throws IOException {
		keyboard2 = new Scanner(System.in);
		Scanner file = new Scanner(myFile);
		PrintWriter write = new PrintWriter(myFile);
		String current = "";
		while(file.hasNextLine()) {
			current += file.nextLine()+"\n";
			if(str.equalsIgnoreCase("CLOSE")) {
				write.write(current + "\n");
				file.close();
			}
			
		}
	}
	

	//allows me to read Inside the file
	public static void readInFile(Scanner inFile) {
		while(inFile.hasNext()) {
			String strIn = inFile.nextLine();
			System.out.println(strIn);
		}
		inFile.close();
	}
	
	public static void main (String [] args) throws IOException {
		keyboard = new Scanner(System.in);
		System.out.println("Does file exist? ");
		String ans = keyboard.nextLine();
		if(!ans.equalsIgnoreCase("YES")) {
			System.out.println("Enter new file name: ");
			String filename = keyboard.nextLine();
			createFile(filename);
		}else {
			System.out.println("which file will you write to? ");
			String filename = keyboard.nextLine();
			System.out.println("Enter text: ");
			String newText = keyboard.nextLine();
			appendFile(pw ,filename);
			while(!newText.equalsIgnoreCase("CLOSE")) {
				writeToFile(newText);
				newText = keyboard.nextLine();
			}
			fw.close();
		}

	}
}
