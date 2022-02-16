package com.java.sprintQaClass16;

public class StringMethodsPart2 {

	public static void main(String[] args) {
		
		String s1 = "Hi, good morning";
		String s2 = "morning";
		
		System.out.println("5. Contains "+s1.contains("hi"));
		
		
		System.out.println("6. IndexOf "+s2.indexOf("i"));
		
		System.out.println("7. CharAt "+s2.charAt(4));
		
		System.out.println("8. Length"+s2.length());
		
		System.out.println("9. SubString with start index"+s1.substring(4));
		
		System.out.println("10. SubString with start index and end index"+s1.substring(4, 8));
		
		String s3 = "              ";
	
		System.out.println("11. IsEmpty "+s3.isEmpty());
		System.out.println("12. IsBlank "+s3.isBlank());
	} 

}
