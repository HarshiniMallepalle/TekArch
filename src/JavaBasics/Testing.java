package JavaBasics;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String a[] = new String[] {"Sam", "Claudia", "Josh", "Toby", "Donna"};
	        int b[] = new int[] {11, 2, 33, 4, 5};

	        for(int n=0;n<5;n++)
	        {
	            System.out.print (a[n] + "...");
	            System.out.print (b[n]);
	        }
	        System.out.println (" ");

	        java.util.Arrays.sort(a);
	        java.util.Arrays.sort(b);

	        for(int n=0;n<5;n++)
	        {
	            System.out.print (a[n] + "...");
	            System.out.println (b[n]);
	}

}
}
