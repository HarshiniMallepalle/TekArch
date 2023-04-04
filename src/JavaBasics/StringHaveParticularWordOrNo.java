package JavaBasics;

public class StringHaveParticularWordOrNo {

	public static void main(String[] args) {
		//Check the given word is present in a give String .

		String S = "I am learning QA automation testing";
		String word ="QA";
		
		
		System.out.println("Is QA present in,'I am learning QA automation testing' : "+S.contains(word));
	}

}
