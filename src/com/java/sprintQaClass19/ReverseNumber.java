package com.java.sprintQaClass19;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num1 = 1234;

		int rev = reverseNumber(num1);
		System.out.println("Reverse number = "+rev);
		
		int pnum = 1001;
		
		int prev = reverseNumber(pnum);   
		
		System.out.println("Reverse in pallindrome "+prev);
		if(prev == pnum) {
			System.out.println("It is a pallindrome");
		}else {
			System.out.println("It is not a pallindrome");
		}
	}
	
	static int reverseNumber(int number) {
		int revNumber=0;    //4321
		
		int lastdigit;
		
		while(number!=0) {
			
			lastdigit = number%10;  //1
			      
			revNumber = revNumber*10 +lastdigit;  //4321
			
			number = number/10;   //0
		}
		return revNumber;	//value will be returned
	}
}
