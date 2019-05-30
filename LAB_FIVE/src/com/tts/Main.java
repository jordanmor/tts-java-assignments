package com.tts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java program to print out all the prime numbers between 1 and 100
		int limit = 100;
		
	    System.out.println("Print prime numbers from 1 to " + limit);
    	for(int number = 2; number <= limit; number++){
          //print prime numbers only
          if(isPrime(number)){
              System.out.println(number);
          }
	    } 
    	
    	/* 
    	 * Students who enter college in a year that is a prime number and graduate, four years later, 
    	 * in a year that is also a prime number are considered in a Prime Class. 
    	 * For example, the class of 1997 is a Prime Class as both 1993 and 1997 are prime numbers. 
    	 * Write a program to compute and print out all the prime classes between 1900 and 2100.
    	 */ 
    	
    	int start = 1900;
    	int end = 2100;
    	System.out.println("Print Prime Classes between " + start + " and " + end);
    	
    	for(int i = start; i<=end; i++){
            // If the year a student graduates is prime, then check whether the number 
    		// four numbers before (the year the student entered college) is also prime.
    		// If both these years are prime, print out the Prime Class (the year of graduation)
            if(isPrime(i)){
            	if(isPrime(i - 4)) {
                System.out.println(i); // 1997, 2003, 2087
            }
           }
  	    }
	}
	
	// Write and use a function **isPrime()** to tell if a number is prime or not.
	// Checks if a number is a prime number. Returns a boolean.
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
           if(number % i == 0){
               return false; // Number is divisible so its not prime
           }
        }
        return true; // Number is prime now
    }

}
