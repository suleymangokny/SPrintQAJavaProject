package com.java.sprintQaClass27;

public class BankTesting {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		
		
		b1.setAccountName("Alex");
		
		//b1.setBalance(2000);
		
		System.out.println(b1.getAccountName());
		
		System.out.println(b1.getAccountNumber());
		
		System.out.println(b1.getBalance());
		
		//b1.setBalance(5000);
		System.out.println(b1.getBalance());
	
		
		}

}
