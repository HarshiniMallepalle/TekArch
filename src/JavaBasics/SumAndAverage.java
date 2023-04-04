package JavaBasics;

import java.util.Scanner;

public class SumAndAverage {
	
	public static void main(String[] args) {
		Double sum,avg;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 3 values :");
		Double a = s.nextDouble();
		Double b = s.nextDouble();
		Double c = s.nextDouble();
	
	sum=a+b+c;
	avg=(a+b+c)/3;
	System.out.println("Sum of 3 nos. is : "+sum);
	System.out.println("Average of 3 nos. is : "+avg);
	s.close();
	}

}
