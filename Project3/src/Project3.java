import java.util.Arrays;
import java.util.StringTokenizer;

public class Project3 {

	public static String[] readDates(String fileName) {
		String[] raw = new String[100]; 
		int length = 0;
		TextFileInput inFile = new TextFileInput(fileName);
		String line = inFile.readLine();
		
		while (line != null && length < 100) {
			StringTokenizer tokens = new StringTokenizer(line, ",");
			while (tokens.hasMoreTokens()) {
				String date = tokens.nextToken();
				if (validDate(date)) {
					raw[length] = date;
					length++;
				}
				else {
					System.out.println(date);
				}
			}
			line = inFile.readLine();
		}
		return Arrays.copyOfRange(raw, 0, length);
	}// readDates- utilizes StringTokenizer in order to remove any comma's that are within the input file.

	public static String[] selectionSortDates(String[] raw) {
		String[] sorted = Arrays.copyOfRange(raw, 0, raw.length);
		for (int i = 0; i < sorted.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < sorted.length; j++) {
				if (sorted[minIndex].compareTo(sorted[j]) > 0) {
					minIndex = j;
				}
			}
			String temp = "";
			temp = sorted[minIndex];
			sorted[minIndex] = sorted[i];
			sorted[i] = temp;
		}
		return sorted;
	}//selectionSortDates- properly arranges the dates in chronological order from oldest to newest

	public static boolean validDate(String date) {
		if (date.length() == 8) {
			for (int i = 0; i < 8; i++) {
				if (!Character.isDigit(date.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	} /* validDate- checks if the user properly entered the date in "yyyymmdd" format.
	     Otherwise the code would not be able to display the correct answers and would most likely crash
	     */

	public static void main(String[] args) {
		String[] raw = readDates(args[0]);
		String[] sorted = selectionSortDates(raw);
		DateGUI gui = new DateGUI();
		for (String s : raw) {
			gui.rawDates.append(s + "\n");
		}
		for (String s : sorted) {
			Date212 ss=new Date212(s);
			gui.sortedDates.append(ss + "\n");
		}
		gui.myFrame.setVisible(true);

	}// main - calls the other classes within the project and is where the code starts from when it is ran

}
