package JavaBasics;

import java.util.Scanner;

public class MNCRevisedSalary {

	public static void main(String[] args) {
		double revisedSalary;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Work Experience of Employee :");
		int exp = s.nextInt();
		System.out.println("Enter the oldSalary :");
		Double oldSalary = s.nextDouble();
		System.out.println("Enter the no. of rewards :");
		Double reward = 1000*s.nextDouble();
		
		switch(exp) {
		
		case 3,4,5:
			revisedSalary = oldSalary+(oldSalary*10/100)+reward ;
			System.out.println("Employee's Revised Salary is : "+revisedSalary);
			break;
			
		case 6,7,8,9:
			revisedSalary = oldSalary+(oldSalary*15/100)+reward ;
			System.out.println("Employee's Revised Salary is : "+revisedSalary);
			break;
			
		case 10,11,12,13,14,15,16,17,18,19,20:
			revisedSalary = oldSalary+(oldSalary*20/100)+reward ;
			System.out.println("Employee's Revised Salary is : "+revisedSalary);
			break;
			
		default :
			revisedSalary = oldSalary+(oldSalary*25/100)+reward ;
			System.out.println("Employee's Revised Salary is : "+revisedSalary);
			break;
		}
		
         s.close();
	}
}
