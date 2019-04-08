package com.class17;

public class Task1 {

	// Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.

	public static void main(String[] args) {

		Task1 obj = new Task1();

		obj.findLargest(34, 41);
		obj.findLargest(78, 13);
	}

	void findLargest(int a, int b) {

		if (a > b) {
			System.out.println(a+" is larger than "+b);
		} else {
			System.out.println(b+" is larger than "+a);
		}
	}
}
