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
		
		/* =====-=====-=====-=====-=====
		   ********** STEP 4 ***********
		   =====-=====-=====-=====-===== */
		
		// Use the premise of the random number between 1 and 100 mentioned earlier in the lab, but initialize the value to 0.
		// Write a while loop that will print out the value and then generate a new value. 
		// The loop should end if either the generated value is greater than 85 or the loop has been executed 20 times.
		System.out.println("While Loop Random Numbers");
		int newRandomNum = 0;
		int count = 0;
		while(newRandomNum <= 85 && count <= 20) {
			System.out.println(newRandomNum);
			newRandomNum = (int)(Math.random() * 100);
			count++;
		}
		
		// Use the premise of the random number between 1 and 100 again, this time initialize two different variables. 
		// Using a do-while loop, calculate and print the value of the two numbers multiplied together and exit the loop 
		// if the result is more than 1000 or the loop has been executed 30 times.
		System.out.println("While Do Loop Random Numbers");
		int numOne = 0;
		int numTwo = 0;
		int result = 0;
		count = 0;
		do {
			numOne = (int)(Math.random() * 100);
			numTwo = (int)(Math.random() * 100);
			result = numOne * numTwo;
			System.out.println(result);
			count++;
		} while(result <= 1000 && count <= 30);
		
		// Write a for loop using the modulus and continue statement that prints out the even numbers between 1-30
		System.out.println("Print out the even numbers using the continue statement between 1-30:");
		for(int x = 1; x <= 30; x++) {
			if(x % 2 != 0) {
				continue;
			}
			System.out.println(x);
		}
		
		// Write nested for loops that will print out the sum of the inner loop up to the index of the outer loop.
		// Do this for an outer loop of 1 to 30.
		System.out.println("Nested Loops Exercise One");
		int innerSum = 0;
		for(int outer = 1; outer < 30; outer++) {
			innerSum = 0;
			for(int inner = 0; inner < outer; inner ++) {
				innerSum += outer;
			}
			System.out.println("Outer: " + outer + ", " + "Inner Sum " + innerSum);
		}
				
		// Modify the behavior so that if the inner sum is greater than 350, the outer loop will print the index 
		// where this threshold was reached and then quit without executing any more iterations.
		
		System.out.println("Nested Loops Exercise Two");
		innerSum = 0;
		for(int outer = 1; outer < 30; outer++) {
			innerSum = 0;
			for(int inner = 0; inner < outer; inner ++) {
				innerSum += outer;
			}
			System.out.println("Outer: " + outer + ", " + "Inner Sum " + innerSum);
			if(innerSum > 350) break;
		}
		
		System.out.println("The makeBoundedRandom function with an output of 4 will return " + makeBoundedRandom(4));
		System.out.println("The makeBoundedRandom function with an output of 14 will return " + makeBoundedRandom(14));
		
		// Write a for loop to generate 20 random numbers with a limit of 1000 and print each one.
		System.out.println("Print 20 random numbers no larger than 1000");
		for(int x = 0; x < 20; x++) {
			System.out.println((int)(Math.random() * 1000));
		}
		
		// Write a loop that generates random numbers, each with a different range of 50 up to 100 and print out each one.
		System.out.println("Print 10 random numbers with a range of 50 up to 100");
		for(int x = 0; x < 10; x++) {
			System.out.println((int)(Math.random() * 50) + 50);
		}
	}
	// Create a function called makeBoundedRandom that takes a single integer input and returns an integer. 
	// The function should check that the input is greater than 10. 
	// If it is less than ten the function should alert the caller to an error by producing a result of -1.
	// If the input is greater than 10 the function should produce a random integer between 1 and that number.
	public static int makeBoundedRandom(int input) {
		if (input > 10) {
			return (int)(Math.random() * input);
		}
		return -1;
	}

}
