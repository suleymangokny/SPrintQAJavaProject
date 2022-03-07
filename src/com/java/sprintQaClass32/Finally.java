package com.java.sprintQaClass32;

public class Finally {

	public static void main(String[] args) {
		

		int i = 10, j=0;
		
		try {
			System.out.println(i/j);
			
		}
		catch(ArithmeticException e) {
			System.out.println("1. Divide by 0");
		} //finally will be executed always. If you have/ not have exception still it will be executed.
		finally {
			System.out.println("2. I am finally block");
		}
		
		System.out.println("3. End of code");
		
	}

}
