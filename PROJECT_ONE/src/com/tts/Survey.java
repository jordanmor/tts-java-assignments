package com.tts;

import java.util.Objects;
import java.util.Scanner;

public class Survey {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void start() {

		System.out.println("Please enter your name: ");
		String name = scanner.next();
		System.out.println("Hello " + name);
		
		boolean repeat = false;
		
		System.out.print("Do you wish to continue to the interactive portion? (yes,no):");
		String response = scanner.next().toLowerCase();
		if(!Objects.equals(response, "yes") && !Objects.equals(response, "y")) {
			System.out.println("Please return later to complete the survey.");
			scanner.close();
		} else {
			do {
				String favoritePet = askQuestionStringOutput("What is your favorite pet?");
				int petAge = askQuestionIntegerOutput("What is the age of your pet?");
				int luckyNumber = askQuestionIntegerOutput("What is your lucky number?");
				int carYear = askQuestionIntegerOutput("What is two-digit model year of their car?");
				String actorName = askQuestionStringOutput("What is the first name of the your favorite actor or actress?");
				int chosenNumber = askQuestionIntegerOutput("Enter a random number between 1 and 50.");
				
				generateValues(favoritePet, petAge, luckyNumber, carYear, actorName, chosenNumber);
				
				System.out.println("Would like to answer questions to generate another set of numbers? (yes,no):");
				response = scanner.next().toLowerCase();
				if(Objects.equals(response, "yes") || Objects.equals(response, "y")) {
					repeat = true;
				} else {
					repeat = false;
					System.out.println("Thank you for participating in this survey.");
					scanner.close();
				}
			} while(repeat);
		}
	}
	
	public static String askQuestionStringOutput(String question) {
		System.out.print(question + ":");
		return scanner.next();
	}
	
	public static int askQuestionIntegerOutput(String question) {
		System.out.print(question + ":");
		return scanner.nextInt();
	}
	
	public static int generateValues(String favoritePet, int petAge, int luckyNumber ,int carYear, String actorName, int chosenNumber) {
		int sum = 0;
		final int MAX_RANDOM_NUMBER = 65;
		final int MAX_MAGIC_BALL = 75;
		int randomNumOne = (int)(Math.random() * 12);
		int randomNumTwo = (int)(Math.random() * 15);
		int randomNumThree = (int)(Math.random() * 18);
		
		int magicBall = luckyNumber * randomNumOne;
		if(magicBall > MAX_MAGIC_BALL) {
			magicBall -= MAX_MAGIC_BALL;
		}
		
		// Lottery Number 1
		// Find the 3rd letter of their favorite pet. Convert that character value to an integer value.		
		int lotteryNumOne = (int)favoritePet.charAt(2);
		
		// Lottery Number 2
		// Use the two digit model year of their car and add their lucky number to it.
		int lotteryNumTwo = carYear + luckyNumber;
		
		// Lottery Number 3
		// Use the random number between 1 and 50, subtracting one of the generated random numbers.
		int lotteryNumThree = chosenNumber - randomNumTwo;
		
		// Lottery Number 4
		// Convert the last letter of their favorite actor/actress to an integer and use that value
		int lotteryNumFour = (int)actorName.charAt(actorName.length() - 1);
		
		// Lottery Number 5
		// Pet age + lucky number
		int lotteryNumFive = petAge + luckyNumber;
		
		// Magic Ball
		
		return sum;
	}
}
