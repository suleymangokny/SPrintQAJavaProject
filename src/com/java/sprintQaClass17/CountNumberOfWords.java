package com.java.sprintQaClass17;

public class CountNumberOfWords {

	public static void main(String[] args) {
		
		String s = "I am learning Java Strings";
		
		String[] words = s.split(" ");
		//First method
		int count=0;
		for(String w:words) {
			
			count++;
		}
		System.out.println("No of words are "+count);
		
		//second method
		System.out.println("No of words are "+words.length);
	}

}
