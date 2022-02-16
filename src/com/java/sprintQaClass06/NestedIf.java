package com.java.sprintQaClass06;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find max of 3 numbers without logical operators
		
		int a =2, b=8, c = 50;
		
		if( a > b) {
			if(a >c) {
				
				System.out.println(a + "is max");
			}
			else if(b>c) {
				System.out.println(b + "is max");
			}
			else {
				System.out.println(c + "is max");
			}
			
		}else {
			if(b>c) {
				System.out.println(b + "is max");
			}
			else {
				System.out.println(c + "is max");
			}
			
		}	
	}
}
