package JavaBasics;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius value for Circle :");
		Double r = s.nextDouble();
		Double Area = (22*r*r)/7;
		System.out.println("Area of Circle is: "+Area);

		System.out.println("Enter the radius value for Perimeter:");
		Double r1 = s.nextDouble();
		Double Perimeter = (2*22*r1)/7;
		System.out.println("Perimeter of Circle is : "+Perimeter);
        s.close();
	}

}
