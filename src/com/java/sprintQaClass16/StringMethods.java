package com.java.sprintQaClass16;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Hello";  
		String s2 = "hello";
		
		System.out.println("1. equals "+s1.equals(s2));
		
		
		System.out.println("2. equalsIgnoreCase "+s1.equalsIgnoreCase(s2));
		
		s1 = "HELLO";
		System.out.println("3. toLowerCase "+s1.toLowerCase());
		
		s2="hello";
		System.out.println("4. toLowerCase "+s2.toUpperCase());
		

	}

}
