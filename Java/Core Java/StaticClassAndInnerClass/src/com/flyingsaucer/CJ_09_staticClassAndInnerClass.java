package com.flyingsaucer;

class A{
	
	public static void m() {
		
		System.out.println("This is static method in A");
	}
	
	public void show() {
	
		System.out.println("In Class A");
	}	

	class B{
		
		public void show() {
			
			System.out.println("In Class B");
		}
		
	}
	
	static class C{
		
		public static void show() {
			
			System.out.println("In Class C");
		}
		
	}
	
	
}
class Z {
	
	public void show() {
		
		System.out.println("In Class Z");
	}
	
	
}



public class CJ_09_staticClassAndInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A o = new A();
		
		A.m(); // static method can run direclty using the class name, no object creation is required
		
		o.show();
		
		//A.B.show(); // This cannot run as B is inner class but not static inner class, 
					//therefore we can call B class method using the A class to create object for B class.
		
		A.B ob = o.new B(); // the object reference is from A to B (A.B) and the object of A is used to create the object for B.
		ob.show();
		
		A.C.show(); // This runs as c is static inner class
		
		
		Z obj = new Z();
		obj.show();
		
		Z obj1 = new Z() {
			
			public void show() {
				System.out.println("In the Anonymous inner class z"); // the class that has no name bit has a definition, 
				                                                     //but to have this class the original same named class should exist
			}
			
		};
		
		obj1.show();
		

	}

}
