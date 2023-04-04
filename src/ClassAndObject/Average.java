package ClassAndObject;

import java.util.Scanner;

public class Average {

	    void calculate(){
		double a,b,c,d;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value a :");
		a=s.nextInt();
		System.out.print("Enter the value b :");
	    b=s.nextInt();
	    System.out.print("Enter the value c :");
	    c=s.nextInt();
	    d=(a+b+c)/3;
	    System.out.println("Average of 3 nos. is : "+d);
	}
	
	public static void main(String[] args) {
     Average avg = new Average();
     avg.calculate();

	}

}
