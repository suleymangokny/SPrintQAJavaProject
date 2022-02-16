package com.java.sprintQaClass17;

public class PrintDuplicateWords {

	public static void main(String[] args) {
		
		String s = "Cat is sitting on the table cat is on the floor cat is having milk";
		
		String words[] = s.split(" ");
		
		String wordToCompare = "cat";
		int count=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equalsIgnoreCase(wordToCompare)) {
				count++;  //3
			}
		}	
		if(count>1) {
			System.out.println(wordToCompare + " is duplicate");
		}else {
			System.out.println(wordToCompare+" is not duplicate");
		}

	}

}
