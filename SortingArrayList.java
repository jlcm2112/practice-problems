import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortingArrayList {

	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList foo = new ArrayList();
		
		for(int i=0; i<20; i++){
			foo.add(10 + generator.nextInt(90));
		}
		System.out.println("ArrayList before: " + foo);
		
		//Integer largest;
	 	//for(int i=0; i<foo.size(); i++){	
	 		Collections.sort(foo);
	 		Collections.reverse(foo);
	 //	}
		System.out.println("ArrayList after: " + foo);

	}

}
