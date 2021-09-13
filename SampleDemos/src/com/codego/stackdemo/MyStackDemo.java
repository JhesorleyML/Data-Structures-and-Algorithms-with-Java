package com.codego.stackdemo;

public class MyStackDemo {
	public static void main(String args[]) {
		
		stackUsingLinkedList();
		
	}
	
	public static void stackUsingLinkedList() {
		Card card_1 = new Card("Spades", "Ace");
		Card card_2 = new Card("Hearts", "Ace");
		Card card_3 = new Card("Clubs", "Ace");
		Card card_4 = new Card("Diamonds", "Ace");
		
		LinkedListStack stackofAces = new LinkedListStack();
		stackofAces.push(card_1);
		stackofAces.push(card_2);
		stackofAces.push(card_3);
		stackofAces.push(card_4);		
		
		System.out.println("SHOW STACK CONTENTS");
		stackofAces.showStackContents();
		System.out.println();
		
		System.out.println("PUSH ONE CARD");
		Card card_5 = new Card("Hearts", "King");
		stackofAces.push(card_5);
		stackofAces.showStackContents();
		System.out.println();
		
		System.out.println("PEEK CARD");
		System.out.println(stackofAces.peek().getRank() + " of " 
				+ stackofAces.peek().getFace());
		System.out.println();
		
		System.out.println("---POP TWO CARDS--");
		stackofAces.pop();
		stackofAces.pop();
		System.out.println("SHOW STACK CONTENTS");
		stackofAces.showStackContents();
	}
	
	public static void stackUsingArrays() {
		//create new cards;
		Card card_1 = new Card("Spades", "Ace");
		Card card_2 = new Card("Hearts", "Ace");
		Card card_3 = new Card("Clubs", "Ace");
		Card card_4 = new Card("Diamonds", "Ace");		
		
		MyStack stackOfAces = new MyStack(10);
		stackOfAces.push(card_1);
		stackOfAces.push(card_2);
		stackOfAces.push(card_3);
		stackOfAces.push(card_4);		
				
		System.out.println("SHOWING STACK CONTENTS");
		stackOfAces.showStackContents();
		System.out.println();
		
		Card card_5 = new Card("Diamonds", "King");
		System.out.println("PUSH: " + card_5.getRank() + " of " + card_5.getFace());
		stackOfAces.push(card_5);
		System.out.println("SHOWING STACK CONTENTS AFTER ADDING: " 
				+ card_5.getRank() + " of " + card_5.getFace());
		stackOfAces.showStackContents();
		System.out.println();		
		
		//peek card
		String face;
		String rank;
		
		face = stackOfAces.peek().getFace();
		rank = stackOfAces.peek().getRank();
		
		System.out.println("Peek Top Card: " + face + "\t Rank : " + rank );
		System.out.println();		
		
		//Popping out Top Card
		System.out.println("POP a Card");
		stackOfAces.pop();
		System.out.println("SHOWING STACK CONTENTS AFTER REMOVING THE TOP CARD");
		stackOfAces.showStackContents();
		System.out.println();
		
		stackOfAces.pop();
		stackOfAces.pop();
		
		System.out.println("SHOWING STACK CONTENTS AFTER REMOVING 2 MORE CARDS");
		stackOfAces.showStackContents();
		System.out.println();
	}
	
}
