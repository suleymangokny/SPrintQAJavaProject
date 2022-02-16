package com.java.sprintQaClass11;

public class DoWhile {

	public static void main(String[] args) {
		
		//do{  }while(condition);    //atleast execute once
		
		int i = 0;
		 
		do {
			//System.out.println(i);
			i++;
			
		}while(i<=5);
		
		int sum =0;
		
		do {
			sum = sum+2;   //2 , 4, 6, 8, 10
			System.out.println(sum);
			
		}while(sum<10);
		
	}

	
}
