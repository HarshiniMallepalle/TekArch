package ClassAndObject;

public class AbstractChild extends AbstractParent {

	@Override
	void sum() {
		int x,y,z;
		x=10;y=50;
		z=x+y;
		System.out.println("Sum of two nos. is : "+z);
		
	}
	 
	int div(int x, int y) {
		int z=x/y;
		System.out.println("Division of two nos. : "+z);
		return z;
	}
	
	
}
