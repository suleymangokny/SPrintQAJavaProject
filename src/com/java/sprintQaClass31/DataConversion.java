package com.java.sprintQaClass31;

public class DataConversion {

	public static void main(String[] args) {
		
		String a = "10";
		String b = "20";
		
		int x = Integer.parseInt(a);    //unboxing
		System.out.println("Value of x= "+x);
		
		int y = Integer.parseInt(b);
		System.out.println("Value of y = "+y);
		System.out.println(x+y);

	}

}
