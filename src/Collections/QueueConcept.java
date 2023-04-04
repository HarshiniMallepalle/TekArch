package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {

	public static void main(String[] args) {
		
		Queue<String> ls = new LinkedList<String>();
		ls.add("Sobha");
		ls.add("Tom");
		ls.add("Peter");
		ls.add("Govinda");
		ls.add("Tom");
		ls.add(null);
		 
		//System.out.println(ls.poll());
		//System.out.println(ls.peek());
		
		int listsz = ls.size();
		for(int i=0;i<listsz;i++) {
			System.out.println(ls.poll());
		}
			
//		Queue hls = new LinkedList();
//		hls.add("Sobha");
//		hls.add(100);
//		hls.add(88.98);
//		hls.add("Govinda");
//		hls.add("Sobha");
//		hls.add(null);
//		 
//		for(Object Value:hls) 
//			System.out.println(Value);
//		

		

	}

}
