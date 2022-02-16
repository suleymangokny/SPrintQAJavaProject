package com.java.sprintQaClass06;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example 1: Take any letter and check if it is vowel or not   (a,e,i,o,u)
		char character = 'e';
		
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("Not a vowel");
		}
	
		//Example 2: Take any number and check if it between 0-10   1
		
		int num = 45;
		
		if ( num > 0 && num < 10) {
			System.out.println("In range");
		}else {
			System.out.println("Out of Range");
		}
		
		System.out.println( true || false &&  false || !(false) || true && false);
		

	}

}
