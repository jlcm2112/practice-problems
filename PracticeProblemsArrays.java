
public class PracticeProblemsArrays {
 
	public static void main (String[] args) {
		String myName = "Milhoan";
		System.out.println("My name length is: " + myName.length());
		
		String[] peopleIKnow = {"Elijah", "Gabriel", "Devon"};
		System.out.println("People I know: " + peopleIKnow[0] + " " + peopleIKnow[1] + " " + peopleIKnow[2]);
		
		double[] gpa = {3.5, 2.4, 4.0, 3.4, 1.7};
		System.out.println("GPAs: " + gpa[0] + " " + gpa[1] + " " + gpa[2] + " " + gpa[3] + " " + gpa[4]);

		String[] vacationSpots = {"Barcelona", "Michigan", "Fiji", "Oregon"};
		System.out.println("Vacation Spots: " + vacationSpots[0] + " " + vacationSpots[3]);
		
		String[] nameArray = myName.split("h|i");
		System.out.println(nameArray[0] + " " + nameArray[1] + " " + nameArray[2]);
	}
}
