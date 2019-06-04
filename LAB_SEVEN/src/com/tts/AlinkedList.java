package com.tts;

public class AlinkedList {
	public ListNode start, last;
	
	// Checks whether the list is empty or not
	// Returns a boolean
	public boolean isEmpty() {
		boolean isEmpty = false;
		if(this.start == null) {
			isEmpty = true;;
		}
		return isEmpty;
	}
	
	//  Create a method that adds a new entry at the front of the list
	public void add(ListNode newNode) {
		if(isEmpty()) {
			System.out.println("This is empty");
			start = newNode;
		} else {
			newNode.Next = start;
			start = newNode;
		}
	}
	
	// Prints out the contents of the list
	public void printList() {
		if(isEmpty()) {
			System.out.println("This is empty");
		} else {
			boolean empty = true;
			ListNode temp = start;
			while(empty) {
				if(temp.Next == null) {
					System.out.println(temp.value);
					empty = false;
				} else {
					System.out.println(temp.value);
					temp = temp.Next;
				}
			}
		}
	}
}
