package com.java.sprintQaClass30;

final class Parent {
	
	final int i =10;
	final int marks = 20;
	
	final void feature1(){
		System.out.println("Feature 1 from Parent");
	}
}
/*
//final class cannot be extended
class Child extends Parent{
	
	//final method cannot be overridden
	void feature1(){
		System.out.println("Feature 1 from Parent");
	}
	
}*/
public class FinalKeyword{
	public static void main(String[] args) {
		Parent p = new Parent();
		p.feature1();
	}
}