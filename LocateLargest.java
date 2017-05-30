import java.util.ArrayList;
import java.util.Random;

public class LocateLargest {

	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Integer> foo = new ArrayList<Integer>();

		for (int i=0; i<10; i++){
			foo.add(generator.nextInt(100));
		}
		System.out.println("Arraylist: " + foo);
		Integer largest = 0;
		for (Integer a:foo) {
			if (a > largest) {
				largest = a;
			}
		}
		System.out.println("The largest value is: " + largest +", which is in slot " + foo.indexOf(largest));

	}

}
