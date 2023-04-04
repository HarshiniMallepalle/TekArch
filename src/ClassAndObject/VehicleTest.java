package ClassAndObject;

/*Create a abstract class for Vehicle Add property like “NoOfWheels” inside vehicle
Create a inherited Bike Class from vehicle Add properties like “MaxSpeed”
Create a inherited class for Car from vehicle Add property like double “TurningRadius”
Try creating a instance of Vehicle. You need to get a compile error. 
Using the concept of Polymorphism in a Entry class Create function Start(Vehicle vehicle)Send both car and bike to that function 
*/

public class VehicleTest {

	void Start(Vehicle1 vehicle) {
		System.out.println("No. of Wheels : "+vehicle.NoOfWheels);
	}
	public static void main(String[] args) {
		VehicleTest vt = new VehicleTest();
		Vehicle1 vt1=null;
//		vt1= new Bike1();
//		vt1 = new Car1();
		Bike1 bike= new Bike1();
		Car1 car=new Car1();
		bike.maxspeed();
        vt.Start(bike);
        vt.Start(car);
	}

}
