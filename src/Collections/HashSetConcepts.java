package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcepts {

	public static void main(String[] args) {
			
		
		HashSet hs = new HashSet();
		hs.add("Peter");
		hs.add(99);
		hs.add(89.99);
		hs.add(99);
		hs.add("Peter");
		hs.add(null);
		
		for(Object total:hs) 
			System.out.println(total);
		
			
			HashSet<Integer> hsi = new HashSet<Integer>();
			hsi.add(77);
			hsi.add(99);
			hsi.add(89);
			hsi.add(98);
			hsi.add(25);
			hsi.add(null);
			
			System.out.println("Size of Hashset : "+hsi.size());

//			
//			for(Object Values:hsi) 
//				System.out.println(Values);
//			
			Iterator it = hsi.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
				
		
	}

}
