package com.MyPractice;
import java.util.Scanner;

public class MorePractice {
	public static void  main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name=input.nextLine();
		System.out.println("Enter your last name.");
		String lastName=input.nextLine();
		System.out.println("Hello Mr. "+lastName+", it is nice to meet your aquantaince.\n"
				+ "What can we help you with today?");
		String feedback =input.nextLine();
		System.out.println("Thank you.\nWe appreciate your feedback, we'll get back to you on this matter.");
		
		
		
	}
	
}
