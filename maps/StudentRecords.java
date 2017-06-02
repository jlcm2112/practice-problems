package maps;

import java.util.ArrayList;
import java.util.List;

public class StudentRecords {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		
		Student harvey = new Student();
		harvey.id = "23452";
		harvey.name = "Harvey Dent";
		students.add(harvey);
		
		students.add(createStudent("324322", "Jessica Jones"));
		
		Student jj = createStudent("93485", "J Jonah Jameson");
		students.add(jj);
		
		System.out.println(students);
		
		String lookingfor = "Harvey Dent";
		
		for(Student current: students) {
			if(lookingfor.equalsIgnoreCase(current.name)){
				System.out.println("Found my student. His id is " + current.id);
				break;
			}
		}
	}
	static Student createStudent(String idParam, String nameParam){
		Student s = new Student();
		s.id = idParam;
		s.name = nameParam;
		return s; 
	}
}