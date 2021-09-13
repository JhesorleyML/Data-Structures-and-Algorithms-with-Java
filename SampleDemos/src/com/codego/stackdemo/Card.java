package com.codego.stackdemo;

public class Card {
	private String face; 
	private String rank;
	
	public Card(String Face, String Rank) {
		this.face = Face;
		this.rank = Rank;
	}
	
	//getters to get the Card face and rank
	public String getFace() {return this.face; }
	public String getRank() {return this.rank;}
	
}
