package com.java.sprintQaClass33;

import java.io.IOError;
import java.io.IOException;

public class ThrowsEx2 {

	public static void main(String[] args) throws InterruptedException {
		
		method1();

	}
	
	static void method1() throws InterruptedException {
		method2();
	}

	static void method2() throws InterruptedException{
		method3();
	}
	
	static void method3() throws InterruptedException{
		Thread.sleep(5000);
	}
}
