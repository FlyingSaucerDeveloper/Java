package com.flyingsaucer;

public class CJ_03_conversionsAndTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a= 127;
		int b = 256;
		b=a; // Conversion
		System.out.println(b);
		
		 a= 127;
		 b = 25;
		 int c= 257;
		a=(byte)b; //Type Casting
		System.out.println(a);
		a = (byte)c; // To store the integer in the Byte, the system takes the modulus i.e int%byte if the int is greater than 255
		System.out.println(a);
		
		a= 50;
		byte d = 10;
		b= a*d; // This is type promotion, multiplying two byte a & d will give a value more than 255, we are storing in int variable, therefore the result will be promoted to integer
		System.out.print(b);		
		
		
	}

}
