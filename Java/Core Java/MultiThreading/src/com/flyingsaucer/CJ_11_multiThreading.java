package com.flyingsaucer;

class A {
	
	public void printer() {
		System.out.println("In Class A");
		
	}
	
	
}

class B extends A implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In Class B");
		
	}
	
	
}

class C extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In Class C");
		
	}
}


public class CJ_11_multiThreading {
	


	public static void main(String[] args) {
		
		B o1 = new B();
		C o2 = new C();
		
		o1.printer();
		//  o1.start(); runnable does not have start method
		
		Thread t1 = new Thread(o1);
		t1.start();
		
		o2.start();
		
		
		

	}

}
