package com.class20;

public class Tasks {

//	Create a method that will take 1 parameter as a String and return reversed String. 
//	Method should be visibly only within same package.
//
//			Create a method that will take a String and return whether String is palindrome or not. 
//	Method should available to all classes within your projects.
//
//			Create a method that will take a string and return array of words from that string. 
//	Method should be available only within same class.

	String result = "";

	String reversed(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}
	String palindrome(String s1) {

	    for ( int i = s1.length() - 1 ; i >= 0 ; i-- ) {
	       result+=s1.charAt(i);
	    }
	    if (s1.equalsIgnoreCase(result)) {
	    	result="palindrome";
	    }else {
	    	result="not palindrome";
	    }
	    return result;
	}
	String [] split(String s2) {
		return s2.split("");
	}

	public static void main(String[] args) {
		Tasks m = new Tasks();
		String rev = m.reversed("This is reversed");
		System.out.println(rev);
		String pal = m.palindrome("tat");
		System.out.println(pal);	
		String[] spl = m.split("tat");
		System.out.println(pal);

		
	}

}
