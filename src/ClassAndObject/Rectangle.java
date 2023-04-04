package ClassAndObject;

public class Rectangle {
	
	double Area(int x, int y){
		double area;
		area=x*y;
		return area;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		//r.Area(4,5);
		System.out.println("Area of Rectangle is : "+r.Area(4,5));
        double z=r.Area(5, 8);
        System.out.println("Area of Rectangle is : "+z);
	}

}
