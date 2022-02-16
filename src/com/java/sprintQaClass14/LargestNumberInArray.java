package com.java.sprintQaClass14;

public class LargestNumberInArray {

	public static void main(String[] args) {
		
		//46, 34, 78, 10, 39, 20
		
		//Output ->  Print the largest number from the array  78
		
		int numbers[]= {46, 34, 78, 10, 39, 2};
		
		int maxNumber = 0;
		
		for(int i=0; i<numbers.length;i++) {
			
			if(numbers[i] > maxNumber) {
				maxNumber = numbers[i];  //500
			}
			
		}
		System.out.println(maxNumber);
		System.out.println(numbers[3]);
	
	}

}
