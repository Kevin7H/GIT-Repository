package com.class20;

public class AccessModifiers {
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.reverseString("Hello");
		String reversed = obj.reverseString("Hello");
		System.out.println(reversed);

		System.out.println(obj.isPalindrome("mom"));

	}

	protected String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		return reversed;
	}
	
	public boolean isPalindrome(String str) {
		boolean flag = false;

		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		if (reversed.equalsIgnoreCase(str)) {
			flag = true;
		}
		return flag;
	}

}
