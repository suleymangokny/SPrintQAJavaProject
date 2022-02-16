package com.java.sprintQaClass16;

public class CountVowels {

	public static void main(String[] args) {
		String s1 = "Hi, good Evening. Today is 2-3-2022 feb";
		int countOfVowels=0;
		int countOfDigits =0;
		int countOfSpaces =0;
		//spaces
		
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || 
					s1.charAt(i)=='i' || s1.charAt(i)=='o'|| s1.charAt(i)=='u') {
				countOfVowels++; //3
			}
			else if(s1.charAt(i)=='0' || s1.charAt(i)=='1' ||
					s1.charAt(i)=='2' || s1.charAt(i)=='3') {
				countOfDigits++;
			}
			else if(s1.charAt(i)==' ') {
				countOfSpaces++;
			}
		}
		System.out.println("Count of vowels = "+countOfVowels);
		System.out.println("Count of digits = "+countOfDigits);
		System.out.println("Count of spaces = "+countOfSpaces);
	}

}
