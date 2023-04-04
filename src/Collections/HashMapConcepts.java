package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	private static final boolean Object = false;

	public static void main(String[] args) {
		
		/*  Map holds key and value pair
		 *  We get the value stored in the Hashmap by passing the key 
		 *  key cannot be duplicate,if  we give duplicate it replaces previous value.
		 *  But value can be duplicate 
		 *  you can have both key and value as null 
		 *  Hashmap will not maintain the insertion order. - memory efficient and faster.
		 */
		
		HashMap<Double,String> hm = new HashMap<Double,String>();
		hm.put(9.1,"Krishna");
		hm.put(66.2,"Sri");
		hm.put(8.9,"Sri");
		hm.put(5.5,"Sam");
		hm.put(55.56, null);
		
		//get method will take the key and return the value
		System.out.println(hm.get(89));
		System.out.println(hm.get(55));//Sam is deleted internally
		System.out.println(hm.size());
			
		//Getting all the values from the Hashmap
		System.out.println(hm.values());
		
		//Getting all the values from the Hashmap
		  for(String values:hm.values()) 
			  System.out.println(values);
		 
		//getting all the keys from the Hashmap
		 System.out.println("Keys***************************");
		  for(Double keys: hm.keySet())
			  System.out.println(keys);
		  
		
			
			  for(Map.Entry<Double,String> value:hm.entrySet()) {
			  System.out.println(value.getKey()+ " "+value.getValue());
			  }
			 
	
		HashMap<String,String> shm = new HashMap<String,String>();
		shm.put("Sri","Krishna");
		shm.put("66","Jeyson");
		shm.put("Ram","Sri");
		shm.put("*","Sam");
		shm.put(null, null);
		
		System.out.println(shm.get("Sri"));
		
		System.out.println("Hetrogeneous*******************");

		HashMap ohm = new HashMap();
		ohm.put("Sri","Krishna");
		ohm.put(66,null);
		ohm.put(99, null);
		ohm.put("Ram","Sri");
		ohm.put(6.89,"Sam");
		ohm.put(null, null);
		ohm.put(null, "New");

		
		 
		  for(Object i:ohm.keySet() ) {
		  
		  System.out.println("Key : "+i); 
		  }
		  for(Object j:ohm.values()) {
			  System.out.println("Value : "+j);
		  } 
		 
//	for(Map.Entry val:ohm.entrySet()) {
//		System.out.println(ohm.getKey()+ " "+ohm.getValue());
//	}
	}
	

}
