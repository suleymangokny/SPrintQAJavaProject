package com.java.sprintQaClass20;

public class MethodsRevision {

	public static void main(String[] args) {
		
		checkPositiveNegative(10);
		checkPositiveNegative(-6);
		
		checkPositiveNegative(-5467);
		
		int output;
		output = findMax(45, 78);
		System.out.println("Max is "+output);
	}
	
	static void checkPositiveNegative(int num){
		
		if(num>0) {
			System.out.println(num+" It is positive");
		}else {
			System.out.println(num+" It is negative");
		}
		
	}
	
	static int findMax(int num1,int num2){
		
		int max=0;
		if(num1>num2) {
			max= num1;
		}else {
			max=num2;
		}
		return max;
	}

}
