package com.java.sprintQaClass14;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234;
		
		int reverseNumber=0;
		
		int lastDigit;
		
		//output -> 4  3   2  1 
		
		while(num!=0) {
			lastDigit= num%10; 
			reverseNumber = reverseNumber*10 +lastDigit;
			num = num/10; 
		}
		
		System.out.println(reverseNumber);
	
	}

}
