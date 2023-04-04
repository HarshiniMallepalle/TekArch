package ClassAndObject;

public class MainMethodOverloading {

	public static void main(String[] args) {
     System.out.println("Main Method -----1");
     //main("SriRam");
     //main(99);
     main(89,14);
	}
	public static void main(String args) {
	     System.out.println("Main Method -----2");
		}
	public static void main(int x) {
	     System.out.println("Main Method -----3");
		}
	public static void main(int x,  int y) {
	     System.out.println("Main Method -----4");
		}

}
