package com.dash.abinash.node;

/**
 * 
 * @author adash
 *
 */
public class LinkedListNodes {
	
	/**
	 * 
	 * @author adash
	 *
	 * @param <T>
	 */
	public class SinglyLinkedListNode<T> {
		
		// Data
		public Object data;
		
		// Next address of node
		public SinglyLinkedListNode<T> next;
		
		/**
		 * 
		 * @param data
		 */
		public SinglyLinkedListNode(Object data) {
			this.data = data;
			next = null; // If not set to NULL, by default the address will be NULL
		}
	}
	
	/**
	 * 
	 * @author adash
	 *
	 * @param <T>
	 */
	class DoublyLinkedListNode<T> {
		
		// Data
		Object data;
		
		// Next address of node
		DoublyLinkedListNode<T> next;
		
		// Previous address of node
		DoublyLinkedListNode<T> previous;
	}

}
