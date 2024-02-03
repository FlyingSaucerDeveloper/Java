package com.flyingsaucer;

import java.util.Scanner;


public class CJ_06_advanceCalculator {

	public static void main(String[] args) {
		
		double nums[] = new double[2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter two numbers as per instructions\n");
		
		System.out.print("Enter First number :");
		nums[0] = sc.nextDouble();
		
		System.out.print("Enter Second number :");
		nums[1] = sc.nextDouble();
		
		Calculate c = new Calculate (nums[0],nums[1]); //using parameterized constructor
		
		c.square(nums[0], nums[1]);
		c.squareRoot(nums[0], nums[1]);
		c.division(nums[0], nums[1]);
		c.multiplication(nums[0], nums[1]);
		c.addition(nums[0], nums[1]);
		c.substraction(nums[0], nums[1]);
		
	}

}
