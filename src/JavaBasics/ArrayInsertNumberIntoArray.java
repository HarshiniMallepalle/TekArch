package JavaBasics;

public class ArrayInsertNumberIntoArray {

	public static void main(String[] args) {
		int n[]= new int[6];
		n[0]=9;
		n[1]=19;
		n[3]=8;
		n[4]=69;
		n[5]=55;

		
		int m=n.length;
		
		 for(int i=0; i<m; i++) {
			
			if(i==2) {
				n[2]=100;
			}
			
			System.out.println("Print nos. from Array:"+n[i]);
		 } 

	}

}
