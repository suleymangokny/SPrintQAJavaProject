package com.java.sprintQaClass03;

public class StringConcat {
	
	public static void main(String args[]) {
		
		String str1 = "Hello ";
		
		String str2 = "World ";
		
		String str3 = str1 + str2 ;
		
		int a = 10;
		int b = 20;
		
		System.out.println(str3);
		
		System.out.println(a+b);   //30
		
		
		                   //String + int
		System.out.println(str1 + a);
		
		
		System.out.println(str1 + a + b); //Hello 1020
		
		System.out.println(str1 + a + str2 + b);  //Hello 10World 20
		
		                  //int + int  + string 
		System.out.println(a + b + str1);
		
		String day = "Sunday";
		
		if(day == "Sunday") {
			System.out.println("Lets party");
		}
		
	}

}
