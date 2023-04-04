package JavaBasics;

public class ReverseWord {

	public static void main(String[] args) {
		
//		String s = "Java";
//		String sen = "Java is a Programming Language";
//		
//		StringBuilder str =new StringBuilder(s);// reverse word
//		System.out.println(str.reverse());
//
//		StringBuilder reverseSen =new StringBuilder(sen);// reverse sentence
//		System.out.println(reverseSen.reverse());

		
		
	String s = "Java";
	//String s = "Java is a Programming Language.";
	int n=s.length();
	
	for(int i=n-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	   // System.out.print(s.charAt(i));
	}
		
	}

}
