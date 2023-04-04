package JavaBasics;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);//To enter no. manually in console we use predefined class Scanner and create object
		System.out.println("Enter number is : ");
        int color=s.nextInt(); //In Console all values are string, even we give no. it consists as string so to convert back into no. we use nextInt() 
	
        //int color=5;
        
        String colorName;
        
        switch(color) {
        
        case 1: colorName="Yellow";
        System.out.println("This is Yellow color");
        break;
        case 2: //colorName="Green";
        System.out.println("This is Green color");
        break;
        case 3: colorName="Red";
        System.out.println("This is Red color");
        break;
        case 4: colorName="Blue";
        System.out.println("This is Blue color");
        break;
        case 5: colorName="Orange";
        System.out.println("This is Orange color");
        break;
        case 6: colorName="Pink";
        System.out.println("This is Pink color");
        break;
       default: colorName="White";
        System.out.println("This is White color");
        break;
        

        }
	s.close();
	}

}
