package com.java.sprintQaClass33;

interface A {
	int i =10;   // public static final
	 void display();    //public and abstract
}
interface X extends A{
	 void print();
}
class B implements X{
	public void display(){
		System.out.println("B is displaying");
	}

	@Override
	public void print() {
		System.out.println("B is printing");
	}
}


public class InterfaceTesting {

	public static void main(String[] args) {
		

	}

}
