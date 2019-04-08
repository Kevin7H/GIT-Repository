package com.class2;

public class StringConcatenation {

	public static void main(String[] args) {
		String name = "John";
		System.out.println("My name is " + name);

		String day = "Sunday";
		// Sunday is a coding day

		System.out.println(day + " is a coding day");
		int num1 = 12;
		int num2 = 13;
		// The valye of num1 is ___ and the value of num2 is ___.

		System.out.println("The value of num1 is " + num1 + " and the value of num2 is " + num2);
		String lastName = "Smith";
		char grade = 'B';
		String city = "Fairfax";
		String state = "VA";
		String phoneNumber = "(576)874-3454";

		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I am a " + grade + " student");
		System.out.println("I live in the city of " + city + " in the state of " + state);
		System.out.println("My phone number is " + phoneNumber);

		String information = String.format(
				"My first name is %s and my last name is %s. \nI am a %s student. \n"
						+ "I live in %s in the state of %s. \nMy phone number is %s.",
				name, lastName, grade, city, state, phoneNumber);
		System.out.println(information);

	}

}
