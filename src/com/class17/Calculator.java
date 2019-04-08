package com.class17;

public class Calculator {
	public static void main(String[] args) {
		
	Calculator obj=new Calculator();
	
	System.out.println(obj.sum(5, 5));
	System.out.println(obj.sub(5, 5));
	System.out.println(obj.div(5, 5));
	System.out.println(obj.mult(5, 5));
	 
}

	public int sum(int x, int y) {
	return x + y;

}	public int sub(int x, int y) {
	return x - y;
	
}	public int div(int x, int y) {
	return x / y;

}	public int mult(int x, int y) {
	return x * y;
}
}
