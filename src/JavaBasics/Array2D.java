package JavaBasics;

public class Array2D {

	public static void main(String[] args) {
	int a[][]= {{11, 12, 13, 14, 15},{31,32,33,34,35}};
    int b[][]= {{21, 22, 23, 24, 25},{11,12,13,14,15}};
	int c[][]=new int[2][5];
	
	System.out.println("Array a");
	for(int i=0;i<2;i++) {
		for(int j=0;j<5;j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println("");
	}
	System.out.println("Array b");
	for(int i=0;i<2;i++) {
		for(int j=0;j<5;j++) {
			System.out.print(" "+b[i][j]);
		}
		System.out.println("");
	}
	System.out.println("Array of c");
	
	 for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				 c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println("");
	}
	}
}
