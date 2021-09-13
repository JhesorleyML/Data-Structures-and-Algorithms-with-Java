package com.codego.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemoSample {
	
	public static void main(String args[]) {
		LinkedList<String> subject_list = new LinkedList<String>();
		
		//adding elements to a list
		subject_list.add("Object Oriented Programming");
		subject_list.add("Computer Programming with C#");
		subject_list.add("Data Structure and Algorithms");
		subject_list.add("World Literature");
		
		System.out.println("Subject List:" + subject_list);
		
		//adding an element to the 2nd place from a linkedlist
		//linkedlist index start at 0
		subject_list.add(1, "Understanding the Self");
		
		System.out.println("Subject List after adding item in the 2nd position:" + subject_list);
		
		//Removing the last element
		subject_list.removeLast();
		System.out.println("Subject List after removing the last item:" + subject_list);
		
		//Displaying the value of the third element from index 0;
		Object obj1 = subject_list.get(2);
		System.out.println("Displayed third item: " + obj1);
		
		//Modify third element
		subject_list.set(2, "Computer Programming with Java");
		System.out.println("Modified Third Item: " + subject_list.get(2));
		
		System.out.println("--FINAL SUBJECT LIST--");
		//Iterating the list again but this time doing this manually using an iterator
		Iterator<String> iterator = subject_list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}			
	}
}


