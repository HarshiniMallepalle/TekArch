package JavaBasics;

public class ArrayRemoveElementFromArray {

	public static void main(String[] args) {
		int n[]= {10,5,6,8,3,7};
		int m=n.length;
		
		 for(int i=0; i<m; i++) {
			
			if(i==3 ) {
				continue;
			}
			
			System.out.println("Print nos. from Array:"+n[i]);
		 } 

	}

}
