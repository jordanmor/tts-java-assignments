package com.tts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* =====-=====-=====-=====-=====
		   ********** STEP 1 ***********
		   =====-=====-=====-=====-===== */
		
		// Create a random integer value between 1 and 100 using the Math.random() function
		int randOne = (int)(Math.random() * 100);
		
		//  Perform the following evaluations using multiple if statements:
		System.out.println("Multiple if statements output:");

		// If greater than 90 print "Really big number"
		if(randOne > 90) {
			System.out.println("Really Big Number");
		}
		// If the number is greater than 70 print the string "Big Number".
		if(randOne > 70 && randOne < 90) {
			System.out.println("Big Number");
		}
		// If equal to 50 print "Really average number"
		if(randOne == 50) {
			System.out.println("Really Average Number");
		}
		// If the number is in between 40 and 70, or equal to 40 or 70, print the string "Medium Number";
		if(randOne >= 40 && randOne <= 70 && randOne != 50) {
			System.out.println("Medium Number");
		}
		// If the number is less than 40 print the string "Small Number".
		if(randOne >= 15 && randOne < 40) {
			System.out.println("Small Number");
		}
		// If less than 15 print "Really small number"
		if(randOne < 15) {
			System.out.println("Really Small Number");
		}

		// Write the same tests as above but using an if-else statement
		System.out.println("Else-if statements output:");
		if(randOne > 70) {
			if(randOne > 90) {
				System.out.println("Really Big Number");
			} else {
				System.out.println("Big Number");				
			}
		}
		else if(randOne >= 40 && randOne <= 70) {
			if(randOne == 50) {
				System.out.println("Really Average Number");
			} else {
				System.out.println("Medium Number");				
			}
		}
		else if(randOne < 40) {
			if(randOne < 15) {
				System.out.println("Really Small Number");
			} else {
				System.out.println("Small Number");				
			}
		}
		
		// Could the above if statements be written with an equivalent switch statement?
		// Answer yes, but...  switch works on a specific number of tests and not generic boolean expressions
		// Since this would involve writing multiple sets of matches for every value, an if statement is much more efficient
		
		/* =====-=====-=====-=====-=====
		   ********** STEP 2 ***********
		   =====-=====-=====-=====-===== */
		
		// Write a for loop that prints out the numbers 1-30.
		System.out.println("Prints out the numbers 1-30:");
		for(int x = 1; x <= 30; x++) {
			System.out.println(x);
		}
		// Write a for loop that prints out the even numbers 1-30
		System.out.println("Prints out the even numbers between 1-30:");
		for(int x = 1; x <= 30; x++) {
			if(x % 2 == 0) {
				System.out.println(x);				
			}
		}
		
		// Write a loop that counts down from 20 to 0
		System.out.println("Count down from 20 to 0:");
		for(int x = 20; x >= 0; x--) {
			System.out.println(x);
		}
		
		// Write a for loop with an && operator that contains two statements
		for (int x = 1, y = 1; x < 20 && y < 50; x++, y += 4)
		{
		  System.out.println("X is: " + x + ", y is: " + y);
		}
		
		/* =====-=====-=====-=====-=====
		   ********** STEP 3 ***********
		   =====-=====-=====-=====-===== */
		
		// Declare a very long String of at least 10 words
		 String str = "This is a very long and completely meaningless string that must serve a higher purpose.";
		 
		// Write a statement using an enhanced for loop that will print out each character on its own line. 
		// Note that the enhanced for loop will not work on a String so you will have to consult the documentation 
		// on how to get an iterable collection of characters from a string.
		 
		char[] charArray = str.toCharArray();
		for(char character: charArray ) {
			System.out.println(character);
		}
		
		// Use the looping structure from above and alter the process just a bit. For each vowel, 
		// print the capital form of it instead of the lower case. Try writing the logic with both 
		// an if statement and then a switch statement. Which is easier?
		
		// The for loop is definitely more efficient solution.
		System.out.println("For Loop Uppercase Vowels");
		for(char character: charArray ) {
			if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
				int UpperChar = (int) character - 32;
				System.out.println((char) UpperChar);
			} else {
				System.out.println(character);				
			}
		}
		
		System.out.println("Switch Uppercase Vowels");
		for(char character: charArray ) {
			switch(character) {
				case 'a':
					int UpperChar = (int) character - 32;
					System.out.println((char) UpperChar);
					break;
				case 'e':
					UpperChar = (int) character - 32;
					System.out.println((char) UpperChar);
					break;
				case 'i':
					UpperChar = (int) character - 32;
					System.out.println((char) UpperChar);
					break;
				case 'o':
					UpperChar = (int) character - 32;
					System.out.println((char) UpperChar);
					break;
				case 'u':
					UpperChar = (int) character - 32;
					System.out.println((char) UpperChar);
					break;
				default:
					System.out.println(character);
			}
		}
		
	}

}
