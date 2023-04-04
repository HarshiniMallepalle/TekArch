package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcepts {

	public static void main(String[] args) {

		//Sorted according to key in ascending order
		//Duplicate Key is not allowed it replaced old value ex:(A,Tom)=>(A,Krishna)
		//Duplicate value is allowed
		//null Key is not allowed
		//null value is allowed
		//No Heterogeneous
		
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("AB", "Tom");
		tm.put("*", "John");
		tm.put("Sai","Tom");
		tm.put("99","Adison");
		//tm.put(null, "Ram");
		tm.put("A","Mathew");
		tm.put("A","Krishna");
		tm.put("Ele", null);
		
		System.out.println("Key________________");
		for(String kvalue:tm.keySet()) {
			System.out.println(kvalue);
		}
        System.out.println("Value______________");
		for(String value:tm.values()) {
			System.out.println(value);
		}
		
		
		for(Map.Entry both:tm.entrySet()) {
			System.out.println(both.getKey()+" "+both.getValue());
		}
		
		TreeMap<Double,String> dtm = new TreeMap<Double,String>();
		dtm.put(5.69, "Ram");
		dtm.put(2.5, "John");
		dtm.put(89.9,"Tom");
		
			System.out.println("******************************");
			System.out.println(dtm.get(5.69));

//			
//			TreeMap otm = new TreeMap();
//			otm.put(1, "Tom");
//			otm.put(8.99, "John");
//			otm.put("Sai","Tom");
//			otm.put(99,"Adison");
//			
//			System.out.println(otm.get(8.99));
//			
		
		
	}

}
