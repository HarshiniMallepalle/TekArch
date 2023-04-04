package ClassAndObject;

public class StaticMethodInstance {

	// Static Method cannot call instance variables.
	// Concrete Method can call static variable and instance variable .
	
	static int x=10;  //instance variables
	 int y=20;
	String s="Ram";
	
	public static void main(String[] args) {
		StaticMethodInstance smi=new StaticMethodInstance();
		smi.add(5,9);
System.out.println(x);
	}
	
	public  void add(int g, int h) { //if this method is static we cannot take x variable.
		int k=g+h+x+y;
		System.out.println(k);
	}

}


