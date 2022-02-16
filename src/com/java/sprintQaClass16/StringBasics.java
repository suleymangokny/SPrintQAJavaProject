package com.java.sprintQaClass16;

public class StringBasics {

	public static void main(String[] args) {
		
		//One way to create strings is string literal method
		String s1 = "Hello";   //here Strings are stored in string constant pool
		
		String s2 = "Hello";
		
		//Other way to create strings is by using new keyword
		String s3 = new String("Hello"); // here Strings are created in heap memory
		
		
		System.out.println(s1 == s2);   //same memory location hence true
		System.out.println(s1 == s3);   //different memory location hence false
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// .equals check if the content is same for both strings
		System.out.println( s1.equals(s2));    
		System.out.println( s1.equals(s3));
	}

}
