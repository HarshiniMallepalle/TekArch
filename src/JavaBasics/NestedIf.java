package JavaBasics;

public class NestedIf {

	public static void main(String[] args) {
	
		int a = 10  , b = 10 , c = 10;
		if(a==b) {  //If 1st if condition is true then only it goes to 2nd if condition
			System.out.println("a is equal to b ");
			if(b==c) {
				System.out.println("a,b,c are equal");
			}
			
		}

	}

}
