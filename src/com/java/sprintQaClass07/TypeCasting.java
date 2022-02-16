package com.java.sprintQaClass07;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Implicit conversion
		int a =10;
		double ad ; //converting smaller data-type into larger type
		 ad = a;
		 
		//Explicit conversion
		double d = 10.9;
		
		int num;
		
		num = (int)d;  //converting larger data-type into smaller data-type
		
		System.out.println(num);
		

	}

}
