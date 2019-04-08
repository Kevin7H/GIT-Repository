package com.class7;

public class Task {
	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		
		while (day<6) {
			day++;
			System.out.println("I need a day off");
			if (day>=6) {
				workDay=false;
				System.out.println("I don't need a day off");
			}
		}
		

	}

}
