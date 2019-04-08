package com.class5;

public class NestedIfPractice {
	public static void main(String[] args) {
		/*
		 * check if user has credit card--> chech what is the balan e if balance is more
		 * than 1000---> pay off else "you are good"
		 */

		boolean creditCard = true;
		int balance = 900;

		if (creditCard) {
			System.out.println("Let's check the balance");
					if (balance >= 1000) {
						System.out.println("Pay off now");
					} else if (balance==0){
						System.out.println("please use your card");
					}else {
						System.out.println("you are good");
					}
		} else {
			System.out.println("Do you want a credit card?");

		}
	}

}
