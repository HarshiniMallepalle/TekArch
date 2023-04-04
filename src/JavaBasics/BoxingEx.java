package JavaBasics;

public class BoxingEx {
	
	public static void main(String[] args) {
		
		/* 1.wrapper class: Integer,Float,Character,Double
		 * 2.Primitive data types: int,float,double,char,boolean
		 * 3.Boxing is converting primitive to wrapper
		 *  
		 * 4.We do Boxing so that we can convert integer to double or float etc easily by using default methods which r available. 
		 */
		
		int a = 300;
		System.out.println("Before Boxing :"+a);
		
		Integer b = new Integer(a);//Boxing
		Integer b1 = new Integer(200);//Boxing
		Integer b2 = 300;//Boxing
		
		System.out.println("After Boxing is :"+b2);
		
		b2.doubleValue();
		
		System.out.println("After Boxing converting to double :"+b2.doubleValue());
		
	}

}
