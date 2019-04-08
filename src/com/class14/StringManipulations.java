package com.class14;

public class StringManipulations {
	public static void main(String[] args) {
		
		String str="I am a good tester#1!";
		String newStr=str.replace("a","e");
		System.out.println(newStr);
		
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		
		String newStr2=str.replace("tester","programmer");
		System.out.println(newStr2);
		
		String newStr3=str.replace("Tester","programmer");
		System.out.println(newStr2);
		
		str=str.replace("!","?");
		System.out.println(str);
		
		str=str.replace("1","2");
		System.out.println(str);
		
		String str1="12Hello 3234 World 465&^&";
		String replaceNoNumbers=str1.replaceAll("[0-9]","");
		System.out.println(replaceNoNumbers);
		
		String newString=replaceNoNumbers.replaceAll("[^A-Za-z]","");
		System.out.println(newString);
		
		String replaceNoCharacters=replaceNoNumbers.replaceAll("[A-Za-z]","");
		System.out.println(replaceNoCharacters);
		
		String str2="1HelloWorld123";
		System.out.println(str2.replaceAll("^0-9", ""));
				
	}

}
