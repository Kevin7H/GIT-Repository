package com.MyPractice;

public class No2 {
	public static void main(String[]args) {
		int a,b,c,q,w,e;
		a=345;
		b=465644;
		c=579;
		q=a*b;
		w=c/b;
		e=b-q;
		
		
		String line= String.format(
					"%s is the mul of %s and %s, while %s is the division of %s and %s.\n"
					+ "Finally %s is the subtraction of %s and %s!",q,a,b,w,c,b,e,b,q);
		System.out.println(line);
	}

}
