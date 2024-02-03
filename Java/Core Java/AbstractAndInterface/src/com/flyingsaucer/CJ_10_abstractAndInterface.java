package com.flyingsaucer;


interface calculation{
	
	int add(int n1, int n2);
	int substract(int n1, int n2);
	
	
}

abstract class calculate{
	
	public abstract int add(int n1, int n2);
	public int subtract(int n1, int n2) 
	{
		System.out.print("In calculate");
		return n2-n1;
		}
	public abstract int multiply(int n1, int n2);
}

class calculator extends calculate implements calculation { // the class can first extend the other class and then implement the interface, not vice versa

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public int substract(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}
	
	public void message() {
		System.out.println("In class calculator");
	}

	@Override
	public int multiply(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}
}


public class CJ_10_abstractAndInterface {

	public static void main(String[] args) {
		calculator cal = new calculator();
		
		System.out.println(cal.add(1, 2));
		System.out.println(cal.substract(1, 2));
		

	}

}
