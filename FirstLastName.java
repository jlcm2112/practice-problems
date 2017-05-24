import java.util.Scanner;

public class FirstLastName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = input.next();
		System.out.println("Enter last name: ");
		String lastName = input.next();
		
		if (firstName.length() > lastName.length()) {
			System.out.println("First name is longer, with " + firstName.length() + " characters.");

		}
		else if (firstName.length() < lastName.length()) {
			System.out.println("Last name is longer, with " + lastName.length() + " characters.");

		}
		else {
			System.out.println("Both names are equal, with " + firstName.length() + " characters.");

		}
input.close();

	}
}