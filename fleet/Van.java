package fleet;

public class Van extends DeliveryVehicle{

	private int wheels;
	
	public Van(String description, int rateOfTravel) {
		super(description, rateOfTravel);
		this.wheels = Integer.parseInt(description);
		this.fuelConsumption = 20;
		System.out.println("Created a new " + this);

	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " with " +description + " wheels, which travels at " + rateOfTravel + "mph and gets " + fuelConsumption+" mpg.";
	}

}
