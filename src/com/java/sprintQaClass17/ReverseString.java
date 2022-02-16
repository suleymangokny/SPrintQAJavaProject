package com.java.sprintQaClass17;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "madam";
		String reverseString = "";
		
		/*reverseString = reverseString+"t";  //t
		reverseString = reverseString+"a";  //ta
		reverseString =  reverseString+"c";*/ //tac
		
		
		for(int i=s.length()-1;i>=0;i--) {
			reverseString = reverseString+s.charAt(i);
		}
		System.out.println("Reverse string = "+reverseString);
		System.out.println("String s = "+s);
		
		if(s.equals(reverseString)) {
			System.out.println("It is a pallindrome");
		}
		else {
			System.out.println("It is not a pallindrome");
		}

	}

}
