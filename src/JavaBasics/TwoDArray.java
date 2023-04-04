package JavaBasics;

public class TwoDArray {

	public static void main(String[] args) {
		 String x[][]=new String[3][5];
		 System.out.println("Rows :"+x.length);
		 System.out.println("columns :"+x[0].length);
         x[0][0]="Hi";
         x[0][1]="Hello";
         x[0][2]="Ram";
         x[0][3]="Kittu";
         x[0][4]="Saanvi";
         
         x[1][0]="Hey";
         x[1][1]="Sita";
         x[1][2]="Srini";
         x[1][3]="Pranav";
         x[1][4]="Cute";
         
         x[2][0]="I";
         x[2][1]="Love";
         x[2][2]="Sai";
         x[2][3]="Ram";
         x[2][4]="Krishna";
         
         for(int i=0; i<x.length; i++) {
        	 for(int j=0; j<x[0].length; j++) {
        		 System.out.print("   "+x[i][j]);
        	 }
         System.out.println(" ");
         }
	}

}
