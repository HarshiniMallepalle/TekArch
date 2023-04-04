package ClassAndObject;

abstract class AbstractParent1 {

	AbstractParent1() {
		System.out.println("Parent Class Constructor");
	}

	abstract void sum();

	public void toPrint() {
		System.out.println("My name is Harshini");
	}

}

class AbstractChild1 extends AbstractParent1 {

	AbstractChild1() {
		System.out.println("Child class Constructor");
	}

	@Override
	void sum() {
		int x, y, z;
		x = 10;
		y = 50;
		z = x + y;
		System.out.println("Sum of two nos. is : " + z);

	}

	int div(int x, int y) {
		int z = x / y;
		System.out.println("Division of two nos. : " + z);
		return z;
	}

}

public class AbstractTest1 {

	AbstractTest1() {
		System.out.println("Test Constructor");
	}

	public static void main(String[] args) {
		AbstractChild1 ab = new AbstractChild1();
		ab.div(90, 3);
		ab.sum();
		ab.toPrint();
		System.out.println("**********");
		AbstractParent1 ac = new AbstractChild1(); /* As AbstractParent is abstract class we cannot create object so we
													 * use child class AbstractChild
													 */
		ac.sum();
		ac.toPrint();
		//ac.div(9,3); //not allowed as it is child property
		System.out.println("************************");
		AbstractTest1 ad = new AbstractTest1();

	}

}
