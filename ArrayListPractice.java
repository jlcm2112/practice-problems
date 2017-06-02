import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("bird");
		animals.add("dog");
		animals.add("giraffe");
		animals.add("alpaca");
		System.out.println(animals);

		ArrayList<Boolean> booleans = new ArrayList<Boolean>();
		booleans.add(true);
		booleans.add(false);
		booleans.add(false);
		booleans.add(true);
		booleans.add(false);
		for (Boolean bool : booleans) {
			if (bool.equals(true)) {
				System.out.println("Better bring an umbrella.");
			} else {
				System.out.println("No rain today, enjoy the sun!");
			}
		}

		ArrayList<Integer> foo = new ArrayList<Integer>();
		foo.add(1);
		foo.add(23);
		foo.add(9);
		foo.add(77);
		foo.add(922);
		foo.add(6);
		foo.add(32);
		foo.add(63);
		foo.add(14);
		foo.add(5);

		System.out.println("Does foo contain 23? " + foo.contains(23));
		System.out.println("Does foo contain 77? " + foo.contains(77));
		System.out.println("Does foo contain 15? " + foo.contains(15));
		foo.remove("27");
		foo.remove("922");
		foo.remove("32");
		foo.remove("6");

		checkForContains(foo);

		ArrayList<String> myThings = new ArrayList<String>();
		myThings.add("this");
		myThings.add("that");
		myThings.add("the other");
		System.out.println(myThings);
		myThings.clear();
		myThings.add(0, "newfirst");
		myThings.add(0, "newnewfirst");
		myThings.add(myThings.size(), "newlast");
		System.out.println(myThings);
		myThings.set(1, "second");
		writeline(myThings);
		myThings.remove(1);
		writeline(myThings);
		myThings.remove("newlast");
		writeline(myThings);
		myThings.add("foo");
		writeline(myThings);
		ArrayList<String> foo2 = new ArrayList<String>();
		foo2.add("foo");
		myThings.removeAll(foo2);
		writeline(myThings);
		myThings.clear();
		writeline(myThings);

	}

	public static void checkForContains(ArrayList<Integer> foo) {

		System.out.println("Does foo contain 23? " + foo.contains(23));
		System.out.println("Does foo contain 77? " + foo.contains(77));
		System.out.println("Does foo contain 15? " + foo.contains(15));

	}

	public static void writeline(ArrayList<String> foo) {
		System.out.println(foo);
	}
}