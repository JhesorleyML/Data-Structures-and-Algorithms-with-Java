package com.codego.sortingdemo;

import java.util.Scanner;

public class SortingDemo {
	public static void main(String args[]) {
		int[] arr = {25,89,12,87,11,18,65,10};
		int choice;
		
		System.out.println("Please Select Sorting Algo");
		System.out.println("1 - Bubble Sort");
		System.out.println("2 - Merge Sort");
		System.out.println("3 - Insertion Sort");
		System.out.println("4 - Selection Sort");
		
		
		System.out.print("Enter Selection: ");
		Scanner kb = new Scanner(System.in);
		choice = kb.nextInt();
		kb.close();
		
		switch (choice) {
		case 1:
			performBubbleSort(arr);
			break;
		case 2:
			performMergeSort(arr);
			break;
		case 3:
			//
			break;
		case 0:
			//
			break;

		default:
			System.out.print("Invalid Choice");
			break;
		}
		
	}
	
	public static void performBubbleSort(int[] num) {
		BubbleSort sort = new BubbleSort(num);
		sort.sortElements();
		sort.displayElements();
	}
	
	public static void performMergeSort(int[] num) {
		MergeSort sort = new MergeSort(num);
		sort.performMergeSort(num);
		sort.displayElements();
	}

}
