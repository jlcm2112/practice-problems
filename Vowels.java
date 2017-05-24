import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter letter: ");
		String letter = input.next();
		letter = letter.toLowerCase();

		switch (letter) {
		case "a":
			System.out.println(letter + " is a vowel.");
			break;

		case "e":
			System.out.println(letter + " is a vowel.");
			break;

		case "i":
			System.out.println(letter + " is a vowel.");
			break;

		case "o":
			System.out.println(letter + " is a vowel.");
			break;

		case "u":
			System.out.println(letter + " is a vowel.");
			break;

		case "y":
			System.out.println(letter + " is sometimes a vowel.");
			break;

		default:
			System.out.println(letter + " is a consonent.");

		}
	}
}
