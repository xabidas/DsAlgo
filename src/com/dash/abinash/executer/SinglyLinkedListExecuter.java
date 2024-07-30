package com.dash.abinash.executer;

import com.dash.abinash.linkedlist.SinglyLinkedList;

public class SinglyLinkedListExecuter {
	
	public static void main(String[] args) {
		
	
		SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
		linkedList.addAtFirst(10);
//		linkedList.addAtFirst(20);
//		linkedList.addAtFirst(30);
//		linkedList.addAtFirst(40);
//		linkedList.addAtFirst(50);
		
		System.out.println(linkedList.toString());
	}

}
