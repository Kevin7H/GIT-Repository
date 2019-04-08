package com.class17_2;

import com.class17.Calculator;

public class Application1 {

	public static void main(String[] args) {
		Calculator operations = new Calculator();

		System.out.println(operations.sum(5, 5));
		System.out.println(operations.sub(123, 150));
		System.out.println(operations.div(123, 150));
		System.out.println(operations.mult(123, 150));

	}
}