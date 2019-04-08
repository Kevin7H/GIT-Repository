package com.class4;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int loan;
		
		Scanner input =new Scanner(System.in);
		System.out.println("Hello!  What is the amount that you need for the loan?");
		loan=input.nextInt();
		
		if (loan<200000) {
			System.out.println("You are eligible for a loan of "+loan+", thank you have a nice day!");
		}else {
			System.out.println("I'm sorry but you are not eligible for the loan of "
		+loan+", thank you for inquiring with us.");
		}
	}

}
