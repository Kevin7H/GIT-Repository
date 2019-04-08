package com.MyPractice;

public class Class2Practice {
	public static void main(String[] args) {
		String a = "Iglesia Monte de Sion";
		String b = "Manassas";
		String c = "VA";
		String d = "www.imontedesion.org";

		String information = String.format(
				"We invite you to our latino church %s " 
						+ "located in %s, %s.\nIf you need any information about it"
						+ ", you can visit %s.\nThank you very much.  God bless!!",
				a, b, c, d);

		System.out.println(information);

	}

}
