package JavaBasics;

public class ArrayContainsSpecificValueAndIndex {

	public static void main(String[] args) {
	int a[]= {5,9,7,6,3};
	int b=a.length;
	int key=3;
	System.out.println(key+" Value of Key index is : "+Specific(a,key));
		
	}

	public static int Specific(int arr[],int key) {
		
	int b=arr.length;
	for(int i=0;i<b;i++) {
		if(arr[i]==key) {
	
			System.out.println("Array Contains Specific Value : "+key);
			return i;
		}
	}
	return -1;
	}

}
