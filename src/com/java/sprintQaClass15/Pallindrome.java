package com.java.sprintQaClass15;

public class Pallindrome {

	public static void main(String[] args) {
		int num= 1234;
		
		 //1. revNumber = 121
		
		//2. if num is equal to revNumber then print "Number is pallindrome"
		
		int revNumber=0;
		
		int originalNumber = num;  //121
		
		int lastdigit;
		while(num!=0) {
			lastdigit = num%10; //3
			revNumber = revNumber*10 +lastdigit; //
			num = num/10;   //12
		}
		
		if(originalNumber == revNumber) {
			System.out.println("Number is pallindrome");
		}else {
			System.out.println("Number is not a pallindrome");
		}
		
		
		System.out.println("Reverse = "+revNumber);
		System.out.println("Number = "+num);
		
		
		
		

	}

}
