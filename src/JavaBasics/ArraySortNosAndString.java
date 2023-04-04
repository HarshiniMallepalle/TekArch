package JavaBasics;

import java.util.Arrays;

public class ArraySortNosAndString {

	public static void main(String[] args) {
	String a[]= {"ak","ba","kl","ba","bb","jk"};
	int c[]= {1,5,2,7,2,5};
	int n=a.length;
	Arrays.sort(a);
	Arrays.sort(c);
	for(int i=0;i<n;i++) {
		
	System.out.print(a[i]+"...");

	System.out.println(c[i]);
	}
	}
	
}
