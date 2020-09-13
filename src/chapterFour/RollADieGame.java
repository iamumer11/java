package chapterFour;

import java.util.Random;
import java.util.Scanner;

public class RollADieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int die = 0;
		int places = 0;
		int spaces = 20;
		
		for (int i=1; i<=5; i++) {
			
			System.out.println("Press enter to roll your die...");
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			input.nextLine();
			
			//input.close();
			
			Random random = new Random();
			die = random.nextInt(7);
			
			spaces = spaces - die; 
			
			System.out.println("You rolled " + die + " and " + spaces + " more to go.. \n");
			
			//rem = rem - die;
			
			places = places + die;
			
		}
		
		if (places == 20) {
			
			System.out.println("Congartulations! You have won the game. You are on place "+places);
		}
		else if (places > 20) {
			
			System.out.println("It is a bug, you advanced to place "+places);
		}
		else {
			
			System.out.println("You lost the game. You are on place "+places);
		}
	}

}
