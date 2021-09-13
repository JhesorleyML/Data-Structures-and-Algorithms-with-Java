package com.codego.stackdemo;

public class MyStack {
	private int max_size;
	private int top;
	Card[] cards;
	
	public MyStack(int Size) {
		this.max_size = Size;
		cards = new Card[this.max_size];
		top = -1;		
	}

	//push operation
	public void push(Card card) {
		//check if stack is full
		if(!isFull()) {
			//add to stack and increment top
			cards[++top] = card;
		}		
	}
	
	//pop operation
	public void pop() {
		if(!isEmpty()) {
			cards[top] = null;
			--top;
		}
	}
	
	//peek operation
	public Card peek() {
		return cards[top];
	}
	
	//Check if stack is Empty
	private boolean isEmpty() {
		return (top == -1);
	}
	
	//Check if stack is Full
	private boolean isFull() {
		return (top == max_size - 1);
	}
	
	public void showStackContents() {
		for(int i = top; i >= 0; i--) {
			System.out.println("Face: " + cards[i].getFace() 
					+ "\t Rank : " + cards[i].getRank());
		}
		
	}
}
