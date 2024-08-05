package com.dash.abinash.linkedlist;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
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
	 * ***********
	 * RETRIEVE
	 * ***********
	 */
	

 
	/**
	 * Inserts the specified element at the specified position in this list
	 * @param index 
	 * @param t     
	 */
	public void add(int index, T t) {
	}
	
	/**
	 * Inserts the specified element at the beginning of this list
	 * @param data
	 * @return
	 */
	public boolean addFirst(T t) { 
		return false;
	}
	
	/**
	 * Inserts the specified element at the end of this list
	 * @param t
	 * @return
	 */
	public boolean addLast(T t) {
		return false;
	}
	
	/**
	 * Inserts all of the elements in the specified collection into this list, starting at the specified position
	 * @param index
	 * @param c
	 * @return
	 */
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}
	
	/**
	 * Appends all of the elements in the specified collection to the end of this list, in the ordern that they are returned by the specified collection's iterator
	 * @param c
	 * @return
	 */
	public boolean addAll(Collection<? extends T> c) {
		return false;
	}
	
	/**
	 * Adds the specified element as the taukl (last element) of this list
	 * @param t
	 * @return
	 */
	public boolean offer(T t) {
		return false;
	}
	
	/**
	 * Inserts the specified element at the front of this list
	 * @param t
	 * @return
	 */
	public boolean offerFirst(T t) {
		return false;
	}
	
	/**
	 * Inserts the specified element at the end of this list
	 * @param t
	 * @return
	 */
	public boolean offerLast(T t) {
		return false;
	}
	
	
	/**
	 * ***************
	 * RETRIEVE
	 * ***************
	 */
	
	/**
	 * Returns true if this list contains the specified element
	 * @param o
	 * @return
	 */
	public boolean contains(Object o) {
		return false;
	}
	
	/**
	 * Retrieves but does not remove the head (first element of this list)
	 * @return
	 */
	public T element() {
		return null;
	}
	
	/**
	 * Returns the element at the specified position in this list
	 * @param index
	 * @return
	 */
	public T get(int index) {
		return null;
	}
	
	/**
	 * Returns the first element in this list
	 * @return
	 */
	public T getFirst() {
		return null;
	}
	
	/**
	 * Returns the last element in this list
	 * @return
	 */
	public T getLast() {
		return null;
	}
	
	/**
	 * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 * @param o
	 * @return
	 */
	public int indexOf(Object o) {
		return 0;
	}
	
	/**
	 * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 * @param o
	 * @return
	 */
	public int lastIndexOf(Object o) {
		return 0;
	}
	
	/**
	 * Returns a list-iterator iof the elements in this list (in proper sequence), starting at the specified position in the list
	 * @param index
	 * @return
	 */
	public ListIterator<T> listIterator(int index) {
		return Collections.emptyListIterator();
	}
	
	/**
	 * Returns an iterator over the elements in this dequeue in reverse sequential order
	 * @return
	 */
	public Iterator<T> descendingIterator() {
		return Collections.emptyIterator();
	}
	
	
	/**
	 * Removes all the elements from this list
	 */
	public void clear() {
		
	}
	
	/**
	 * Returns a shallow copy of this linkedlist
	 */
	public Object clone() {
		return Collections.EMPTY_LIST;
	}
	
	
	
	
	/**
	 * Returns the number of elements in this list
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
	 * Replaces the element at the specified position in this list with specified element
	 * @param element
	 * @param index
	 * @return
	 */
	public T set(T element, int index) {
		
		return null;
	}
	
	/**
	 * Returns a reverse-ordered view of this collection
	 * @return
	 */
	public SinglyLinkedList<T> reversed() {
		return null;
	}
	
	
	/**
	 * Retrieves. 
	 * But does not remove the head (the first element) of the list
	 * @return
	 */
	public T peek() {
		return null;
	}
	
	/**
	 * Retrieves.
	 * But does not remove the first element of the list or returns null if this list is empty
	 * @return
	 */
	public T peekFirst() {
		return null;
	}
	
	
	/**
	 * Retrieves.
	 * But does not remove the last element of the list or returns null if this list is empty
	 * @return
	 */
	public T peekLast() {
		return null;
	}
	
	/**
	 * Retrieves and remove the head (the first element) of this list
	 * @return
	 */
	public T poll() {
		return null;
	}
	
	/**
	 * Retrieves and removes the first element of this list, or returns null if this list is empty
	 * @return
	 */
	public T pollFirst() {
		return null;
	}
	
	/**
	 * Retrieves and removes the last element of this list, or returns null if this list is empty
	 * @return
	 */
	public T pollLast() {
		return null;
	}
	
	
	/**
	 * Pops an element from the stack represented by this list
	 * @return
	 */
	public T pop() {
		return null;
	}
	
	/**
	 * Pushes an element onto the stack represented by this list
	 * @param t
	 */
	public void push(T t) {
		
	}
	
	/**
	 * Creates a late-binding and fail-fast Spliterator over the elements in this list
	 * @return
	 */
	public Spliterator<T> splitIterator() {
		return null;
	}
	
	
	/**
	 *    #########################
	 *    
	 *    ##########  DELETE 
	 *    
	 *    #########################
	 */
	

	/**
	 * Retreives and removes the head (the first element) of this list
	 * @return
	 */
	public T remove() {
		return null;
	}
	
	/**
	 * Removes the element at the specified position in this list
	 * @param index
	 * @return
	 */
	public T remove(int index) {
		return null;
	}
	
	/**
	 * Removes the FIRST OCCURRENCE of the specified element from this list, if it is present 
	 * @param o
	 * @return
	 */
	public boolean remove(Object o) {
		return false;
	}
	
	/**
	 * Removes and returns the first element in this list
	 * @return
	 */
	public T removeFirst() {
		return null;
	}
	
	/**
	 * Removes the first occurrence of the specified element in this list (when traversing the list from head to tail)
	 * @param o
	 * @return
	 */
	public boolean removeFirstOccurrence(Object o) {
		return false;
	}
	
	/**
	 * Removes and returns the last element from this list
	 * @return
	 */
	public T removeLast() {
		return null;
	}
	
	/**
	 * Removes the last occurrence of the specified element in this list (when traversing the list from head to tail)
	 * @param o
	 * @return
	 */
	public boolean removeLastOccurrence(Object o) {
		return false;
	}
	
	/**
	 * Returns an array containing all of the elements in this list in proper sequence (from first to last element)
	 * @return
	 */
	public Object[] toArray() {
		return Collections.EMPTY_LIST.toArray();
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
