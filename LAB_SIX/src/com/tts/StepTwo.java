package com.tts;

import java.util.ArrayList;
import java.util.Scanner;

public class StepTwo {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void runExerciseOne() {
		// Create an `ArrayList` of Strings.  Enter into a loop and prompt the user to enter a simple word, or "QUIT" to exit the loop.  
		// For each word, add it to the list of Strings.  Once the user enters "QUIT" print out the entire list entered by the user.
		
		ArrayList<String> wordArrList = new ArrayList<>();
		
		boolean repeat = true;
		do {
			System.out.print("Please enter a simple word or enter QUIT to exit program: ");
			
			if(scanner.hasNext("QUIT")) {
				scanner.next();
				repeat = false;
				if(!wordArrList.isEmpty()) {
					System.out.println(wordArrList.toString());
				}
			} else {
				wordArrList.add(scanner.next());
			}
			
		} while(repeat);
	}
	
	public static void runExerciseTwo() {
		
		// Change the above code to have the user search for a word they just entered.  
		// Once they type "QUIT" to exit the loop, do not print the loop, but ask them to search for a word in the list.  
		// With their response, use the `contains()` method to search the ArrayList and print whether or not the list contains their word.
		
		ArrayList<String> wordArrList = new ArrayList<>();

		String word;
		boolean repeat = true;
		do {
			System.out.print("Please enter a simple word or enter QUIT to exit program: ");
			
			if(scanner.hasNext("QUIT")) {
				scanner.next();
				repeat = false;
				System.out.print("Please search for a word in your list: ");
				if(!wordArrList.isEmpty()) {
					word = scanner.next();
					if(wordArrList.contains(word)) {
						System.out.println("Your list contains the word " + word);
					} else {
						System.out.println("Your list does not contain the word " + word);
					}
				} else {
					System.out.println("You have not entered any words into your list");
				}
			} else {
				wordArrList.add(scanner.next());
			}
			
		} while(repeat);
	}
}
