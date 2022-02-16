package com.java.sprintQaClass03;

public class IfStatementPart2 {
	
	
	public static void main(String args[]) {
		
		int a = 5;
		int b = 10;
		
		//Java follows sequential execution so next line will be executed
		System.out.println("1 .We are learning Java");
		
		//if condition is true then ONLY IF block will be executed. Otherwise SKIP IF block
		if(a < b) {
			
			System.out.println("2. A is greater");
			
		}
		// If block is closed, so now again sequence will be followed
		System.out.println("3. It is a wonderful class");
		
	}
}
