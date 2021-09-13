package com.codego.sortingdemo;

public class SelectionSort {
	private int[] TestArray;
	
	//Constructor
	public SelectionSort(int[] arr) {
		this.TestArray=arr;		
	}
	
	//Sort Elements
	public void sortElements() {
		int len=this.TestArray.length;
		int min;
		
		for (int i = 0; i < len-1; i++) {
			//set current index as minimum
			min=i;
			
			//check the element if it is the minimum
			for (int j = i+1; j < len; j++) {
				if (TestArray[j]<TestArray[min]) {
					min=j;
				}
			}
			//swap if minimum is changed
			if (min != i) {
				swap(i,min,TestArray[i],TestArray[min]);
			}			
		}		
	}
	
	//Swap Elements
	private void swap(int currentIndex, int minIndex,int cur_val,int min_val) {
		TestArray[currentIndex]=min_val;
		TestArray[minIndex]=cur_val;
	}
	
	//Display Elements
	public void displayElements() {
		for (int i : TestArray) {
			System.out.print(i + " ");
		}
	}
}



