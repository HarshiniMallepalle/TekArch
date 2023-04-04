package JavaBasics;

public class UnBoxingEx {
	public static void main(String[] args) {
		
		// Unboxing converting Wrapper class to primitive datatype
        // Unboxing and typcasting. 
		// Data conversion
		Integer a = 500;//Creating Wrapper class object
		int num = a.intValue();//Converting the wrapper object to primitive datatype
	
		System.out.println(num);
		a.floatValue();
		System.out.println("Wrapper Class :"+a.floatValue());
		int b = 500;//unboxing
		double b1=(double)b;//typecasting
		float b2=(float)b;
		
		System.out.println(b+100);
		System.out.println(b1);
		System.out.println(b2);
		
		String s = String.valueOf(b);//converting int to string 
		System.out.println("int converted to string : "+s+100);
		// variable s is string now
		
		int i=Integer.parseInt(s);
		System.out.println(i+10);
		
		double d = Double.parseDouble(s);
		System.out.println(d+5);
		
		float f = Float.parseFloat(s);
		System.out.println(f+8);
		
		String g="true";
		boolean bb = Boolean.parseBoolean(g);
		System.out.println(bb);
		
		String sa="100U";
		int n=Integer.parseInt(sa);//NumberFormatException as "U" cannot convert to number.
		System.out.println(n);
		
		/* Now b is int so we cannot convert it to double or float etc using default methods.
		 * if we write b.we wont get default methods at all.
		 * But we can convert primitive data type to float or double etc using typecasting
		 */
		
	}
}

