package com.flyingsaucer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DSA_03_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = new ArrayList<Integer> ();
		
		for (int i=0 ; i<=10; i++) {
			nums.add(i);
		}
		
		Collections.shuffle(nums);
		System.out.println("Unsorted List :"+nums);
				
		//Sorting using BubbleSort
		int end = nums.size();
		
		int temp =0;

		
		for (int i=0; i<end; i++) 
			{	
			System.out.println("The Sorting  : "+ nums);
				for (int j =0;j<end-1;j++) //if j= end , ten index out of bound error comes as last index is always size-1
				{
				
					if (nums.get(j)>nums.get(j+1)) 
						{
					
							temp = nums.get(j);
							nums.set(j, nums.get(j+1)); 
							nums.set(j+1, temp); 							
						}
				}
			}
		
		System.out.println("The Sorted List using size-1 : "+ nums);

		// Sorting the list using size-i-1 as we need not to always check the last value, as its already sorted.
		
		Collections.shuffle(nums);
		
		for (int i=0; i<end; i++) 
		{	
		System.out.println("The Sorting  : "+ nums);
			for (int j =0;j<end-i-1;j++) //if j= end , ten index out of bound error comes as last index is always size-1
			{
			
				if (nums.get(j)>nums.get(j+1)) 
					{
				
						temp = nums.get(j);
						nums.set(j, nums.get(j+1)); 
						nums.set(j+1, temp); 							
					}
			}
		}
	
	System.out.println("The Sorted List using size-i-1 : "+ nums);
		
		
		
		
	}

}
