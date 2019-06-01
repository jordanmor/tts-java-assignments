package com.tts;

import java.util.HashMap;

public class StepSix {
	public static void runExerciseOne() {
		// For Hashmaps, enter the following code and run the program:
		
		HashMap<Integer, String> hmIdVal = new HashMap<>();
		
		hmIdVal.put(1, "Value 1"); 
		hmIdVal.put(2, "Value 2"); 
		hmIdVal.put(3, "Value 3"); 
		hmIdVal.put(4, "Value 4"); 
		hmIdVal.put(8, "Value 8");
		
		String val8 = hmIdVal.get(8); 
		System.out.println("Value at 8: " + val8);
		String val5 = hmIdVal.get(5); 
		System.out.println("Value at 5: " + val5);
		String val6 = hmIdVal.getOrDefault(6, "No Value Found"); 
		System.out.println("Value at 6: " + val6);
		
		HashMap<String, String> hmStrStr = new HashMap<>(); 
		
		hmStrStr.put("King", "George");
		hmStrStr.put("Prince", "Charming"); 
		hmStrStr.put("Queen", "Latifah");
		hmStrStr.put("Duke", "Earl");
		
		for(String str: hmStrStr.keySet()) {
			System.out.println("key: " + str + ", value: " + hmStrStr.get(str)); 
		}
		
		// Note:the order that the items are printed using the keySet() may ​not be the same order that they were inserted. 
		// This further demonstrates the fact that for Hashmaps, the key use if for associated keys and values, 
		// not necessarily for a guaranteed storage order.
	}
}
