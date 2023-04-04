package Collections;

import java.util.TreeSet;

public class TreeSetConcepts {

	public static void main(String[] args) {

		TreeSet<Integer> tsstr = new TreeSet<Integer>();
		tsstr.add(77);
		tsstr.add(99);
		tsstr.add(89);
		tsstr.add(98);
		tsstr.add(25);
		//tsstr.add(null);
		for(Object Values:tsstr) 
			System.out.println(Values);
	
		

		TreeSet<String> tsstring = new TreeSet<String>();
		tsstring.add("Sobha");
		tsstring.add("Tom");
		tsstring.add("Peter");
		tsstring.add("Govinda");
		tsstring.add("Tom");
		
		System.out.println("Size of Treeset : "+tsstring.size());

		for(Object Value:tsstring) 
			System.out.println(Value);
		
		//Tree is Homogenous
		//Exception: java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer 
//		TreeSet tsg = new TreeSet();
//		tsg.add("Sobha");
//		tsg.add(99);
//		tsg.add("Peter");
//		tsg.add(58.90);
//		tsg.add("Tom");
//	
//		for(Object Value:tsg) 
//			System.out.println(Value);
//			
			
	}

}
