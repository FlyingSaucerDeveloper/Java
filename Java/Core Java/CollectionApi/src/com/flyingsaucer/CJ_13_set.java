package com.flyingsaucer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CJ_13_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s1 = new HashSet<Integer>();
		System.out.println("This is a HashSet - Unsorted");
		
		// add elements
		
		int j=0;
		int maxLimit = 100;
		Random random = new Random();
		for (int i =0; i<= 10; i++) {
			
			j = random.nextInt(maxLimit);
			s1.add(j);
		}

		
		
		//PRINT 
		System.out.println(s1); // same element will be deleted
	
		
		
		//Converting to Treeset to have sorted elements
		System.out.println("\nConverting he Hashset to Treeset to get sorted elements");
		
		Set<Integer> s2 = new TreeSet<Integer>(s1);
		
		//PRINT 
		System.out.println(s2); //sorted elemets
		
		//Print value at an index
		System.out.println("\nPrinting the valuse index by index");
		
		Iterator<Integer> setVals = s2.iterator();
			
		while(setVals.hasNext()) {
		System.out.println(setVals.next());
		}
		
		

	}

}
