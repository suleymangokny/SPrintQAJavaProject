package com.java.sprintQaClass17;

public class StringRevision {

	public static void main(String[] args) {
		
		String s = "Hello";     //string literal 
		
		String s1="Hello";
		
		String s2 = new String("hello");
		
		System.out.println(s1 == s);
		System.out.println(s1 == s2);
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.toUpperCase());
		
		String s3 = "Good evening";
		

	}

}
