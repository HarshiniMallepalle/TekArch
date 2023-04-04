package JavaBasics;

public class FactorialByRecursion {

	public static void main(String[] args) {
		int n=5;
		long factorial=fact(n);
		System.out.println("  "+factorial);
		
	}
		public static long fact(int n) {
			
			if (n>=1) {
				return n*fact(n-1);
			}
			else {
				return 1;
			}
				
		

	}

}
