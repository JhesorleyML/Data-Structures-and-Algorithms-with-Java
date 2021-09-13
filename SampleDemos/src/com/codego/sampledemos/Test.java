package com.codego.sampledemos;

public class Test {
	
	public static void main(String args[]) {
		String original = "software";
		StringBuilder result = new StringBuilder("hi");
		int index = original.indexOf('a');

		/*1*/
		result.setCharAt(0, original.charAt(0));
		System.out.println(result);
		
		/*2*/
		result.setCharAt(1, original.charAt(original.length()-1));
		System.out.println(result);
		
		/*3*/
		result.insert(1,original.charAt(4));
		System.out.println(result);
		/*4*/
		result.append(original.substring(1,4));
		System.out.println(result);
		/*5*/
		result.insert(3,(original.substring(index,index+2)) + " ");
		System.out.println(result);
		
		
		//int[] marks = {95,93,80,89,91};
		//getAverageMarksUsingArray(marks);

	}
	
	public static void getAverageMarksUsingArray(int[] arr) {
		
		int sum = 0;
		double average_marks;
		
		for(int val : arr) {
			sum  += val;
		}
		
		average_marks = Double.valueOf(sum)/arr.length;
		
		System.out.print(average_marks);
	}
}


