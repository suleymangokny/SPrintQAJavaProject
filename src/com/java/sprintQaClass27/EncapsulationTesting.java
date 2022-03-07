package com.java.sprintQaClass27;

public class EncapsulationTesting {

	public static void main(String[] args) {
		
		ReadOnly r1 = new ReadOnly();
		
		//System.out.println(r1.getBalance());
		
		
		WriteOnly w1 = new WriteOnly();
		
		w1.setBalance(1000);
		
		Bank b1 = new Bank();
		System.out.println(b1.getAccountNumber());
		
		
		
		}
	
	}
