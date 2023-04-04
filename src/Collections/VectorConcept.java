package Collections;

import java.util.*;

public class VectorConcept {

	public static void main(String args[]) {
		// Create a vector
		Vector vec = new Vector();
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Tiger");
		vec.add(99.9);
		// Adding elements using addElement() method of Vector
		vec.addElement(null);
		vec.addElement("Cat");
		vec.addElement("Deer");

		System.out.println(vec.size());
		System.out.println(vec);
	}
}
