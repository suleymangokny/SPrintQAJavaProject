package com.java.sprintQaClass32;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		String s = "$12";
		
		try {
			int a = Integer.parseInt(s);
		
			System.out.println(a);
		}
		catch(NumberFormatException e) {
			
			System.out.println("it cannnot be converted to integer");
		}
		
		
	}

}
