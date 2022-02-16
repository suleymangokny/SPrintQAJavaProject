package com.java.sprintQaClass02;

public class Modulus {
	
	public static void main(String args[]) {
		
		int num1 = 11;
		int num2 = 2;
		
		int mod;
		
		mod = num1 % num2;   // 11 % 2 
		
		System.out.print(mod);
		
		
		// Any number modulo 2 , if output is 1 -> odd , output = 0 -> even
		System.out.println(9 % 2);    //1      //odd
		System.out.println(4 % 2);     //0     //even
		System.out.println(88 % 2);   //0      //even
		System.out.println(77 % 2);   //1      //odd
	    System.out.println(100 % 2);  //0      //even
	    
	    //any number modulo 10 will give last digit of the number
		System.out.println(525 % 10);
		System.out.println(1009 % 10);
		System.out.println(77778 % 10);
		
		//ignore or remove digit so then divide by 10
		System.out.println(109 / 10 );   //10
		System.out.println(88 / 10);     //8
		System.out.println(1789 / 10);  //178
	}

}
