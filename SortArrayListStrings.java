import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortArrayListStrings {

	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<String> foo = new ArrayList<String>();

 			foo.add("fie");
 			foo.add("fee");
 			foo.add("fum");
 			foo.add("foe");
 			foo.add("smell");
 			foo.add("i");
 			foo.add("things");
		 
		System.out.println("ArrayList before: " + foo);

		sort(foo);	
		System.out.println("ArrayList after: " + foo);

	}

	public static ArrayList sort(ArrayList foo) {
		Collections.sort(foo);
		return foo;
	}

}
