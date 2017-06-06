package fleet;

public class Plane extends DeliveryVehicle{

	private int wings;

	
	public Plane(String description, int rateOfTravel) {
		super(description, rateOfTravel);
		this.wings = Integer.parseInt(description);
		this.fuelConsumption = 3600;
		System.out.println("Created a new " + this);

	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + " with " +description + " wheels, which travels at " + rateOfTravel + "mph and gets " + fuelConsumption+" mpg.";
	}

}
