import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GettingLargestValueArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> foo = new ArrayList<Integer>();
		Random generator = new Random();
		
		for (int i=0; i<10; i++){
			foo.add(1+generator.nextInt(101));
		}
		System.out.println("ArrayList: "+ foo);
		Integer largest = Collections.max(foo);
		
		System.out.println("The largest value is: "+largest+".");
	}

}
