package ClassAndObject;

public class FinallyConcept {
	public static void main(String[] args) {
		
		try {
		int x=10,y;
		y=x/0;
		System.out.println("Division of two nos. is : "+y);
			
		}catch(Exception e) {
			System.out.println("This is the excetion we found :"+e);
		}finally {
			System.out.println("Important code should be written here.");
		}
		
	}

}
