package com.class14;

public class Task3 {
	public static void main(String[] args) {

		//You have a String a=�Today is a good day! It is Thursday! We have a Java Class!�. 
		//How would you find out how many sentences are in that String?
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String [] array=a.split("\\?");
		System.out.println(array.length);
		

}
}