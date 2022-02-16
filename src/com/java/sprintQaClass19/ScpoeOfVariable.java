package com.java.sprintQaClass19;

public class ScpoeOfVariable {

	public static void main(String[] args) {
		
		int sumOutPut =  add(10,20);

		//System.out.println(sum);   //sum variable can be accessed only inside add function, 
								//outside add it will not work
		
		
	}
	static int add(int a, int b){
		int sum = a + b;
		
		sum = sum +10;
		System.out.println(sum);
		return sum;
	}
	

}
