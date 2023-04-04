package JavaBasics;

public class SwapNosWith2Variables {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before Swap a is : "+a+" Before Swap b is : "+b);
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("After Swap a is : "+a+" After Swap b is : "+b);
	}

}
