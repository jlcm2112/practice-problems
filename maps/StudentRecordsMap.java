package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StudentRecordsMap {

	public static void main(String[] args) {
		
		Student harvey = new Student("23452", "Harvey Dent");	
		Student jessica = new Student("324322", "Jessica Jones");	
		Student jj = new Student("93485", "J Jonah Jameson");
 		
		Map<String, String> students = new HashMap<String, String>();
		
		students.put("23452", "Harvey Dent");
		System.out.println("Hashcode for Harvey is " + "23452".hashCode());
		System.out.println(students);

		students.put("324322", "Jessica Jones");
		System.out.println("Hashcode for Jessica is " + "324322".hashCode());
		System.out.println(students);
		
		String studentName = students.get("23452");
		System.out.println("I found student " + studentName);
		
		//common map methods
		//collection views
		System.out.println("Student names (map values) are " +students.values());
		System.out.println("Student ids (map key) are " + students.keySet());
		System.out.println("Student entries (key/value pairs) are " + students.entrySet());
			
		System.out.println("Iterating over student names: ");
		for(String currentName: students.values()){
			System.out.println(currentName);
		}
		
		System.out.println("Iterating over entires:");
		for(Entry<String, String> entry: students.entrySet()) {
			String key = entry.getKey(); // student id
			String value = entry.getValue();
			System.out.println("key is " + key + ", value is " + value);
		}
		
		//sorting a list
		//collection is less specific than list (all lists are collections; not all collections are lists)
		System.out.println("Sorting a list:");
		List<String> listOfClasses = new ArrayList<String>();
		listOfClasses.add("Philosophy");
		listOfClasses.add("Creative Writing");
		System.out.println(listOfClasses);
		Collections.sort(listOfClasses);
		System.out.println(listOfClasses);
		
		//is this a valid student id?
		if(students.containsKey("23452")) { //Harvey Dent's id
			System.out.println("Yes, 23452 is a valid student id");
		}
		if(students.containsKey("1234")) { //bad one
			System.out.println("Found the key"); // won't print
		}
		
		//is this a valid student name
		if(students.containsValue("Harvey Dent")) { 
			System.out.println("Found Harvey!");
		}
		
		//do we have any students?
		if(!students.isEmpty()) {
			System.out.println("We have students!");
		}
		
		//sorry, Harvey, you're DC
		students.remove("23452"); // his id is the key
		System.out.println(students);
		
		// how many students are there?
		System.out.println("There are " + students.size() + " students.");
	}
 
}