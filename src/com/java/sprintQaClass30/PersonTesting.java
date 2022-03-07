package com.java.sprintQaClass30;

interface Person{
	
	void travel();  //public abstract
}
interface Employee {
	
	void getSalary();
}
class QAEngineer implements Employee, Person{
	//implement all abstract methods from Employee and Person class
	void performTesting() {
		System.out.println("Perform Testing");
	}

	@Override
	public void getSalary() {
		System.out.println("Salary is 120K");
	}

	@Override
	public void travel() {
		System.out.println("You are travelling...");
	}
}
public class PersonTesting {

	public static void main(String[] args) {
		
		QAEngineer irina = new QAEngineer();
		irina.getSalary();
		irina.performTesting();
		irina.travel();
		
		String a = "10",b="20";
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
		
	}

}
