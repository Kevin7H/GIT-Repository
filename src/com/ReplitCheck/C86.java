package com.ReplitCheck;

public class C86 {

//	For you to do 
//		Multiple Parameters for method
//		create three method with  Multiple Parameters as int 
//		and write the logic in that method to perform multiplication,addition and subtraction
//		and call the method in main method with values 
//
//		1. for the addition method add two numbers to make 30 but put those numbers in the parameters
//		2. for multiplication multiply two numbers to make 30 but put those two numbers in your parameters
//		3. for Subtraction subtract two numbers to equal 20, with using parameters.
//		30 for addition
//		30 for multiplication
//		20 for subtraction
	int mult(int a, int b) {
		return a * b;
	}
	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {

		C86 mm = new C86();
		System.out.println(mm.mult(2, 15));
		System.out.println(mm.add(15, 15));
		System.out.println(mm.sub(30, 10));
	}
}