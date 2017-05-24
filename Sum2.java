import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sum = 0;
		int lower = 1;
		int upper = 0;

		do { // prompt for numbers until lower < upper
			System.out.println("This program will display the sum of the integers between a lower and upper bound."
					+ "\nPlease enter the lower number:");
			lower = input.nextInt();
			System.out.println("\nPlease enter the higher number:");
			upper = input.nextInt();

			if (upper < lower) {
				System.out.println("Error: Upper bound cannot be less than Lower bound.");
				System.exit(0); 
			}
		} while (lower > upper);

		//if upper > lower, do calculation
		for (int i = lower; i <= upper; i++) {
			sum += i;
		}

		System.out.print(sum + "(");

		for (int i = lower; i <= upper; i++) {
			System.out.print(i);
			if (i < upper) {
				System.out.print("+");
			}
		}
		System.out.print(")");

	}

}
