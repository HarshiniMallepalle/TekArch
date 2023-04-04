package ClassAndObject;

public class Bike1 extends Vehicle1 {

	Bike1(){
		this.NoOfWheels=2;
	}
	
	void maxspeed() {
		System.out.println("We should go in speed Limit");
	}
	public static void main(String[] args) {
		
		Bike1 bike = new Bike1();
        bike.maxspeed();
	}

}
