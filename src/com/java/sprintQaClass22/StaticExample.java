package com.java.sprintQaClass22;

class StaticKeyword{
	
	static int count =0;
	
	int i=10;
	
	StaticKeyword() {
		count++;
	}
	
	public void display() {
		System.out.println(count);
	}
}

public class StaticExample {

	public static void main(String args[]) {
		
	
	StaticKeyword s1 = new StaticKeyword();
	
	StaticKeyword s2 = new StaticKeyword();
	StaticKeyword s3 = new StaticKeyword();
	
	System.out.println(StaticKeyword.count);
	
	}

}
