package com.java.sprintQaClass15;

public class ReverseArray {

	public static void main(String[] args) {
		
		int numbers[]= {10,20,30,40,70,50,39,28,10,89,76};
		
		int reverseArray[]= new int[11];   
		
		int j=0;
		for(int i=numbers.length-1;i>=0;i--) {
			 reverseArray[j]=numbers[i];
			 j++;
		}
		
		for(int n:reverseArray) {
			System.out.println(n);   //40,30,20,10
		}
		

	}

}
