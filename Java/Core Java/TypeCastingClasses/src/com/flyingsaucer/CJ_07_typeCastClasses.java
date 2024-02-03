package com.flyingsaucer;


class A{
	
	public void show() {
	
		System.out.print("In Class A");
	}	
	
}

class B extends A{
	
	public void show() { //A class show method will not run as it has been overriden by B call show method
	
		System.out.println("In Class B");
	}	
	
	public void show1() {
		
		System.out.println("Againg In Class B");
	}	
	
	
}


public class CJ_07_typeCastClasses {

	public static void main(String[] args) {
		
		A o = new B(); // in backend it looks like this A o = (A) new B(), though the object is made of B class, but the refrence is of type A class, 
					  // therefore the object is automatically casted to the parent, this is known as up-casting 
		
		o.show();
	//	o.show1(); this does not work as the object type is in A, and A does not have show1().
		
		
		B o2 = (B) o; // Type casting the B to A type object, since A is the parent, therefore this is know as down-casting
		o2.show1();
		
	} 

}
