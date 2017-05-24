import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Please enter a number.");
		int entry = input.nextInt();
				
		for (int i=1; i<=entry; i++) {
			sum += i;
		}
		
		System.out.print(sum + "(");
		
		for (int i=1; i<=entry; i++) {
			System.out.print(i);
			if (i<entry) {
				System.out.print("+");
			}
		}
		System.out.print(")");

	}

}
