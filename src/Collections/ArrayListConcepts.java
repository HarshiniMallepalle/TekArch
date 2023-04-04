package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		//Add values to Collection - Arraylist
		// Collections can hold Heterogeneous data 
		
		// It maintains insertion order. 
		// It can hold duplicate value. 
		// It holds Null value
		// Remove by index
		// Retrieve by index
		// Length of arraylist is .size
				
		
		ArrayList arrlist = new ArrayList();
       arrlist.add("Sobha");
       arrlist.add(9);
       arrlist.add(66.66);
       arrlist.set(0,"Tom");//to replace value
       arrlist.add("Sobha");
       arrlist.remove(1);
       arrlist.add("Sobha");
       arrlist.add(null);
       arrlist.add(null);
       
       Iterator itr = arrlist.iterator();
       while(itr.hasNext()) {
      	   System.out.println(itr.next());
         }
       
//       for(int i=0; i<ar.size();i++) {
//    	   System.out.println(ar.get(i));
//       }

//       for(Object num:ar) {
//       System.out.println(num);
//	}
      
      
    
      
     
       
       
	}
}
