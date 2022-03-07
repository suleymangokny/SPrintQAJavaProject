package com.java.sprintQaClass32;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
	//[3,4,1,2,6]
		
	int arr[] = {3,4,1,2,6};
	
	try {
		System.out.println(arr[10]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Out of bound");
		
	}
	
	}

}
