package com.class6;

import java.util.Scanner;

public class NotOperator {
	public static void main(String[] args) {
		
		boolean a=!true;
		
		System.out.println("The value of boolean variable is "+a);
		
		boolean snow=true;
		
		
		if (!snow) {
			System.out.println("I will stay at home");
			
		}
		
		int x=10;
		int y=20;
		
		if (!(x>y)) {
			System.out.println("Hello");
		}
		
		int num1, num2, num3, largest = 0;
		
		
		Scanner scan=new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if (!(num1==num2 && num1==num3 && num2==num3)) {
			if (num1>num2) {
				if (num1>num3) {
					largest=num1;
				}else {
					largest=num3;
				}
			}else {
				if (num2>num3) {
					largest=num2;
				}else {
					largest=num3;
				}
			}
		}else {
			System.out.println("All numbers are equal");
		}
		System.out.println("The largest number is "+largest);
	}

}
