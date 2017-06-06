package fleet;

public class Bicycle extends DeliveryVehicle {

	protected int wheels;

	public Bicycle(String description, int rateOfTravel) {
		super(description, rateOfTravel);
		this.wheels = Integer.parseInt(description);
		this.fuelConsumption = 0;
		this.efficiency = 100;
		System.out.println("Created a new " + this);
	}

	@Override
	public double calculateDistance(int time) {
		double breaks = Math.floor((time /2));
		double newTime = time - breaks*.5;
		return(newTime*rateOfTravel);

	}

	@Override
	public double calculateTime(int distance) {
		double time = distance / rateOfTravel;
		double breaks = Math.floor((time / 2));
		return (time + breaks);
	}
	
	@Override
	public double refuel(double distance, double time){
		return 0;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + " with " +description + " wheels, which travels at " + rateOfTravel + "mph and is "  + efficiency + "% efficient.";

	}

}
