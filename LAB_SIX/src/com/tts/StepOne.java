package com.tts;

public class StepOne {
	public static void runExercise() {
		
		// Declare a primitive int array and initialize it with `{1, 3, 4, 6, 0, 11}`.  
		// Create a for loop to print out the values.  Use both a traditional `for` and an enhanced `for`.
		int[] array = new int[] {1, 3, 4, 6, 0, 11};
		System.out.println("Print out array values from traditional for loop:");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Print out array values from enhanced for loop:");
		for(int number: array) {
			System.out.println(number);
		}
	}
}
