package com.java.sprintQaClass31;

interface Person {

	void eat();
	void sleep();
}

//relation between 2 interfaces is extends
interface Employee extends Person{
	
	void getSalary();
}

//class has to implement abstract methods of Employee + abstract methods of Person
class QaEngineer implements Employee{

	@Override
	public void eat() {
		System.out.println("Eating...");
	}

	@Override
	public void getSalary() {
		System.out.println("Salary is 12K");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}


}