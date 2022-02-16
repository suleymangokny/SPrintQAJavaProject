package com.java.sprintQaClass03;

public class StringConcatExample {
	
	// Two strings str1 = Good , str2 = morning 
	
	public static void main(String args[]) {
		
		String str1 = "Good";
		String str2 = "Morning ";
		
		int x = 40;
		int y = 30;
		
		String space = " ";
		
		System.out.print(str1 + str2);
		
		System.out.println(str1 + space + str2);   //Good morning
		
		System.out.println(str1 + x + str2);  //Good40Morning
		
		System.out.println(y + x + str2);  //70Morning
		
		System.out.println(x + y + str1 + str2);
		
		//String concatatination + is ONLY valid operator for Strings
		
		//str1 + y - x    - > invalid because - is not valid for Strings
		
		//str2 + x + str1 % 5  -> % is not valid for Strings
		
		System.out.println( x % y + str1); // 40 % 30 = 10    + str1  = 10Good
		
		
	}

}
