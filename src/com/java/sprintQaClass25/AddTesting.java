package com.java.sprintQaClass25;

class Add{
	//1
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	//2
	void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	//3
	void sum(int a, double b) {
		System.out.println(a+b);
	}
	//4
	void sum(String s,int i) {
		System.out.println(s+i);
	}
	//5
	void sum(int i, String s) {
		System.out.println(i+s);
	}
}

public class AddTesting {

	public static void main(String[] args) {
		Add a = new Add();
		a.sum(10, 20);        //1  
		a.sum(10, 20, 30);    //2
		a.sum(10, 10.7);      //3
		
		a.sum("SprintQa", 10);  //4
		a.sum(10, "SprintQa");  //5
	}

}
