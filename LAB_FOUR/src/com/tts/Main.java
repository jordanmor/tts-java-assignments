package com.tts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* =====-=====-=====-=====-=====
		   ********** STEP 1 ***********
		   =====-=====-=====-=====-===== */
		
	    /*
	     * Add a series of `if() statements that will check and output the following:
	     * 	- if 16 or older, print "You are old enough to drive"
	     *  - if 18 or older, print "You are old enough to vote"
	     *  - if 21 or older, print "You are old enough to drink"
	     *  - if 35 or older, print "You are old enough to be President"
	     *  - if 55 or older, print "You can join AARP"
	     *  - if 67 or older, print "You can starting drawing Social Security"
	     * The output should be progressive
	     * Add else statements to each test that prints the negative of each condition.
	     * In this case there should be 6 statements each run combining both positive and negative responses depending on age.
	     */
		
	    // scanner reads input from the command line through various methods
	    Scanner scanner = new Scanner(System.in);
	  
	    // prompt and read a string
	    System.out.print("Enter your name: ");
	    String username = scanner.next();
	  
	    // prompt and read an int
	    System.out.print("Enter your age: ");
	    int age = scanner.nextInt();
	  
	    System.out.println(String.format("Hello %s, your age is %d", username, age));
	    
	    if(age > 16) {
	    	 System.out.println("You are old enough to drive.");
	    } else {
	    	System.out.println("You are not old enough to drive.");
	    }
	    
	    if(age > 18) {
	    	 System.out.println("You are old enough to vote.");
	    } else {
	    	System.out.println("You are not old enough to vote.");
	    }
	    
	    if(age > 21) {
	    	 System.out.println("You are old enough to drink.");
	    } else {
	    	System.out.println("You are not old enough to drink.");
	    }
	    
	    if(age > 35) {
	    	 System.out.println("You are old enough to be President.");
	    } else {
	    	System.out.println("You are not old enough to be President.");
	    }
	    
	    if(age > 55) {
	    	 System.out.println("You can join AARP.");
	    } else {
	    	System.out.println("You can not join AARP.");
	    }
	    
	    if(age > 67) {
	    	 System.out.println("You can start drawing Social Security.");
	    } else {
	    	System.out.println("You can not start drawing Social Security.");
	    }
	    
		/* =====-=====-=====-=====-=====
		   ********** STEP 2 ***********
		   =====-=====-=====-=====-===== */
	    
	    /* To the statements above add more questions:
	     * - Prompt the user to enter 'E', 'U', or 'S' for employment status - employed, unemployed, or student.
	     * - Do you have a car, truck, suv, or do not own a vehicle? (make up your own one letter responses for this).
	     * Using `switch` statements, print out a sentence for each of the choices above - such as "You are employed" and "You own an SUV".
	    */
	    
	    // prompt and read a string
	    System.out.print("What is your employment status? Enter E for Employed, U for Unemployed or S for student: ");
	    String employmentStatus = scanner.next();
	    
	    System.out.print("What vehicle do you own? Enter C for Car, T for Truck, S for SUV or N for None: ");
	    String vehicleStatus = scanner.next();
	    
	    switch(employmentStatus) {
	    	case "E":
	    		System.out.println("You are employed.");
	    		break;
	    	case "U":
	    		System.out.println("You are unemployed.");
	    		break;
	    	case "S":
	    		System.out.println("You are unemployed.");
	    		break;
	    }
	    
	    switch(vehicleStatus) {
    	case "C":
    		System.out.println("You own a car.");
    		break;
    	case "T":
    		System.out.println("You own a truck.");
    		break;
    	case "S":
    		System.out.println("You own an SUV.");
    		break;
    	case "N":
    		System.out.println("You do not own a vehicle.");
    		break;
	    }
	    
	}

}
