package com.flyingsaucer;

public class CJ_08_wrapperClasses {

	public static void main(String[] args) {

		int n1 = 8;

		Integer n2 = new Integer(9);// Boxing
		Integer n3 = 10; // auto boxing

		int n4 = n2.intValue();// unBoxing
		int n5 = n3; // auto unBoxing

		// some string function

		String s = "404";
		int notFound = Integer.parseInt(s);
		
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		System.out.println("n3: "+n3);
		System.out.println("n4: "+n4);
		System.out.println("n5: "+n5);
		System.out.println("not found: "+notFound);
		

	}

}
