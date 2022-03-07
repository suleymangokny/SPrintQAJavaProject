package com.java.sprintQaClass32;

public class ExceptionEx6 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		
		int i=10 ,j=5;
		
		String s = null;
		try {
			System.out.println(i/j);     //2
			System.out.println(arr[1]);
			System.out.println(Integer.parseInt(s));
			
		}
		catch(ArithmeticException e) {
			System.out.println("2.divide by 0 not possible");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3.Out of bound");
		}
		catch(NullPointerException e) {
			System.out.println("4.String is null");
		}
		//exception class should be at the end
		catch(Exception e) {
			System.out.println("1. Exception class");
		}
	}

}
