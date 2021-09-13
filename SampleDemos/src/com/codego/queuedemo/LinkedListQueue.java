package com.codego.queuedemo;

//import our Node class from stackDemo
import com.codego.stackdemo.*;

public class LinkedListQueue {
	Node front;
	Node rear;
	
	public LinkedListQueue() {
		this.front = null;
		this.rear = null;
	}
	
	//enqueue operation
	public void enqueue(Card card) {
		//create a temp node
		Node temp = new Node(card);

		//if queue is empty
		if(rear == null) {
			//create a new node as front
			rear = temp;
			front = rear;
			return;
		}
		rear.link = temp;
		rear = temp;
	}	
	
	//dequeue operation
	public Card dequeue() {
		Node temp = front;
		front = temp.link;
		
		return temp.data;
	}	
	
	//peek operation
	public Card peek() {
		//return the front card
		return front.data;
	}
	
	//isEmpty() method
	private boolean isEmpty() {
		return (this.rear == null);
	}	
	
	//display queue elements
	public void showQueueContents() {
		if(!isEmpty()) {
			Node temp = front;
			while(temp != null) {
				System.out.println(temp.data.getRank() + " of " + temp.data.getFace());
				temp = temp.link;				
			}
		}
		else {System.out.println("Queue is empty.");}		
	}	
}
