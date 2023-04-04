package JavaBasics;
import java.util.Scanner;
public class PersonDetails {

	public static void main(String[] args) {
			
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the Name : ");
      String a=s.next();
      System.out.print("Enter the Age : ");	
	  int b=s.nextInt();
	  System.out.print("Enter the Gender : ");
	  String c=s.next();
		//s.nextLine(); 
	 Scanner s1= new Scanner(System.in);
	  System.out.print("Enter the Address : ");
	  String d=s1.nextLine();
	  	  
	  System.out.println("  ");
	  System.out.println("Name    : "+a);
	  System.out.println("Age     : "+b);
	  System.out.println("Gender  : "+c);
	  System.out.println("Address : "+d);
	 
	  s.close();
	  s1.close();
	}
}
