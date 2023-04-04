package JavaBasics;
import java.io.*;
public class P6DiamondPattern {

	public static void main(String[] args) {
		int number=5,m,n,j;
		for ( m=1; m<=number; m++) {
			for( n=1; n<=number-m;n++) {
			System.out.print(" ");	
			}
			for(j=1; j<=m;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for ( m=4; m>=1; m--) {
			for( n=1; n<=number-m;n++) {
			System.out.print(" ");	
			}
			for(j=1; j<=m;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
      
		
		
	}

}
