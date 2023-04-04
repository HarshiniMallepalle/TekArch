package JavaBasics;

public class ArrayMaxAndMinValue {
	
	static void bubbleSort(int[] arr) {
		int b=arr.length;
		int temp=0;
		
      for (int i=0;i<b;i++) {   
		for(int j=1;j<(b-i);j++) {
				
		if(arr[j-1]<arr[j]){   //if(arr[j-1]>arr[j]) ascending order.
			temp=arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
	
		int a[]= {445,299,119,1173};
		int c=a.length;
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+"  ");
}
		System.out.println("");
		System.out.println(" *******  ");
		bubbleSort(a);
		System.out.println("Descending order is : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println(" ");
	
			System.out.println("Maximum Value/1st Larest is : "+a[0]);
			System.out.println("2nd Largest is : "+a[1]);
			System.out.println("3rd Largest is : "+a[2]);
			System.out.println("Minimum Value is : "+a[c-1]);
	}

	
	
}
