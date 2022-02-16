package com.java.sprintQaClass17;

public class CountCharactersInString {

	public static void main(String[] args) {
		//count all characters except " "
		String s = "Good evening. Lets start";
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
				count++;  //4
			}
		}
		
		System.out.println("Space count = "+count);

	}

}
