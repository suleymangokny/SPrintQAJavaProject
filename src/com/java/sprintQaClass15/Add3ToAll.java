package com.java.sprintQaClass15;

public class Add3ToAll {

	public static void main(String[] args) {
		int numbers[]= {10,20,30,40};
		
		  //13, 23, 33 , 43
		int newArray[]= new int[4];
		
		for(int i=0; i<numbers.length;i++) {
			newArray[i]=numbers[i]+3;
		}
		
		for(int n:newArray) {
			System.out.println(n);
		}
		

	}

}
