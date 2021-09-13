package com.codego.sortingdemo;


public class MergeSort {
	int[] TestArray;
	
	public MergeSort(int[] val) {
		this.TestArray = val;
	}
	
	//get the array to be arrange
	public int[] sortElements(int[] arr) {		
		int len=arr.length;  //get the length of the array
		
		int mid=len/2; //get the mid of the array
		
		//if array length is 1 return the array
		if (len==1) {
			return arr;
		}
		//create new two arrays 
		int[] lArr=new int[mid];
		int[] rArr=new int[len-mid];
		
		for (int i = 0; i<mid; i++) {
			lArr[i]=arr[i];
		}
		int k=0;
		for (int j = mid; j < len; j++) {			
			rArr[k]=arr[j];
			k++;
		}				
		//Perform merging and sorting through recursion
		return merge(sortElements(lArr), sortElements(rArr));
	}
	
	//This function merges two sub-arrays left and right and then return the result array
	private int[] merge(int[] Arr1, int[] Arr2) {		 
		
		int sizeL=Arr1.length;
		int sizeR=Arr2.length;
		
		//Create and initialize the result array
		int[] resArray = new int[sizeL + sizeR];
		
		//create temporary arrays of the given sizes
		int[] l_array = new int[sizeL];
		int[] r_array = new int[sizeR];
		
		//copy data to this temporary arrays
		for(int i = 0; i < sizeL; i++) {
			l_array[i] = Arr1[i];
		}
		for(int j = 0; j < sizeR; j++) {
			r_array[j] = Arr2[j];
		}
		
		//Merging process starts
		//Initialize the index of the first and second sub array
		int i = 0; int j =0;
		
		//initial index of merge sub array
		int k = 0;
		
		//swapping happens
		//check the value of left array	and the right array at a given index
		//store the lesser value to the result array
		while(i < sizeL && j < sizeR) {
			if(l_array[i] <= r_array[j]) {
				resArray[k] = l_array[i];
				i++;
			}
			else {
				resArray[k] = r_array[j];
				j++;				
			}
			k++;
		}
		
		//copy the remaining elements
		//l_array if there were any
		while(i < sizeL) {
			resArray[k] = l_array[i];
			i++;
			k++;
		}
		
		//copy the remaining elements
		//r_array if there were any
		while(j < sizeR) {
			resArray[k] = r_array[j];
			j++;
			k++;
		}				
		return resArray;
	}
	
	//display elements
	public void displayElements() {		
		for(int a : TestArray) {
			System.out.print(a + " ");
		}
	}
	
	//perform merge sort
	public void performMergeSort(int[] num) {
		this.TestArray = new int[num.length];
		TestArray = sortElements(num);		
	}
}

