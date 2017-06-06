package animals;

public class AnimalApp {
	public static void main(String[] args) {

		Animal wolf = new Wolf("rabbits");
		wolf.makeNoise();

		Animal tiger = new Tiger("monkeys");
		tiger.makeNoise();
		writeDelimiter(tiger);
		doThings(tiger);
		
		System.out.println("Feed the wolf!");
		wolf.feed("grass");
 		wolf.feed("rabbits");
 		System.out.println("Wolf hunger: " + wolf.hunger);
		
		System.out.println("Feed the tiger!");
		tiger.feed("rabbits");
		tiger.feed("monkeys");
		System.out.println("After eating: " + tiger);
	}
	
	public static void writeDelimiter(Object o) {
		System.out.println("With " + o);
	}
	
	public static void doThings(Animal a) {
		a.eat();
		a.sleep();
		a.roam();
		a.makeNoise();
	}
}