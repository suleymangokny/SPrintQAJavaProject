package com.java.sprintQaClass11;

public class Series2 {

	public static void main(String[] args) {
		// 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10  ->Output
		
		//sum of all nums from 1-10
		//see the pattern and understand when are we doing -
		int sum =0;
		for(int i =1 ;i<=10;i++) {
			if(i%3==0) {
				sum = sum - i;
			}else {
				sum = sum+i; //1
			}
			
		}
		System.out.println(sum);
	}

	
}
