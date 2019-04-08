package com.class11;

public class Task2 {
	public static void main(String[] args) {
		String [] countries= {"USA", "El Salvador", "Luxembourg"};
		String [] capitals= {"Washington D.C.", "San Salvador", "Luxembourg"};
		for (int i=0; i<countries.length; i++){
			if (countries[i].equals(capitals[i])) {
			}
		System.out.println("The country is "+countries[i]+
				" and the capital is "+capitals[i]);
		}
	}

}
