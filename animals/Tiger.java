package animals;

public class Tiger extends Carnivore {

	public Tiger(String preferredFood) {
		super(preferredFood);
		System.out.println("Made a new " + getClass().getSimpleName());
		
	}

	@Override
	public void makeNoise() {
		System.out.println("ROAR!");
	}

}
