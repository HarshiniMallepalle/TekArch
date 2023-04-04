package ClassAndObject;

import Object.Sum;

public class MethodCallingFromDiffClass {
	
public static void main(String[] args) {
	
	/* Calling method from different class,package & project is also available without inheritance. c 
	 * create object of particular class & call
	 * import particular package.class 
	 * if it is different project build path is setup
	 */
	Sum total = new Sum();
	total.addition(50, 90);
	
	
	
	}

}
