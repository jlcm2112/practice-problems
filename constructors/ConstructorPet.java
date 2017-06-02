package constructors;

public class ConstructorPet {
	String name;
	int hunger; 
	
	public ConstructorPet(String newName) {
		name = newName;
		hunger = 50;
	}

	public ConstructorPet(String newName, int initialHunger) {
		name = newName;
		hunger = initialHunger;
	}
		
	@Override
	public String toString(){
		return "Pet named " + name + ". Hunger level is " + hunger;
	}

}
