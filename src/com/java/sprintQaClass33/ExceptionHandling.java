package com.java.sprintQaClass33;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int i = 10, j=0;
		try {
			System.out.println(i/j);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero");
		}
		finally {
			System.out.println("Finally");
		}
	}

}
