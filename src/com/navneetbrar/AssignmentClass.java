package com.navneetbrar;

import java.util.Scanner;

public class AssignmentClass {

	void comapre(int random)
	{
		
		int i=0;
		while(i<5) {
			
			Scanner userNumber = new Scanner(System.in);
			System.out.println("Pick a number between 1 and 100");
			int	randomNumberGuess=userNumber.nextInt();
			if(randomNumberGuess < 1 || randomNumberGuess > 100 ) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
			else {
				if(i==4) {
				System.out.println("You Lose!");
				System.out.println("The number to guess was: "+random);
					
				}
				else if(random==randomNumberGuess) {
				System.out.println(" “You win!”");
				i=5;		
			}
			else if(random<randomNumberGuess) {
				
				System.out.println("Please pick a lower number");
				i=i+1;	
			}
			else if(random>randomNumberGuess) {
				System.out.println("Please pick a higher number");
				i=i+1;
			  }
			
			}
		}
	}
}
