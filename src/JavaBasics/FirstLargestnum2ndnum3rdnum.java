package JavaBasics;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class FirstLargestnum2ndnum3rdnum {

	public static void main(String[] args) {
		
		/*int arr[] = new int[3];
		arr[0]=99;
		arr[1]=199;
		arr[2]=59;
		
	    Integer arr[] = {51,99,78};
	   */
		
		
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the size of Array :");
	   int n=s.nextInt();
	   Integer a[]=new Integer[n];  // Integer Keyword instead of int Keyword when we use Collections class dot reverseOrder() method orelse error comes.
	   System.out.println("Enter the values : ");
	   for(int i=0; i<n; i++) {
		  a[i]= s.nextInt();
	   }
	      
	   
		//Arrays.sort(a); // ascending order .
        Arrays.sort(a,Collections.reverseOrder());

		System.out.println("Descending order is :");
		
		//for(int Value :a) {
		for(int j=0;j<n;j++) { 
		System.out.print(a[j]+"  ");
		}
		System.out.println(" ");
		System.out.println("1st Largest no. is : "+a[0] );
		System.out.println("2nd Largest no. is : "+a[1] );
		System.out.println("3rd Largest no. is : "+a[2] );
		 
		
       s.close();
	}

}
