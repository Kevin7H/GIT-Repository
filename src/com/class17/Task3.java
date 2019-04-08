package com.class17;

import java.util.Scanner;

public class Task3 {

	//Create a method that will print whether given String is palindrome or not.
	
	String b, a;	
	public static void main(String[] args) {

		Task2 obj = new Task2();
		
		String a="racecar";
		
		int num = 11221, reversedInteger = 0, remainder, originalInteger;

	        originalInteger = num;

	        // reversed integer is stored in variable
	        for( ;num != 0; num /= 10 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	        }

	        // palindrome if orignalInteger and reversedInteger are equal
	        if (originalInteger == reversedInteger)
	            System.out.println(originalInteger + " is a palindrome.");
	        else
	            System.out.println(originalInteger + " is not a palindrome.");
	    }
	
}

