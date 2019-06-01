package com.tts;

import java.util.LinkedList;

public class StepFour {
	public static void runExerciseOne() {
		
		// Study the code below to become familiar with the usage of the LinkedList class
		
		LinkedList<String> strList = new LinkedList<>();
		
		strList.add("Hello"); 
		strList.add("From"); 
		strList.add("Linked"); 
		strList.add("Lists"); 
		strList.add("Do you even"); 
		strList.add("know you are using"); 
		strList.add("a list?");
		
		for(String s: strList) {
			System.out.println(s);
		}
		
		System.out.println("First list entry is: " + strList.getFirst()); 
		System.out.println("List list entry is: " + strList.getLast());
		System.out.println("Size is: " + strList.size());
	}
}
