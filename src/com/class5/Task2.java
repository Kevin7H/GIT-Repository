package com.class5;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		int quiz;
		int midTerm;
		int finalScore;
		
		Scanner
		input =new Scanner(System.in);
		System.out.println("Enter your quiz score");
		quiz = input.nextInt();
		System.out.println("Enter your mid term score");
		midTerm=input.nextInt();
		System.out.println("Enter your final score");
		finalScore=input.nextInt();
		
		int grade=(quiz+midTerm+finalScore)/3;
		
		System.out.println("Average score is "+grade);
		
		if (grade >= 90) {
			System.out.println("You are an A grade student.");
		}else if (grade>=70 && grade <90) {
			System.out.println("You are a B grade student.");
		}else if (grade>=50 && grade <70) {
			System.out.println("You are a C grade student.");
		}else {
			System.out.println("You are a F grade student.");
		}
	}

}
