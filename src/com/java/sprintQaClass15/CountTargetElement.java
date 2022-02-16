package com.java.sprintQaClass15;

public class CountTargetElement {

	public static void main(String[] args) {
		
		//Count the occurence of  target element 
		int numbers[]= {10,34,89,20,40, 20, 50, 20};
		
		int targetElement = 20;
		
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]==targetElement) {
				
				count++;   //3
			}
		}
		
		System.out.println(count);

	}

}
