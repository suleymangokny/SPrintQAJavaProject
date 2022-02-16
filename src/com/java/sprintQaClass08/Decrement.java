package com.java.sprintQaClass08;

public class Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =5 , b=15;
		
		int c;
		
		c = a++ ;  //5
		System.out.println("Value of c after postincrement "+c);
		
		c = b--;   //15
		System.out.println("Value of c after postdecrement "+c);
		
		System.out.println("***************************");
		
		System.out.println("Value of a is "+a);  //
		
	System.out.println("Value of b is "+b);  //14
	
	System.out.println("***************************");
	
	c = ++a;
	System.out.println("Value of c after preincrement "+c);
	
	c = --b;
	System.out.println("Value of c after predecrement "+c);

	}

}
