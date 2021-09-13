package com.codego.sortingdemo;

public class InsertionSort {
	int[] arr;		
	
	public InsertionSort(int[] val) {
		this.arr = val;
	}
	
	public void sortElements() {
		int position;
		int data;
		
		for(int i = 0; i < arr.length; i++) {
			position = i;
			data = arr[i];
			
			//Show the current array elements
			System.out.print("\nCurrent Array: ");
			displayElements();
			
			//Show the data and the position of the data
			System.out.print("Data to be Inserted: {" + data);
			System.out.println("}\tCurrent Position: [" + (position+1) + "]");
			
			while((position > 0) && (arr[position-1] > data)) {
				arr[position] = arr[position - 1];
				position = position - 1;
				
				//Display where the value is being inserted
				System.out.print("Inserted to position: " + (position+1));
				System.out.println("\t Inserted before: " + arr[position] );								
			}
			arr[position] = data;
			System.out.print("Result Array: ");
			displayElements();
		}
	}
	
	public void displayElements() {
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
