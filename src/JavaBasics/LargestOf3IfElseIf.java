package JavaBasics;

import java.util.Scanner;

public class LargestOf3IfElseIf {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=s.nextInt();
		System.out.println("Enter the value of b:");
		b=s.nextInt();
		System.out.println("Enter the value of c:");
		c=s.nextInt();
		
		//int a=90, b=50 ,c=60;
		if(a>c & a>b) {
			System.out.println("a is the largest");
		}else if(b>c) {
			System.out.println("b is the largest");
		}else {
			System.out.println("c is the largest");
		}
			
      s.close();
	}

}
