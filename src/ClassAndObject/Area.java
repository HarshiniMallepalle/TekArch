package ClassAndObject;

 abstract class Shape {
 abstract void rectangleArea(int length, int width);
 abstract void squareArea(int side);
 abstract void circleArea(double radius);
 }
 public class Area extends Shape{
	void  rectangleArea(int length, int width) {
		 int rarea=length*width;
		 System.out.println("Area of rectangle is : "+rarea);
	}
	void squareArea(int side) {
		int sarea=side*side;
		System.out.println("Area of square is : "+sarea);
	}
		void circleArea(double radius) {
		double carea=radius*radius*22/7;
		System.out.println("Area of circle is : "+carea);
	}  
 
	public static void main(String[] args) {
		Area a= new Area();
		a.circleArea(7);
        a.rectangleArea(5,10);
        a.squareArea(6);

//		Shape b=new Area();
//		b.circleArea(7);
//        b.rectangleArea(15,10);
//        b.squareArea(9);
	}

}
