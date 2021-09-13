package com.codego.queuedemo;

//import this package for our Card class
import com.codego.stackdemo.*;

public class ArrayQueue {
	Card[] cards;
	int max_size;
	int front;
	int rear;
	
	public ArrayQueue(int Size) {
		//initiate fields
		this.max_size = Size;
		cards = new Card[this.max_size];
		front = 0;
		rear = -1;
	}
	
	//enqueue operation
	public void enqueue(Card card) {
		//check if card is full
		if(!isFull()) {
			//add the new card and update the rear
			cards[++rear] = card;
		}
		else {
			System.out.println("Queue is full.");
		}
	}	
	
	//dequeue operation
	public Card dequeue() {
		Card temp = null;
		temp = cards[front];
		if(!isEmpty()) {
			// if there is one element in the queue
			if(rear == 0) {
				cards = null;				
			}
			//if there are more than 1 element in the queue, shift the elements
			else {				
				//shift all the elements
				for(int i = front; i < rear; i++) {
					cards[i] = cards[i+1];					
				}
			}
			//update the rear
			rear--;
		}
		//return the removed card
		return temp;
	}	
	
	//peek operation
	public Card peek() {
		//return the front card
		return cards[front];
	}
	
	//isEmpty() method
	private boolean isEmpty() {
		return (this.rear == -1);
	}
	
	//isFull method()
	private boolean isFull() {
		return (this.rear == this.max_size - 1);
	}
	
	//display queue elements
	public void showQueueContents() {
		if(!isEmpty()) {
			for(int i = front; i <= rear; i++) {
				System.out.println(cards[i].getRank() + " of " + cards[i].getFace());
			}
		}
		else {System.out.println("Queue is empty.");}		
	}	
}
