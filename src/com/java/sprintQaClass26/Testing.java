package com.java.sprintQaClass26;

public class Testing {

	public static void main(String[] args) {
		
		ParentClass p1 = new ParentClass();
		
		p1.feature1();
		
		ChildClass c1 = new ChildClass();
		
		c1.feature1();
		c1.feature4();
		
		ParentClass p2 = new ChildClass();
		p2.feature1();
		
		
		
		}

}
