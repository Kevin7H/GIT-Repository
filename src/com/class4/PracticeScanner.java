package com.class4;

import java.util.Scanner;

public class PracticeScanner {
	public static void main(String[] args) {
		
		String a,b,c;
		
		
		Scanner input =new Scanner(System.in);
		System.out.println("What is your name?");
		a = input.nextLine();
		System.out.println("What is your last name?");
		b = input.nextLine();
		System.out.println("What is your favorite color?");
		c = input.nextLine();
		System.out.printf("Thank you for your input %s!!\n"
				+ "Your input is very important for us, we'll make sure to get you your car in the color %s.\n"
				+ "Have a great day Mr. %s",a,c,b);
	}

}
