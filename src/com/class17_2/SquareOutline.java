package com.class17_2;

public class SquareOutline {

	public static void main(String[] args) {
		SquareOutline obj=new SquareOutline();
		obj.square();
	}
	void square() {
		/*
		 * I want to print pattern ****** -> rows=4, cols=6; * * * * ******
		 */

		for (int i = 1; i <= 4; i++) {

			for (int y = 1; y <= 6; y++) {

				if (i == 1 || i == 4 || y == 1 || y == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}
}
