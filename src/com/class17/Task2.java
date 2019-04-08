package com.class17;

public class Task2 {

	//Create a method that will take a number and prints whether the number is even or odd.
	
	public static void main(String[] args) {

		Task2 obj = new Task2();

		obj.evenOrOdd(34);
		obj.evenOrOdd(41);
	}

	void evenOrOdd(int a) {

		if (a%2==0) {
			System.out.println(a+" is an even number");
		} else {
			System.out.println(a+" is an odd number");
		}
	}
}

