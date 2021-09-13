package com.codego.sortingdemo;

public class BubbleSort {
	int[] val;
	boolean swapped;
	
	public BubbleSort(int[] arr) {
		val = arr;		
	}
	
	public void sortElements() {
		for(int i = 0; i < val.length; i++) {
			swapped = false;
			for(int j=0; j< val.length-1-i; j++) {				
				System.out.print("Items compared: [" + val[j] + ", " + val[j+1] + "]");
				if(val[j] > val[j+1]) {					
					swap(val[j],val[j+1],j);
					swapped = true;
					System.out.println(" => Swapped [" + val[j] + ", " + val[j+1] + "]");
				}
				else { System.out.println(" => Not Swapped");}				
			}		
			//break loop if swapped i false, meaning no elements was swapped			
			if(!swapped) { break; }	
			
			System.out.print("Iteration No: " + (i+1) + ": ");
			displayElements();
			System.out.println();
		}
	}
	
	private void swap(int a, int b, int index) {
		val[index] = b;
		val[index + 1]= a;
	}
	
	public void displayElements() {
		for(int a : this.val) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
