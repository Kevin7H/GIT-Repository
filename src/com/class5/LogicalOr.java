package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
		
		/* we have 7 days a week
		 * if days are from 1-5----->weekday
		 * if days are from 6-7----->weekend
		 * otherwise "Not a valid day"
		 */
		
		int day=4;
		//false OR false OR false OR false --> True
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7){
			//false OR false --> false
			System.out.println("It is a weekend");
		}else {
			System.out.println("Not a valid day");
		}
	}

}
