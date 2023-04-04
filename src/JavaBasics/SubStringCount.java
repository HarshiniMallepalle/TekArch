package JavaBasics;

public class SubStringCount {

	public static void main(String[] args) {
//		String s = "I Love Java Programing";
//		String ss = "o";
//		String s1 = s.replace(" ","");
//		System.out.println(s1);
//		int x = s1.indexOf(ss);
//		System.out.println("First index : "+x);
//		int y=s1.lastIndexOf(ss);
//		System.out.println("Second index :"+y);
//		int z = y-(x+1);
//		System.out.println("No. of characters in between the occurance :"+z);
//		
		//Different way
		String str = "I Love Java Programing";
		String str2 = "o";
		String str1 = str.replace(" ","");
		System.out.println(str1);
		String str3[]=str1.split(str2);
		for(int i=0; i<str3.length;i++)
			System.out.println(str3[i]);
		int len =str3[1].length();
		System.out.println("No. of characters in between the occurance :"+len);
		
		
	}

}
