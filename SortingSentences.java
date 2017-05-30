import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingSentences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> foo = new ArrayList<String>();
		System.out.println("Please enter a sentence: ");
		String sentence = input.nextLine();
		
		String[] array = sentence.split(" ");
		for(String s:array){
			foo.add(s);
		}
		System.out.println("Sentence: " +foo);
		sort(foo);
		System.out.println("Sorted: "+foo);
	}

	public static ArrayList sort(ArrayList foo){
		Collections.sort(foo);
		return foo;
	}
}
