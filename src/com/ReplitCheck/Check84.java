package com.ReplitCheck;

public class Check84 {
	 
//	For you to do 
//		create one method and  pass a String  as single parameter in method 
//		and write the logic for that method in println statement two print twice 
//		and call the method in main method pass the the String as 
//		"Don't make me say this twice!"
	
	void PrintTwice(String s){
	    System.out.println(s);
	    System.out.println(s);
	  }
	  public static void main(String[] args) {
	    Check84 mm=new Check84();
	    mm.PrintTwice("Don't make me say this twice!");
	  }
	}