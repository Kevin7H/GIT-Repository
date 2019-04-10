package com.class20;

public class Task {

//		create a method createEmail()
//		Based on provided users name, lastName and email type,
//		your method should return complete email Address;
//		jonsnow@email.com
//		jonsnow@yahoo.com

	public static void main(String[] args) {

		Task mm = new Task();
		String email = mm.createEmail("Jon", "Snow", "gmail");
		System.out.println(email.toLowerCase());

		email = mm.createEmail("Bob", "Snow", "yahoo");
		System.out.println(email.toLowerCase());
	}

	String createEmail(String name, String lastName, String emailType) {
		String email = name + lastName + "@" + emailType + ".com";
		return email;
	}
}
