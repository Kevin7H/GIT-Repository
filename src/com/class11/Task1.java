package com.class11;

public class Task1 {
	public static void main(String[] args) {
		String [] cars= {"Honda Civic", "Toyota Camry", "Chevy Camaro", 
				"Toyota Sienna", "Honda Accorda", "Nissan Pathfinder"};
		System.out.println("----First Loop----");
		for (String list:cars) {
			System.out.println(list);
		}
		System.out.println("----Second Loop----");
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}

}
