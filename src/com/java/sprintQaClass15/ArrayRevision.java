package com.java.sprintQaClass15;

public class ArrayRevision {

	public static void main(String[] args) {
		
		int numbers[]= new int[4];
	
		numbers[0] = 10;
		numbers[1] = 34;
		numbers[2] = 45;
		
		int len = numbers.length;
		System.out.println("Length of array "+ len);
		
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
			
		}
		

	}

}
