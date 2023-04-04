package JavaBasics;

public class PostPreIncrementDecrement {

	public static void main(String[] args) {
	
		int i=1;
		int j=i++; //Post increment
		System.out.println("i is : "+i);
		System.out.println("j is : "+j);
		
		int x=1;
		int y=++x; //Pre increment
		System.out.println("x is : "+x);
		System.out.println("y is : "+y);
		
		int a=2;
		int b=a--; //post decrement
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
		
		int m=2;
		int n=--m;//pre decrement
		System.out.println("m is : "+m);
		System.out.println("n is : "+n);
	}

}
