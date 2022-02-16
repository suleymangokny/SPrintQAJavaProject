package com.java.sprintQaClass16;

public class StringMethodsPart3 {

	public static void main(String[] args) {
		String s1 = "Welcome ##";
		s1 = s1.replace("##", "SprintQA");
		System.out.println(s1);
		
		String date = "3-2-2022";
		String dateParts[] = date.split("-");
		
		System.out.println(dateParts[2]);
		
		String s2 = "Hi, pay attention. We are learning Java Strings";
		String s2Parts[] =  s2.split(" ");
		
		for(String s:s2Parts) {
			System.out.println(s);
		}
		
		System.out.println(s1.startsWith("SprintQA"));
		System.out.println(s1.endsWith("SprintQA"));

		
	}

}
