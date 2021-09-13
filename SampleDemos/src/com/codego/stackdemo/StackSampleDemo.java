package com.codego.stackdemo;

import java.util.Iterator;
import java.util.Stack;

public class StackSampleDemo {
	
	public static void main(String args[]) {
		Stack<Person> nameStack = new Stack<Person>();
		Person person_1 = new Person("Jhesorley","Aurelio");
		Person person_2 = new Person("Juan","San Jose");
		Person person_3 = new Person("Philippe","San Juan");
		
		nameStack.push(person_1);
		nameStack.push(person_2);
		nameStack.push(person_3);		
		
		Iterator<Person> iterator = nameStack.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.displayInfo());
		}
		
		System.out.println("Topmost Person in the List: " + nameStack.peek().displayInfo());
		
	}

}
