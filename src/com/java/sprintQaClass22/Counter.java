package com.java.sprintQaClass22;

class Counter{  
static int count=0;
  
    static void changeCount() {
    	count = 500;
    	System.out.println(count);
    }
	public static void main(String args[]){  

		Counter.changeCount();
	}  
}  