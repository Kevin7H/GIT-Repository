package com.class2;

public class VariableChange {
	public static void main(String[] args) {
		
		String name="Jane";
		
		String lastName="Smith";
		System.out.println(lastName);

		lastName="Hernandez";
		
		System.out.println(lastName);
		char	grade= 'B';
		//char grade='A'; do not work
		grade=67;
		String city="Fairfax";
		System.out.println(city);
		
		city= "New York";//value of variable is changed
		
		System.out.println(grade);
		System.out.println(city);
		/*Whatever you declared last for a variable is most recent 
		therefore is the one that shows up*/
		
	}

}
