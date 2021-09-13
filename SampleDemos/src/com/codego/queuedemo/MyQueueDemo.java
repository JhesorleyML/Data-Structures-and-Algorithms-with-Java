package com.codego.queuedemo;

import com.codego.stackdemo.Card;

public class MyQueueDemo {
	public static void main(String args[]) {
		queueUsingArray();
		//queueUsingLinkedList();
		
	}
	
	public static void queueUsingLinkedList() {
		Card card_1 = new Card("Spades", "Ace");
		Card card_2 = new Card("Hearts", "Ace");
		Card card_3 = new Card("Clubs", "Ace");
		Card card_4 = new Card("Diamonds", "Ace");
		
		LinkedListQueue queueLLCards = new LinkedListQueue();
		queueLLCards.enqueue(card_1);
		queueLLCards.enqueue(card_2);
		queueLLCards.enqueue(card_3);
		queueLLCards.enqueue(card_4);
		
		queueLLCards.dequeue();			
		
		queueLLCards.showQueueContents();
		
		Card showCard = queueLLCards.peek();
		System.out.println("Card at the front: " + showCard.getRank() + 
				" of " + showCard.getFace());
	}
	
	public static void queueUsingArray() {
		Card card_1 = new Card("Spades", "Ace");
		Card card_2 = new Card("Hearts", "Ace");
		Card card_3 = new Card("Clubs", "Ace");
		Card card_4 = new Card("Diamonds", "Ace");
		
		LinkedListQueue queueCards = new LinkedListQueue();
		queueCards.enqueue(card_1);
		queueCards.enqueue(card_2);
		queueCards.enqueue(card_3);
		queueCards.enqueue(card_4);
		System.out.println("----QUEUE ORIGINAL CONTENTS----");
		queueCards.showQueueContents();
		System.out.println();
		
		//adding new cards to the stack
		Card card_5 = new Card("Diamonds", "King");
		queueCards.enqueue(card_5);
		System.out.println("Adding " + card_5.getRank() + " of " + card_5.getFace());
		System.out.println("----QUEUE CONTENTS----");
		queueCards.showQueueContents();
		System.out.println();
		
		//adding new cards to the stack
		Card card_6 = new Card("Hearts", "King");
		queueCards.enqueue(card_6);
		System.out.println("Adding " + card_6.getRank() + " of " + card_6.getFace());
		System.out.println("----QUEUE CONTENTS----");
		queueCards.showQueueContents();
		System.out.println();
		
		//removing the front card
		Card dcard = queueCards.dequeue();
		System.out.print("Removing the front card: " );
		System.out.println(dcard.getRank() + " of " + dcard.getFace());
		
		//peek the new front card
		Card veiwcard = queueCards.peek();
		System.out.print("New Front Card: " );
		System.out.println(veiwcard.getRank() + " of " + veiwcard.getFace());
		
		System.out.println("----QUEUE NEW CONTENTS----");		
		queueCards.showQueueContents();
	}
}
