package com.MyPractice;

public class AnotherfPractice {
	public static void main(String[] args) {
		String a,b,c,d,e,f,g;
		a="Hello";
		b="Goodbye";
		c="Salut";
		d="Arevoir";
		e="Someting";
		f="something";
		g="Real";
		
		
		String information =	String.format(
				"%s is different than %s.\n"
				+"%s is french for %s or %s, just as well as %s.\n"
				+"%s is spelled wrong, it should be %s and %s is just another word.",a,b,c,a,b,d,e,f,g);
		
		System.out.println(information);
	}

}
