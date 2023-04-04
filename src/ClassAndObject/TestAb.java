package ClassAndObject;

 abstract class AbstractA { //1.The public type AbstractA must be defined in its own file
	
		  abstract void m1();
		 
		 void m2(){ 
			 System.out.println("One"); 
			 }
		 } 

		 class B1 extends AbstractA { //2.only one public class for file.java
			                         //3.The type B1 must implement the inherited abstract method AbstractA.m1()
			 void m1() {
				 System.out.println();
			 }
			 void m2(){ 
				 System.out.println("Two");
				 } 
			 } 
		 public class TestAb { 
			 public static void main(String[] args) { 
				 B1 b = new B1();
				 b.m2(); 
				 }
			 }

	


