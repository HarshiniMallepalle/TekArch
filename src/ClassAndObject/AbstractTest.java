package ClassAndObject;

public class AbstractTest {
	
	AbstractTest(){
		System.out.println("Test Constructor");
	}

	public static void main(String[] args) {
		AbstractChild ab = new AbstractChild();
         ab.div(90,3);
         ab.sum();
         ab.toPrint();
       
         System.out.println("**********");
         AbstractParent ac = new AbstractChild(); // as AbstractParent is abstract class we cannot create object so we use child class AbstractChild
         ac.sum();
         ac.toPrint();
         System.out.println("************************");
         AbstractTest ad = new AbstractTest();
        
           
	}

}
