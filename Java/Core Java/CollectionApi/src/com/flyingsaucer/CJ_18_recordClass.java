package com.flyingsaucer;

import java.util.ArrayList;
import java.util.List;

record StudDetails(String Name, int id) {

	// The record class automatically overrides toString, equal and hashcode.  
	// Getters and Setters are not there as variables in this class are immutable.
	// can implement but can only extends record class
}

public class CJ_18_recordClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudDetails> details = new ArrayList<StudDetails>();
			
		details.add(new StudDetails("Kartik", 21));
		details.add(new StudDetails("Harsh", 32));
		details.add(new StudDetails("Shivam", 22));
		details.add(new StudDetails("Shivam", 22));
				
		System.out.println(details.get(0));
	}

}
