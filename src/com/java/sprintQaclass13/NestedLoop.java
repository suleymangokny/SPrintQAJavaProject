package com.java.sprintQaclass13;

public class NestedLoop {

	public static void main(String[] args) {
		
		/*for(ini ;  cond ; inc/dec) {
			
			for(ini ; cond ; inc) {
				
			}
		}*/
		
		for(int i =1; i<6 ;i++) {
			
			for(int j =1 ; j <4 ; j++) {
				System.out.println("Inner loop "+j);
			}
			System.out.println("*************** Outer loop "+i);
		}
		
		

	}

}
