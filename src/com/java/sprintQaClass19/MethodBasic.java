package com.java.sprintQaClass19;

public class MethodBasic {

	public static void main(String[] args) {
	//function call in main method
		int output;
		 output = add(10,20);  //30
		
		 //purpose of return is so that you can use the returned value any number of times
		System.out.println(output*5);
		
		int sub = subtract(50, 20);
		System.out.println("Subtraction = "+sub);
		
	}
	
	//function definition
	
	           // return data-type functionName(paramenters){ method body }
	static int  add(int a, int b) {
		int sum;
		sum = a+b;
		return sum;
		
	}
	
	//if void then no return statement
	static int subtract(int a, int b) {
		
		return a - b;
	}

}
