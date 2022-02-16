package com.java.sprintQaClass18;

public class StringRevision {

	public static void main(String[] args) {
		
		String s = "Hello";   //string literal
		
		String s1= new String("Hello");   //new keyword
		
		System.out.println(s == s1);
		
		System.out.println(s.equals(s1));
		
		s=s.replace("l", "p");
		System.out.println(s);
		
		String s2= "I am learning Java";
		System.out.println(s2.contains("I am"));
		
		System.out.println(s2.substring(0,4).toLowerCase().replace("i", "We"));
		
		System.out.println(s.toUpperCase());
		
		String s3 = "hi";
		System.out.println(s3.isBlank());

	}

}
