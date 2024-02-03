 package com.flyingsaucer;

 class Details{
		
		private String name;
		private int id;
		
		public Details(){
			System.out.println("In default constructor Details");
			
			this.name = "Kartik";
			this.id = 007; 
			System.out.println("Details :"+name+' '+id); 	
		}
		
		public Details(String name, int id) {
			System.out.println("In parameterized constructor Details");
			
			this.name = name;
			this.id = id;
			System.out.println("Details :"+name+' '+id);	
		}
	}
 
 class Vitals extends Details{
	 
	 private float height;
	 private float weight;
	 
	 public Vitals() {
			System.out.println("In default constructor Vitals");
			
			this.height = 5.11f ;
			this.weight = 95f; 
			System.out.println("Vitals :"+height+' '+weight);
	 }
	 
	 public Vitals(float height, float weight) {
		 	super("Tiger",1010 ); // parameterized super help to call the super class parameterized constructor
			System.out.println("In parameterized constructor Vitals");
			
			this.height = height ;
			this.weight = weight; 
			System.out.println("Vitals :"+height+' '+weight);	 	 
	 }
	 
	 
 }
 
 
public class CJ_05_superAndExtends {
	
	
	public static void main(String[] args) {
		Vitals v = new Vitals();
		
		System.out.println("\n Now calling all the parameterized constructors... \n");
		
		Vitals v2 = new Vitals(6.11f, 12);

	}

}
