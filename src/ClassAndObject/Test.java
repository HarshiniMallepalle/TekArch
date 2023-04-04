package ClassAndObject;

abstract class A1 {
	abstract void m1();

	void m2() {
		System.out.println("One");
	}
}

class B extends A1 {
	void m1() {
		System.out.println("Hello ");
	}

	void m2() {
		System.out.println("Two");//Method Overriding
	}
}

public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.m2();

	}
}
