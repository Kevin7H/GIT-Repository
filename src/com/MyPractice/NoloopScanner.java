package com.MyPractice;

import java.util.Scanner;


public class NoloopScanner {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your name");
		String name=input.nextLine();
		System.out.println("enter your last name");
		String lastName=input.nextLine();
		String a,b;
		a="Bob";
		b="Smith";
		if (name.contentEquals(a) && lastName.contentEquals(b)){
			System.out.println("Welcome Mr. Smith");
		}else {
			System.out.println("This is not your account");
		}
		
	}
}
	