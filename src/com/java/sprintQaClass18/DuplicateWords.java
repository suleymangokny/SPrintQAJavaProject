package com.java.sprintQaClass18;

public class DuplicateWords {

	public static void main(String[] args) {
		
		String s="Sky is blue. Sky is beautiful";
		
		String words[] = s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			for(int j = i+1;j<words.length;j++) {
				
				if(words[i].equals(words[j])) {
					System.out.println(words[i]);
				}
			}
		}
	}

}
