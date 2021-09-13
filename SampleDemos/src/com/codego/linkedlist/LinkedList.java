package com.codego.linkedlist;

public class LinkedList {
	private Node head = null;
	private Node tail = null;
	
	public void appendNode(int data) {
		//if head is null 
		if(head == null) {
			head = new Node(data);			
		}
		// if head is not null
		else { 
			tail = head;
			//traverse through the linked list
			while(tail.next != null) {
				tail = tail.next;
			}
			//assign the pointer of the last node the new node
			tail.next = new Node(data);
		}
	}
	
	public void appendAfter(int key, int data) {
		//check of head is null
		if(head == null) {
			return;
		}
		
		//create a temp node to hold the pointer reference of the of the key node
		Node temp = null;
		Node curr = head;
		
		//traverse to the find the node
		while(curr.next != null) {
			//compare node if the same with the key
			if(curr.data == key) {
				//hold the pointer reference of the current node
				temp = curr.next;
				//create a new node
				Node newNode = new Node(data);
				//insert the new node after the node with the same key
				curr.next = newNode;
				//give the new node the pointer reference of the next node
				newNode.next = temp;				
				break;						
			}
			curr = curr.next;
		}
		//clear the temp node
		temp = null;
	}	
	
	public void deleteLastNode() {		
		Node curr;
		//check if head is null before deleting
		if(head == null) {
			return;
		}
		
		//if there is only one node
		if(head.next == null) {
			head = null;
		}
				
		//lets find the 2nd to the last node
		//and try to see if the pointer of that node is null
		curr = head;		
		while(curr.next != null) {			
			if(curr.next.next == null) {
				curr.next = null;
				break;
			}
			curr = curr.next;
		}
	}
	
	public void deleteNodeOfKey(int key) {
		Node curr;
		Node temp;
		curr = head;
		while(curr.next != null) {
			if(curr.next.data == key) {
				temp = curr.next.next;
				curr.next = null;
				curr.next = temp;
				break;
			}
			curr = curr.next;
		}
		temp = null;
	}
		
	public void printData() {
		Node tail = head;
		while(tail != null) {
			System.out.print(tail.data + " ");
			tail = tail.next;
		}
		System.out.println();
	}

}
