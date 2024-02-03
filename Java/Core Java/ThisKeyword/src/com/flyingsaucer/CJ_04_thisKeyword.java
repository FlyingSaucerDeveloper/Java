package com.flyingsaucer;

public class CJ_04_thisKeyword {

	
	public static void main(String[] args) {
	
		Details d = new Details();
		d.setName("Kartik");
		d.setLastName("DS");
		d.Details();
	}

}

class Details{
	private String name;
	private String lastName;
	
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name; // this keyword set the variable value to the instance variable
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Details(){ //this is a constructor
		System.out.println("Full name: "+name+" "+lastName);
		
	}
	
	public void Details(){ //this is not a constructor as it has a data type
		System.out.println("Full name: "+name+" "+lastName);
		
	}
	
	
}