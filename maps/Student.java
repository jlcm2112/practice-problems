package maps;


public class Student {
	public String id;
	public String name;

	public Student() {
	}
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student with id: " + id + ", name: " + name; 
	}
}
