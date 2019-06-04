package com.tts;

public class AlinkedList {
	public ListNode start, last;
	
	public boolean isEmpty() {
		boolean isEmpty = false;
		if(this.start == null) {
			isEmpty = true;;
		}
		return isEmpty;
	}
	
	public void add(ListNode newNode) {
		if(isEmpty()) {
			System.out.println("This is empty");
			start = newNode;
		} else {
			newNode.Next = start;
			start = newNode;
		}
	}
}
