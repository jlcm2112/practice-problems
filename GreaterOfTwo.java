import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();
		System.out.println("Enter third number: ");
		int thirdNumber = input.nextInt();

		if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			
				System.out.println(firstNumber + " is the largest.");
		} else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
				System.out.println(secondNumber + " is the largest.");

		} else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
				System.out.println(thirdNumber + " is the largest.");

		} else {
			System.out.println("They are all equal");

		}
	 

	}
}