package com.java.sprintQaClass18;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String s = "I am hungry. Please give me food";
		//Count number of words in string
		
		String words[] = s.split(" ");
		
		int count=0;
		
		for(String w:words) {
			count++;
		}
		System.out.println(count);
		
	}

}
