package com.class14;

public class StringSplit {
	public static void main(String[] args) {
		
		String str="Welcome Syntax Students! Batch 4 you are great";
		String [] array=str.split("!");
		System.out.println(array.length);
		for(String subString: array) {
			System.out.println(subString);
		}
		System.out.println("----------");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
