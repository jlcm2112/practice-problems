
public class Array {

	public static void main (String[] args) {
		int[] cupValues = new int[5];
		cupValues[0] = 42;
		cupValues[1] = 86;
		cupValues[2] = 23;
		cupValues[3] = 8;
		cupValues[4] = 91;
		
		System.out.println(cupValues[0]); // prints "42"
		System.out.println(cupValues[1]); // prints "86"
		System.out.println(cupValues[2]); // prints "23"
		System.out.println(cupValues[3]); // prints "8"
		System.out.println(cupValues[4]); // prints "91"
		
		int[] cupValues1 = new int[5];
		int numberOfCups = cupValues1.length;
		System.out.println(numberOfCups); // prints "5"

		cupValues1 = new int[2];
		System.out.println(cupValues1.length); // prints "2"
	}
}
