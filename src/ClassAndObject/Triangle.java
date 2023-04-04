package ClassAndObject;

public class Triangle {
	int a = 3, b = 4, c = 5;
	double s, area, perimeter;

	Triangle() {

		s = (a + b + c) / 2;
		area = (s - a) * (s - b) * (s - c) * s;
		perimeter=a+b+c;

		System.out.println("Area of Triangle is : "+Math.sqrt(area));
        System.out.println("Perimeter of Triangle is : "+perimeter);
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();

	}

}
