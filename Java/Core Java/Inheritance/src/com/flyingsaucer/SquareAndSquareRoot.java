package com.flyingsaucer;

public class SquareAndSquareRoot extends DivisionAndMultiplication{
	
	public void square (double n1, double n2) {
		
		System.out.println("Square of "+n1+" ="+(n1*n1));
		System.out.println("Square of "+n2+" ="+ Math.pow(n2, 2));
		
	}

	public void squareRoot (double n1, double n2) {
		
		System.out.println("SquareRoot of "+n1+" ="+Math.sqrt(n1));
		System.out.println("SquareRoot of "+n2+" ="+ Math.sqrt(n2));
		
	}

	
	
}
