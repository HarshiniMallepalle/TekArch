package Collections;

import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.add("Sobha");
		st.add("Tom");
		st.add("Peter");
		st.add("Govinda");
		st.add("Tom");
		st.add(null);
		 
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		
//		int stacksz = st.size();
//		for(int i=0;i<stacksz;i++) {
//			System.out.println(st.pop());
//		}

		System.out.println("***************************************************");
		Stack ls = new Stack();
		ls.add("Sobha");
		ls.add(25);
		ls.add(66.78);
		ls.add("Govinda");
		ls.add("Sobha");
		ls.add(null);
		 
		//System.out.println(ls.poll());
		//System.out.println(ls.peek());
		
		int listsz = ls.size();
		for(int i=0;i<listsz;i++) {
			System.out.println(ls.pop());
		}
	}

}
