package com.class7;
import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		
		String name;
		Scanner input=new Scanner(System.in);
		
		int a=1;
		
		while (a<=2) {
			System.out.println("Please enter your name");
			name=input.nextLine();
			System.out.println("You are doing great "+name);
			a++;
		}
		
		
	}

}
