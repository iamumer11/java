package chapterTwo;

import java.util.Scanner;

public class GrossPayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	        
	        int hoursWorked;
	        int payRate;
	        int result;
	        
	        System.out.println("Enter the number of hours worked.");
	        hoursWorked = input.nextInt();
	        
	        System.out.println("Enter pay rate per hour.");
	        payRate = input.nextInt();
	        
	        input.close();
	        
	        result = hoursWorked * payRate;
	        
	        System.out.println("The gross pay of the person is "+result+" bucks.");  //14.90138642880658
	}

}
