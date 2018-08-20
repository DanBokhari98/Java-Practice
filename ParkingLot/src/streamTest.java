import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamTest {	
	public static void main(String [] args) {
		String [] names = {"anna", "Bob", "Carlos"};
		List<String> namesList = Arrays.asList(names);
		Stream<String> namesStream = namesList.stream();
		namesStream.forEach(s -> {System.out.println(s);});
	}
}
