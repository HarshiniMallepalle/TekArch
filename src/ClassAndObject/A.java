package ClassAndObject;



public class A  {
 
	public void sum(int x, int y){ 
		System.out.println("Sum of two 2 numbers: " +(x+y));
	}
	
 public	void sum(int x, int y, int z){              //Method Overloading x & y
		System.out.println("Sum of three numbers: " +(x+y+z));
		} 
	

	public static void main(String[] args) {
		 A a = new A();
		 a.sum(50, 10);
		 a.sum(30, 40, 50);
	
	}

}
