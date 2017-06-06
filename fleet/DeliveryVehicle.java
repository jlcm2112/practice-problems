package fleet;

public abstract class DeliveryVehicle {
	protected String description;
	protected double rateOfTravel;
	protected int fuelConsumption;
	protected int efficiency;
	
	public DeliveryVehicle(String description, int rateOfTravel) {
		this.description = description;
		this.rateOfTravel = rateOfTravel;
	}	
	
public double calculateDistance(int time){
	return time * rateOfTravel;
}

public  double calculateTime(int distance){
	return distance / rateOfTravel;
}
public double refuel(double distance, double time){
	return distance*fuelConsumption*60/time;
}

@Override
public String toString() {
	return getClass().getSimpleName() + " with" +description + " which travels at " + rateOfTravel + "mph.";
}
}
