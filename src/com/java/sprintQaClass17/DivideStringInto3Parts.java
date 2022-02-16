package com.java.sprintQaClass17;

public class DivideStringInto3Parts {

	public static void main(String[] args) {
		
		
		String s = "aaabbbccc";
		
		//System.out.println(s.substring(0,3));
		//System.out.println(s.substring(3,6));
		//System.out.println(s.substring(6,9));
		
		int i=0;
		while(i<9) {
			System.out.println(s.substring(i,i+3));
			i=i+3;  
		}
	}

}
