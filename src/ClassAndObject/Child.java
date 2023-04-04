package ClassAndObject;

public class Child extends Parent { // type Child cannot subclass the final class Parent
	
	
	public static void main(String[] args) {
		Child ch =new Child();
          ch.Add(500, 20);
          ch.Addition(50, 10);
          
	}
	void Add(int x,int y) { //cannot override static or final class/parent class
		                    //But can be overload static or final class/parent class
		int z= x+y;
		System.out.println("Sum of child two nos. : "+z);
	}

}
