import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueArrayList {

	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Integer> foo = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			foo.add(1+ generator.nextInt(51));
		}
		System.out.println(foo);
		System.out.println("Please enter an integer: ");
		int x = input.nextInt();
		System.out.println("Value to find: " + x);
		for(Integer i:foo){
			if (x == i) {
				System.out.println(x+" is in the ArrayList.");
			}
		}
	}

}
