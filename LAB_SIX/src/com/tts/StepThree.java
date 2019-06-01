package com.tts;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StepThree {
	public static void runExerciseOne() {
		// Create two variables to represent a Queue and a Stack
		// Study the following code to see the difference in the methods and the difference in storage order
		Queue<String> queue = new ArrayDeque<>(); 
		Stack<String> stack = new Stack<>();
		
		queue.add("Queues");
		queue.add("are");
		queue.add("First In ");
		queue.add("First Out");
		
		for ( String s: queue) {
			System.out.println(s);
		}
		
		String rem = queue.remove(); System.out.println("so removed gives: " + rem);
		
		stack.push("Stacks"); 
		stack.push("are"); 
		stack.push("First In "); 
		stack.push("Last Out");
		
		for ( String s: stack) {
			System.out.println(s); 
		}
		
		rem = stack.pop();
		System.out.println("So pop gives: " + rem);
	}
}
