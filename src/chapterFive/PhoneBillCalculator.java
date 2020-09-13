package chapterFive;

import java.util.Scanner;

public class PhoneBillCalculator {
	
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double cost = 0;
		//int minutes = 0;
		double overageRate = 0.25;
		
		double overageCharges = 0;
		
		double subtotal = 0;
		
		int taxRate = 15;
		
		double tax = 0;
		
		double total = 0;
		
		
		overageCharges = minutes * overageRate;
		
		subtotal = cost + overageCharges;
		
		tax = (subtotal * taxRate) / 100;
		
		total = subtotal + tax;
		
		System.out.println("PLAN " + cost);
		System.out.println("OVERAGE COST " + overageCharges);
		System.out.println("SUBTOTAL " + subtotal);
		System.out.println("Tax " + tax);
		System.out.println("TOTAL BILL " + total);

	}
	
	public void getValues() {
		System.out.println("Enter the cost of call package");
		
		double cost = input.nextDouble();
		
		System.out.println("Enter overage minutes");
		
		int minutes = input.nextInt();
	}

}
