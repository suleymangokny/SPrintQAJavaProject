package com.java.sprintQaClass33;

abstract class Z {

	int i = 10;

	Z() {
		System.out.println("A constructor");
	}

	void display() {
		
	}

	abstract void print();
}

class Y extends Z {
	Y() {
		System.out.println("B constructor");
	}

	void print() {
		System.out.println("B is printing");
	}
}

public class Testing {
	public static void main(String[] args) {
		Y obj = new Y();
		obj.display();
		obj.print();

	}
}