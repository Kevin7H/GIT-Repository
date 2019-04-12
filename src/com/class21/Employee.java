package com.class21;

public class Employee {

	static String ceo = "Sumair";
	int salary, eID;

	public static void main(String[] args) {

		Employee emp1 = new Employee();

		emp1.eID = 001;
		emp1.salary = 30000;
		emp1.result();

		Employee emp2 = new Employee();

		emp2.eID = 002;
		emp2.salary = 40000;
		emp2.result();
	}

	void result() {
		System.out
				.println("This employee eID is " + eID + " and their salary is " + salary + " and their ceo is " + ceo);
	}

}
