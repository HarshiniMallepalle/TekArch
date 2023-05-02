package JavaBasics;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringConcepts {

	public static void main(String[] args) {
		//String is non Primitive Data Type
		//String is Class
		//Literal way
		String s1 = "Testing";
		String s2 = "Testing";
		System.out.println("S1 :" +s1);
		System.out.println("S2 :" +s2);
        
		//Object way
		String s3 = new String("Harshi Testing");
		String s4 = new String("S4 :" +"Testing");
		System.out.println("s3 :"+s3);
		System.out.println(s4);
		
		String s5=s2.concat("QA");
		System.out.println("s2 concat is :"+s5);
		System.out.println("After concat S2 is :" +s2);// back to it's value becz String is immutable
		
		System.out.println(s1.hashCode());//location of s1 & s2 is same in string constant pool as both have "Testing".
		System.out.println(s2.hashCode()); 
		System.out.println(s3.hashCode());//Object location is diff even though it is "Testing" it is string memory allocation
		System.out.println(s4.hashCode());
		
		System.out.println(s1==s2);//true as same location
		System.out.println(s2==s3);//false due to different memory locations
		System.out.println(s3==s4);//false 
		
		StringBuffer sen = new StringBuffer("Testing");
		sen.append("QA");
		System.out.println(sen);//StringBuffer can make String mutable.
		
		StringBuilder sentence = new StringBuilder("Testing");
		sentence.append("Java");
		System.out.println(sentence);//StringBuilder can make String mutable.
		
		String s = "Java Basics for Selenium QA";
		System.out.println("Length of String s is :"+s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(5));
		System.out.println(s.endsWith("QA "));//case sensitive too//true
		System.out.println(s.contains("For"));//case sensitive too//false
		System.out.println(s.equals("Java Basics for Selenium QA "));
		//System.out.println(s.isBlank());//it won't take blank place
		System.out.println(s.isEmpty());//it consider blank place also
		System.out.println(s.contains("Jell"));
		System.out.println("*******************");
		System.out.println(s.equalsIgnoreCase("JAVA BASICS FOR SELENIUM QA"));
		System.out.println(s.replace("Se", "Ti"));
		System.out.println(s.substring(6,9));
		System.out.println();
		String[] sArray = s.split(" ");
		for(int i=0;i<sArray.length;i++) {
			System.out.println(sArray[i]);
		}
		   
	}

}
