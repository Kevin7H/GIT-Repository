package com.class11;

public class Task2DArray2 {
	public static void main(String[] args) {
		String [] [] students= {
				{"Bob", "Jack", "Chad", "Sarah"},
				{"A", "B"}
				};
		System.out.println("Student "+students[0][0]+" has a grade of "+students[1][0]);
		System.out.println("Student "+students[0][1]+" has a grade of "+students[1][1]);
		System.out.println("Student "+students[0][2]+" has a grade of "+students[1][1]);
		System.out.println("Student "+students[0][3]+" has a grade of "+students[1][0]);
		}

}
