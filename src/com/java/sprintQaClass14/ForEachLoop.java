package com.java.sprintQaClass14;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String names[] = {"Alex" , "John", "Palak", "Natasha"};
		
		for(int i=0; i < names.length ; i++) {   //index
			System.out.println(names[i]);
		}
		
		System.out.println("WITH FOR EACH LOOP **************");
		for(String n:names) {                 //values
			
			System.out.println(n);
			
		}
	}

}
