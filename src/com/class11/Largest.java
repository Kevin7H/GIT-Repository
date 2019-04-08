package com.class11;

public class Largest {
	public static void main(String[] args) {
		int [] num= {8,45,23,9,34,53};
		int largest=num[0];
		for (int i=0; i<num.length; i++) {
			if (num[i]>largest) {
				largest=num[i];
			}
			
		}System.out.println(largest);
	}

}
