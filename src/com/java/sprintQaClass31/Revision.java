package com.java.sprintQaClass31;


interface A{
	
	int i = 10;        //public static final
	
	void feature1();   //public abstract
}

interface X{
	
	void feature2();
	
}
class B implements A,X{
	
	public void feature1() {
		System.out.println("Feature 1");
	}
	
	public void feature2() {
		System.out.println("Feature 2");
	}
}



public class Revision {

	public static void main(String[] args) {
			
		System.out.println(A.i);

	}

}
