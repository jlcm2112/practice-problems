import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListThereOrNot {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> foo = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++){
			foo.add(1+ generator.nextInt(51));
		}
		System.out.println(foo);
		System.out.println("Please enter an integer: ");
		Integer x = input.nextInt();
		if (foo.contains(x)){
			System.out.println(x+" is in the Arraylist.");
		}
		else {
			System.out.println(x+" is not in the Arraylist.");
		}
	}

}
