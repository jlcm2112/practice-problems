package fleet;

public class FleetApp {

	public static void main(String[] args) {

		DeliveryVehicle bike = new Bicycle("2",20);
		DeliveryVehicle plane = new Plane("2",200);
		DeliveryVehicle van = new Van("4", 70);
		
		System.out.println("This is how long it would take a plane to travel 800 miles: " + plane.calculateTime(800)+" hours");
		System.out.println("This is how long it would take a bicycle to travel 110 miles: " + bike.calculateTime(100)+" hours");
		System.out.println("This is how long it would take a van to travel 800 miles: " + van.calculateTime(800)+" hours");
		System.out.println("This is how far a bicycle can travel 7 hours: " + bike.calculateDistance(7)+" miles and uses " + bike.refuel(5.0, bike.calculateDistance(5))+" gallons of fuel.");
		System.out.println("This is how far a van can travel 5 hours: " + van.calculateDistance(5)+" miles and uses " + van.refuel(5.0, van.calculateDistance(5))+" gallons of fuel.");
		System.out.println("This is how far a plane can travel 5 hours: " + plane.calculateDistance(5)+" miles and uses " + plane.refuel(5.0, plane.calculateDistance(5))+" gallons of fuel.");


	}

}
