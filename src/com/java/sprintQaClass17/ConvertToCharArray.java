package com.java.sprintQaClass17;

public class ConvertToCharArray {

	public static void main(String[] args) {
		String s = "Cat";
		
		//convert string to char array
		char schar[]=s.toCharArray();
		for(int i=0;i<schar.length;i++) {
			System.out.println(schar[i]);
		}	
	}
}
