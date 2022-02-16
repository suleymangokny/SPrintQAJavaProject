package com.java.sprintQaClass18;

public class ReverseString {

	public static void main(String[] args) {
		String s = "hello SprintQA. We are learning Java";
		
		//Java learning are We SprintQA. hello
		
		String words[] = s.split(" ");
		
		String revString="";
		
		for(int i= words.length-1;i>=0;i--) {
			
			revString= revString + words[i]+" "; 
		}
		
		System.out.println(revString);
	}

}
