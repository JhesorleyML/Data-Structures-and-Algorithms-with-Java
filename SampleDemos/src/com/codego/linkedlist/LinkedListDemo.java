package com.codego.linkedlist;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		
		//add items to linkedlist
		list.appendNode(1);
		list.appendNode(2);
		list.appendNode(3);
		list.appendNode(4);
		System.out.print("List of Items: ");
		list.printData();
		
		//add items to linkedlist in a certain position
		list.appendAfter(3, 5);
		System.out.print("List of Items After Adding 5 after 3: ");
		list.printData();
		
		//delete the last node
		list.deleteLastNode();
		System.out.print("List of Items After Last Node Deleted: ");
		list.printData();
		
		//delete node of the given key
		int key = 2;
		list.deleteNodeOfKey(key);
		System.out.print("List of Items After Deleting the Node with value Key " + key + ": ");
		list.printData();
	}

}
