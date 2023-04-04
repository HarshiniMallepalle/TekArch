package JavaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorLoopExample {

	public static void main(String[] args) {
		//int hsi[]={122,13,14,44};

		HashSet<Integer> hsi = new HashSet<Integer>();
		hsi.add(77);
		hsi.add(99);
		hsi.add(89);
		hsi.add(98);
		hsi.add(25);
		hsi.add(null);
		
		Iterator it = hsi.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
