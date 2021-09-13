package com.codego.stackdemo;

public class LinkedListStack {
	private Node top;	
	
	public LinkedListStack() {
		//create a top reference and set to null
		this.top = null;
	}
	
	//push operation
	public void push(Card card) {
		//create a temporary node
		Node temp = new Node(card);		
		temp.link = top;
		top = temp;
	}
	
	//pop operation
	public void pop() {
		if(!isEmpty()) {
			//update top reference to top.link
			top = (top).link;			
		}
	}
	
	//peek operation
	public Card peek() {
		if(!isEmpty()) {
			return top.data;
		}
		else {return null;}
	}
	
	//Check if stack is Empty
	public boolean isEmpty() {
		return (top == null);
	}	
	
	//display / show stack elements
	public void showStackContents() {
		Node current = top;
		while(current != null) {
			System.out.println(current.data.getRank() + " of " + current.data.getFace());
			current = current.link;
		}		
	}
}
