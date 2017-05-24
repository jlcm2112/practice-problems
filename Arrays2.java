import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		String[] peers = { "Trina", "Jenny", "Brent", "Evie" };
		System.out.println("The first letters of the peers sitting next to me are: " + peers[0].charAt(0) + " "
				+ peers[1].charAt(0) + " " + peers[2].charAt(0) + " " + peers[3].charAt(0) + ". ");
	
		
		String[] peers2 = new String[4];
		System.out.println("Please enter 4 names.");

		Scanner input = new Scanner(System.in);

		peers2[0] = input.next();
		peers2[1] = input.next();
		peers2[2] = input.next();
		peers2[3] = input.next();
		System.out.println("The first letters of the peers sitting next to me are: " + peers2[0].charAt(0) + " "
				+ peers2[1].charAt(0) + " " + peers2[2].charAt(0) + " " + peers2[3].charAt(0) + ". ");

		
		
		
		System.out.println("Please enter a word.");
		String myWord = input.next();
		 myWord = myWord.toLowerCase();
		
		System.out.println("Please enter a letter.");
		String myLetter = input.next();
		myLetter = myLetter.toLowerCase();
		
		if (myWord.contains(myLetter)) {
			System.out.println("Yep, it's got one of those.\n");
		}
		else {
			System.out.println("So, sorry.");
		}
		
		String foo = "foo,bar,foobar";
		String[] list = foo.split(",");
		System.out.println("First Sequence (foo,bar,foobar): " + list[0] + " " + list[1] + " " + list[2]);
		
		String fuu = "fuu-bar, fuubar";
		String[] list2 = foo.split(",|-");
		System.out.println("Second Sequence (fuu-bar, fuubar): " + list2[0] + " " + list2[1] + " " + list2[2] + "\n");
		
		System.out.println("What does it return?: " + list2[0].contains("p"));

	}

}
