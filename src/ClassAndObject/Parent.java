package ClassAndObject;

public class Parent { //if class is used final keyword then Child class/sub class cannot inherit or extends.

//	public static void main(String[] args) {
//		
//
//	}
	
  void Add(int x,int y) { //if we do static this method then child(subclass) cannot use this method (with same parameters) 
	                      //if we do final this method then child(subclass) cannot use this method 	 (with same parameters) 
		                  //overriding is not possible But overloading is possible with both static and final.
		int z= x+y;
		System.out.println("Sum of parent two nos. : "+z);
	}
    
    

	void Addition(int x,int y) {
		int z= x+y;
		System.out.println("Addition of parent two nos. : "+z);
	}
}
