package com.flyingsaucer;

import java.util.ArrayList;
import java.util.List;



public class DSA_02_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> nums = new ArrayList<Integer> ();
		
		for (int i=0 ; i<=10000000; i++) {
			nums.add(i);
		}
		
		
		int search = 700003;
	
		
		//Binary Search
		
		int start = 0;
		int end = nums.size();
		int cutsInIF = 0;
		int cutsInElse = 0;
		
		int stepCounter =0;
		
		for (int i=start; i<=end; i++) 
		{
			stepCounter++;
			int mid = (int)((start+end)/2);
			System.out.println("\nThe Start is :"+ start+ "\nThe Mid is :"+ mid+ "\nThe End is :"+end );
			
			if (search<=nums.get(mid) && search>nums.get(start)) {
				cutsInIF++;
				end = mid;
				if (search==nums.get(mid)) {
					
					System.out.println("\nThe number is found at index :" + mid );
					break;
				}
						
			}
			else if (search>nums.get(mid)){
				start = mid;
				cutsInElse++;
				
			}
		}
		

		System.out.println("Total steps taken: "+stepCounter);
		
		System.out.println("\nTotal Cuts in IF: "+cutsInIF);
		System.out.println("Total Cuts in Else: "+cutsInElse);
		
		
		
		

	}

}
