package ClassAndObject;

public class TestCommand {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		char c = args[2].charAt(0);
		if (c=='h') 
		 System.out.println(x+y);	
		else if(c=='s') 
			System.out.println(x-y);
		else if(c=='p')
			System.out.println(x*y);
		else 
			System.out.println("Value of x : "+x+"  Value of y : "+y);
		

	}

}
