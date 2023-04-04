package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestObjectDataType {

	public static void main(String[] args) {
	
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sobha");
		ar.add(null);
		ar.add("Tom");
		ar.add("John");
		
		for(String str:ar) {
			System.out.println(str);
			}
		
			
			ArrayList<Integer> ari = new ArrayList<Integer>();
            ari.add(99);
            ari.add(992);
            ari.add(79);
            ari.add(null);
            
            Iterator<Integer> itr = ari.iterator();
            while(itr.hasNext()) {
            	System.out.println(itr.next());
            }

            
		}

	

}
