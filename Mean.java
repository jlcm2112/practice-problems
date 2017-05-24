import java.util.Scanner;

public class Mean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();
		System.out.println("Enter third number: ");
		int thirdNumber = input.nextInt();
		System.out.println("Enter fourth number: ");
		int fourthNumber = input.nextInt();
		
		System.out.println("The Mean is: " + (firstNumber + secondNumber + thirdNumber + fourthNumber)/4);
	}

}
