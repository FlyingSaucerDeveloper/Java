package com.flyingsaucer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DSA_01_LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums= new ArrayList<Integer>();
		
		for(int i=0; i<=10000000; i++) {
						nums.add(i);
			}
		Collections.shuffle(nums);
		//Collections.sort(nums);
		
		System.out.println("Unsorted List: "+nums);
		
	// Sorting the array using the TreeSet.
		Set<Integer> set = new TreeSet<Integer>(nums);
		List<Integer> numsSorted= new ArrayList<Integer>(set); 
		
		System.out.println("Sorted List: "+numsSorted);
		
		int search = 700003;
		int stepCounter= 0;
		
		for(int i =0; i<=numsSorted.size();i++) {
			stepCounter++;
			
			if (search == numsSorted.get(i)) {
				System.out.println("The number found");
				break;
			}
			
		}
		
		System.out.println("Total steps taken: "+stepCounter);
		
   
       
		
		
	}

}
