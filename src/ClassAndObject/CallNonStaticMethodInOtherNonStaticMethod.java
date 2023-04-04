package ClassAndObject;

public class CallNonStaticMethodInOtherNonStaticMethod {
	
	//A static method cannot call an instance method . 
	//Both methods should be static or non static to call each other. 

	public  void sum(int x, int y) { //if we make this method static we cannot call nonstatic methid div.
		int h= div(20,2);
		int k=x+y+h;
		System.out.println("Sum of 3 nos. :"+k);
	}

	public int div(int x,int y) {
   
		int z=x/y;
		return z;
	}
	
	public static void main(String[] args) {
		CallNonStaticMethodInOtherNonStaticMethod q =new CallNonStaticMethodInOtherNonStaticMethod();
	q.sum(15,10);
	int as=q.div(27, 3);
	System.out.println("Division of two nos. is : "+as);
	}

	

}
