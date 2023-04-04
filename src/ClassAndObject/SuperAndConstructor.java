package ClassAndObject;

class H{       //Parent Class
	H(){
	System.out.println("Parent Default Constructor");	
	}
 H(int i,int j){
	 System.out.println("Parent Two Parameters Constructor:"+i);
	 System.out.println("Parent Two Parameters Constructor:"+j);
 }
 H(int i,int j,int k){
	 System.out.println("Parent Three Parameters Constructor:"+i);
	 System.out.println("Parent Three Parameters Constructor:"+j);
	 System.out.println("Parent Three Parameters Constructor:"+k);
 }
}

class S extends H{   //Child Class
	S(){
		//super();    //1 parameter constructor is called default even without super keyword also.
	System.out.println("Child Default Constructor");	
	}
 S(int i,int j){
	 super(i,j);      //super keyword to call parent class constructors with more then 2 parameters.
	 System.out.println("Child Two Parameters Constructor:"+i);
	 System.out.println("Child Two Parameters Constructor:"+j);
 }
 S(int i,int j,int k){
	 super(i,j,k);
	 System.out.println("Child Three Parameters Constructor:"+i);
	 System.out.println("Child Three Parameters Constructor:"+j);
	 System.out.println("Child Three Parameters Constructor:"+k);
 }
}


public class SuperAndConstructor {

	public static void main(String[] args) {
		S b=new S();	
		S b1=new S(9,5);              //child calls his constructors and parent constructors  
		S b2=new S(2,6,7);

		System.out.println("**************************");
		H c=new H();	     //Parent calls only his constructor
		H c1=new H(9,5);
		H c2=new H(2,6,7);
	}

}
