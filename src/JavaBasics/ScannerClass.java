package JavaBasics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values  :");
		int a = s.nextInt();
		double b = s.nextDouble();
		float c = s.nextFloat();
		boolean d = s.hasNext();

		String f = s.next();
		String g = s.next();

		double e = a * b + c;
		System.out.println("Name is : " + f + " " + g);
		System.out.println(
				"Value of a is : " + a + "\nValue of b is : " + b + "\nValue of c is : " + c + "\nValue of d is :" + d);
		System.out.println("Arthametic expression  value is  : " + e);

		s.close();
	}
}
