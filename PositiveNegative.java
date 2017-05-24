import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		if (number > 0) {
		System.out.println(number + " is positive.");
		}
		else if (number == 0) {
			System.out.println(number + " is 0.");

		}
		else {
			System.out.println(number + " is negative.");
		}

		input.close();
	}

}
