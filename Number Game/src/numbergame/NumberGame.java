package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	
	private static final Random random=new Random();
	
	private static int randomnumber;
	private static int userGuess;


	public static void main(String[] args) {
		
		randomnumber=random.nextInt(100)+1;
		
//		Game Logic 
		
//		prompt the user enter a number /guess
		
		while(true) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Guess a Number between 1 and 100");
		
		userGuess=scan.nextInt();
		
//		Check if the guess is correct
		
		if(userGuess==randomnumber) {
			
			System.out.println("Congratulations , You Guessed the Number Correct");
			break;
			
		}
		
		else if(userGuess < randomnumber) {
			
			System.out.println("Sorry, that is too Low , Please try Again");
		}
		
        else if(userGuess > randomnumber) {
			
			System.out.println("Sorry, that is too High , Please try Again");
		}
		
        else {
        	
        	System.out.println("Please Enter a Valid Number...");
        		
             }	
	   }
   }
}

