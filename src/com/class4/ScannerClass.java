package com.class4;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		//take an number form a user and print that number
		
		int num=22;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		int myNumber=scan.nextInt();
		
		System.out.println("The number you entered is "+myNumber);
	}
	
}
