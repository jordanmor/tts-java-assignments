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
	}

}
