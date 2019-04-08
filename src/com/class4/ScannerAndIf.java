package com.class4;

import java.util.Scanner;

public class ScannerAndIf {
	public static void main(String[] args) {
		int a,b;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first number.");
		a = input.nextInt();
		System.out.println("Please enter second number.");
		b = input.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		if (a>b) {
			System.out.println(a+" is larger than "+b);
		}else if (b>a){
			System.out.println(a+" is smaller than "+b);
		}else {
			System.out.println(a+" is equal to "+b);
		}
		System.out.println("I am done.");
	}

}
