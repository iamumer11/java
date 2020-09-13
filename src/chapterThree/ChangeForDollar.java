
package chapterThree;

import java.util.Scanner;

public class ChangeForDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pennies = 0;
		int nickels = 0;
		int dimes = 0;
		int quarters = 0;
		int cents = 0;
		
		int dollar = 0;
		int remainder = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number of pennies you have:");
		pennies = input.nextInt();
		
		System.out.println("Enter the number of nickels you have:");
		nickels = input.nextInt();
		
		System.out.println("Enter the number of dimes you have:");
		dimes = input.nextInt();
		
		System.out.println("Enter the number of quarters you have:");
		quarters = input.nextInt();
		
		input.close();
		
		
		cents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);
		
		dollar = cents / 100;
    	remainder = cents % 100;
		
		if (dollar == 1 && remainder == 0) {
			
			System.out.println("Congratulations! You have exactly " +dollar+ "$. You have won the game.");
		}
		else if (dollar == 1 && remainder != 0) {
			
			System.out.println("It's more than 1$. You went over by " +remainder+ " cents.");
		}
		else if (dollar > 1 && remainder == 0) {
			
			int excess = dollar - 1;
			System.out.println("It's more than 1$. You went over by " +excess+ "$.");
		}
		else if (dollar > 1 && remainder != 0) {
			
			int excess = dollar - 1;
			System.out.println("It's more that 1$. You went over by " +excess+ "$ and " +remainder+ " cents.");
		}
		else if (dollar == 0) {
			
			int lack = 100 - remainder;
			System.out.println("It's less than 1$. You went under by " +lack+ " cents");
		}
		
	}

}
