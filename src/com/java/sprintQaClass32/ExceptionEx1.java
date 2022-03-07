package com.java.sprintQaClass32;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int a = 10, b = 0;
		
		try {
			System.out.println("1. "+a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("2. Divide by zero not possible");
		
		}
		System.out.println("3. Outside try-catch");
		System.out.println("4. End of code");

	}

}
