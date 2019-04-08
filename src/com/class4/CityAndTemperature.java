package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
		String cityName;
		int temp;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your city.");
		cityName=input.nextLine();
		System.out.println("Please enter temperature in "+cityName);
		temp = input.nextInt();
		//formula (F-32) *5/9;
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The temperature in the city "+cityName+" is "+convertedTemp+" Celsius.");
	}

}
