import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> foo = new ArrayList<Integer>();
		Random generator = new Random();
		for (int i = 0; i < 9; i++) {
			foo.add(1 + generator.nextInt(101));
		}
		ArrayList<Integer> foo2 = new ArrayList<Integer>();
		foo2.addAll(foo);
		System.out.println(foo);

		System.out.println(foo2);
		
		foo.set(foo.size()-1, -7);
		System.out.println(foo);
		System.out.println(foo2);
	}
}
