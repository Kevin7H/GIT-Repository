package com.MyPractice;

public class StringFormatPractice {
public static void main(String[]args) {
	String a,b,c,d;
	a="Kevin";
	b="How";
	c="are you";
	d="doing?";
	
	String sentence =  String.format("Good morning %s, beautiful weather we're having,\n%s %s %s",a,b,c,d);
	System.out.println(sentence);
}
}
