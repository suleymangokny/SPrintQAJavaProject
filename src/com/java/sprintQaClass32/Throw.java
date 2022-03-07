package com.java.sprintQaClass32;

public class Throw {

	public static void main(String[] args) {
		
		try {
			
			//explicitly throw an exception to Java compiler
			throw new ArrayIndexOutOfBoundsException();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("out of bound");
		} 
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
