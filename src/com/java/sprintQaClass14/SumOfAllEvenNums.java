package com.java.sprintQaClass14;

public class SumOfAllEvenNums {

	public static void main(String[] args) {
		 // 10, 30, 56, 87, 23, 47, 90
		//Print sum of all even numbers in array 
		//10 + 30 + 56 + 90 = 186
		
		int numbers[]= {10,30,56,87,23,47, 90}; //second way to create array
		int sum=0;
		System.out.println(numbers.length);
		
		for(int num : numbers) {
			
			if(num%2 == 0) {
				
				sum = sum + num;
				
			}
			
		}
		System.out.println(sum);
	}

}
