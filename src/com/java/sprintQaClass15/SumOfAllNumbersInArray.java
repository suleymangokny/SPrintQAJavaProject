package com.java.sprintQaClass15;

public class SumOfAllNumbersInArray {

	public static void main(String[] args) {
		
		//sum of all numbers in array
		int marks[] = {45,23,67,10};
		int sum=0;
		//average of marks  = sum/length of array
		double average=0;
		
		for(int i=0;i<marks.length;i++) {
			sum = sum + marks[i];
		}
		
		System.out.println("Sum ="+sum);
		int len = marks.length;
		System.out.println("Length of array = "+len);
		
		average = sum/len;
		System.out.println("average ="+average);
	}

}
