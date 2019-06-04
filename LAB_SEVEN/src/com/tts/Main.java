package com.tts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlinkedList jordansList = new AlinkedList();
		ListNode newNode = new ListNode(0);
		ListNode secondNode = new ListNode(1);
		ListNode thirdNode = new ListNode(2);

		System.out.println("The list is empty (true/false): " + jordansList.isEmpty());
		
		jordansList.add(newNode);
		jordansList.add(secondNode);
		jordansList.add(thirdNode);
		
		jordansList.printList();
		System.out.println("The list is empty (true/false): " + jordansList.isEmpty());
		
		jordansList.makeEmpty();
		jordansList.printList();
		System.out.println("The list is empty (true/false): " + jordansList.isEmpty());
	}

}
