package ClassAndObject;
abstract class Vehicle {
	abstract void start();
	void noOfWheels() {
		System.out.println("Vehicles have more then two wheels. ");
	}
}
class Bike extends Vehicle {
	void start() {
		System.out.println("Start Bike.");
	}
	void maxSpeed() {
		System.out.println("We should go in speed limit. ");
	}
}
class Car extends Vehicle {
	void start() {
		System.out.println("Start Car");
	}
	void turningRadius() {
		System.out.println("Radius.");
	}
}
public class AbstractVehicle {
	public static void main(String[] args) {
		// Vehicle.noOfWheels(); //if we make noOfWheels static then we can call like
		// this on left hand side
		Vehicle a = new Bike();// dynamic polymorphism/ Run time polymorphism
		a.start();
		a.noOfWheels();

		Bike b = new Bike();// static polymorphism/compile time polymorphism
		b.start();
		b.noOfWheels();
		b.maxSpeed();

		Car c = new Car();
		c.start();
		c.noOfWheels();
		c.turningRadius();
	}
}
