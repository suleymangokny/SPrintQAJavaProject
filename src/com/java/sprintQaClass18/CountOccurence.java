package com.java.sprintQaClass18;

public class CountOccurence {

	public static void main(String[] args) {
		
		int array[] = {20,34,45,20,45,10,30,45,76,45};
		
		int targetElement = 20;
		int count=0;
		
	//count how many times 45 is there in array   4
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i] == targetElement) {
				count++;
			}
		}
		
		System.out.println(targetElement + " has occured "+count +" times");

	}

}
