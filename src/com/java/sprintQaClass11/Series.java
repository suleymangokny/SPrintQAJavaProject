package com.java.sprintQaClass11;

public class Series {

	public static void main(String[] args) {
		// 1/2 + 2/3 + 3/4 + 4/5...........10/11  ->Output
		
		//1. print 1/2 2/3 3/4.....
		//2. then sum
		
		double sum =0;
		for(double i=1; i<=10;i++) {
			sum = sum + i/(i+1);
			
		}

		System.out.println(sum);
	}
	

}
