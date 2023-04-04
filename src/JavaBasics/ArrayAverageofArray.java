package JavaBasics;

public class ArrayAverageofArray {

	public static void main(String[] args) {
		int a[]= {5,9,3,6,1};
		int b=a.length;
		double sum=0;
		double avg=0;
		for(int i=0;i<b;i++) {
			 sum = a[i]+sum;
		avg=sum/b;
		}
		System.out.println(sum);
		System.out.println(avg);
		
		
	}

}
