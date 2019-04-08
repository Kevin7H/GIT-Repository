package com.class5;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		double height;
		
		Scanner 
		input=new Scanner(System.in);
		System.out.println("Please enter your your height");
		height=input.nextDouble();
		
		
		if (height < 5) {
			System.out.println("You are short");
		}else if (height >5 && height <=6) {
			System.out.println("you are medium height");
		}else {
			System.out.println("You are tall");
		}
	}

}
