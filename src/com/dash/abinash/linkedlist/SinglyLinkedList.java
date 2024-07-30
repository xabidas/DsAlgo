package com.dash.abinash.linkedlist;

import com.dash.abinash.node.LinkedListNodes;
import com.dash.abinash.node.LinkedListNodes.SinglyLinkedListNode;

/**
 * 
 * @author adash
 *
 */


public class SinglyLinkedList<T> {
	
	LinkedListNodes nodes = new  LinkedListNodes();
	SinglyLinkedListNode<T> head;
	
	public SinglyLinkedList() {
		super();
		this.head = null;
		
	}
	
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean add(Object data) {
		return false;
	}
	
	/**
	 * Adds an item at the start of the SinglyLinkedList
	 * @param data
	 * @return
	 */
	public boolean addAtFirst(Object data) {
		
		if (data == null)
			return false;
		
		
		// Create a node
		LinkedListNodes.SinglyLinkedListNode<T> node = nodes.new SinglyLinkedListNode<T>(data);
		
		// 
		if (head == null) {
			head = node;
			return true;
			
		}
		
		//
		node.next = head;
		
		//
		head = node;
		
		
		return true;
	}
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean addToLast(Object data) {
		return false;
	}
	
	/**
	 * 
	 * @param data
	 * @param index
	 * @return
	 */
	public boolean addAtAnyPos(Object data, int index) {
		return false;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public int size() {
		
		return 0;
	}
	
	/**
	 * If the {#{@link SinglyLinkedList} is empty or not
	 * @return true (if the list is empty)
	 *         false otherwise
	 */
	public boolean isEmpty() {
		return head==null;
	}
	
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		
		if (index<0 || size() == 0)
			return null;
		
		SinglyLinkedListNode<T> currentNode = head;
		int cursor = 0;
		
		while(currentNode != null) {
			if (cursor == index)
				return currentNode.data;
			
			currentNode = currentNode.next;
		}
		
		
		return null;
	}
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	public int indexOf(Object data) {
		return -1;
	}
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean contains(Object data) {
		return false;
	}
	
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		
		SinglyLinkedListNode<T> currentNode = head;
		
		StringBuilder sb = new StringBuilder();
		while (currentNode != null) {
			sb.append(currentNode.data);
			if (currentNode.next != null) {
				sb.append("->");
			}
			currentNode = currentNode.next;
		}
		
		return sb.toString();
		
	}

}
