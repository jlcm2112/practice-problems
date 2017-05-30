import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListWhereIsIt {

	public static void main(String[] args) {

		ArrayList<Integer> foo = new ArrayList<Integer>();
		Random generator = new Random();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			foo.add(1 + generator.nextInt(51));
		}
		System.out.println("ArrayList: " + foo);
		System.out.println("Value to find: ");
		int x = input.nextInt();
		
		if(foo.contains(x)) {
			System.out.println(x+" is in slot " + foo.indexOf(x)+".");
		}
		else {
			System.out.println(x +" is not in the ArrayList.");
		}
	}
}