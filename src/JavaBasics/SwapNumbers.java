package JavaBasics;

public class SwapNumbers {

	public static void main(String[] args) {
		// using 3rd variable
		int a=10,b=20,c;
		System.out.println("Before Swap a is : "+a+ "     Before Swap b is : "+b);
		c=b;
		b=a;
		a=c;
		System.out.println("After  Swap a is : "+a+"     After  Swap b is : "+b);

		//using two variables
		
		int a1=10, b1 = 20;
		System.out.println("Value of a before swap is :"+a1);
		System.out.println("Value of b before swap is :"+b1);

		b1=a1;
		a1=a1+b1;
		System.out.println("Value of a after swap is :"+a1);
		System.out.println("Value of b after swap is :"+b1);


	}

}
