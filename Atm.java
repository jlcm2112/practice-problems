import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		String pin = "2112";
		Scanner input = new Scanner(System.in);
		int attempts = 0;
		String entry;

		do {
			System.out.println("Please enter your PIN:");
			entry = input.next();

			if (!pin.equals(entry)) {
				System.out.println("Sorry that wasn't correct. " + (3 - attempts) + " attempts remaining.");
				attempts++;
			}

			if (attempts == 3) {
				System.out.println("Too many failed attempts. Goodbye.");
				break;
			}

		} while (!entry.equals(pin));
		System.out.println("Congratulations!");

	}
}