package com.class17_2;

public class Pyramid {

	public static void main(String[] args) {
		Pyramid obj=new Pyramid();
		obj.pyramid();
	}
	void pyramid() {
		/*I want to print pattern
		 * 		*
		 *  	**
		 *  	***
		 *   	****
		 */
		
		
		for (int i=0; i<4; i++) {
			
			for (int y=0; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
