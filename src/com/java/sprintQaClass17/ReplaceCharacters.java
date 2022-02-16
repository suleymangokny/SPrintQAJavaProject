package com.java.sprintQaClass17;

public class ReplaceCharacters {

	public static void main(String[] args) {
		String s = "Yay! I did it";
		
		//Output -> Yay!-I-did-it
		
		s = s.replace(" ", "-");
		System.out.println(s);
	
	}

}
