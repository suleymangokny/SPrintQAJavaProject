package com.java.sprintQaClass18;

public class SumAllElements {

	public static void main(String[] args) {
		
		int array[] = {4,3,2,1};
		
		//Print sum of all elements in array
		
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum = sum + array[i];
		}
 
		System.out.println(sum);
	}

}
