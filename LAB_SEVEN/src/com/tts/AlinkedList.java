package com.tts;

public class AlinkedList {
	public ListNode start, last;
	private int size = 0;
	
	// Checks whether the list is empty or not
	// Returns a boolean
	public boolean isEmpty() {
		boolean isEmpty = false;
		if(this.start == null) {
			isEmpty = true;;
		}
		return isEmpty;
	}
	
	//  Adds a new entry at the front of the list
	public void add(ListNode newNode) {
		if(isEmpty()) {
			System.out.println("This is empty");
			start = newNode;
			last = newNode;
			size++;
		} else {
			newNode.Next = start;
			start = newNode;
			size++;
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
	
	//  Makes an existing list empty
	public void makeEmpty() {
		start = null;
		last = null;
	}
	
	public int size() {
		return this.size;
	}
}
