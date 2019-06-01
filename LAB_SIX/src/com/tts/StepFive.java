package com.tts;

import java.util.Vector;

public class StepFive {
	public static void runExerciseOne() {
		
		// Enter and run the following code to exercise the Vector class:
		
		Vector<String> vecStr = new Vector<>();
		
		vecStr.add("Hello"); 
		vecStr.add("From"); 
		vecStr.add("Linked"); 
		vecStr.add("Lists"); 
		vecStr.add("Do you even"); 
		vecStr.add("know you are using"); 
		vecStr.add("a vector?");
		
		for(String s: vecStr) {
			System.out.println(s); 
		}
		
		int size = vecStr.size();
		int cap = vecStr.capacity();
		
		System.out.println("Size is: " + size); 
		System.out.println("Capacity is: " + cap);
		
		// Notice the output. To provide more output and get an idea of how the capacity is changed, add the additional lines below:

		vecStr.add("more");
		vecStr.add("random");
		vecStr.add("Strings");
		vecStr.add("inserted");
		
		size = vecStr.size(); 
		cap = vecStr.capacity();
		
		System.out.println("Size is: " + size); 
		System.out.println("Capacity is: " + cap);
		
		// Add strings and get the values at the index of size (remember 0 based) and capacity. What happens?
		vecStr.add("adding");
		vecStr.add("even");
		vecStr.add("more");
		vecStr.add("Strings");
		
		String valueOne = vecStr.get(size); // returns adding
		System.out.println("The first value with index of size is : " + valueOne); 
		
		String valueTwo = vecStr.get(cap); // array index out of range: 20
		System.out.println("The second value with index of capacity is :" + valueTwo);
	}
}
