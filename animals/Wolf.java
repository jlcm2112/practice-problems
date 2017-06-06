package animals;

public class Wolf extends Carnivore {

	public Wolf(String preferredFood) {
		super(preferredFood);
		System.out.println("Made a new " + getClass().getSimpleName());
	}

	@Override
	public void makeNoise() {
		System.out.println("HOWL!");
	}

}
