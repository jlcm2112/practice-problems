package constructors;

public class VirtualPetApp {

	public static void main(String[] args) {
		VirtualPet myPet = new VirtualPet();
		myPet.name = "Hope";
		
		System.out.println("My pet is " + myPet);
		
		ConstructorPet constructedPet = new ConstructorPet("Sheeba");
		System.out.println("My pet is " + constructedPet);
		ConstructorPet hungryPet = new ConstructorPet("Garfield", 70);
		System.out.println("My pet is " + hungryPet);



	}

}
