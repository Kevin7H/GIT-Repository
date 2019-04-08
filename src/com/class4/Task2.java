package com.class4;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int age;
		Scanner input=new Scanner(System.in);
		System.out.println("May I please have your age.");
		age=input.nextInt();
		
		if (age>=18) {
			System.out.println("You will be issued a driver's license, have a good day.");
		}else {
			System.out.println("You will be issued a learner's permit, have a good day.");
		}
	}

}
