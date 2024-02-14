package com.flyingsaucer;


public class DSA_04_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {6,5,2,8,9,4};
		int temp =0;
		
		System.out.print("Unsorted array: ");
		for (int i : nums) {
			System.out.print(i + ", ");
			
		}
		
		int minIndex =0;
		
		for (int i=0; i<nums.length;i++) {
			minIndex = i;
			
			for (int j=i+1;j<nums.length;j++) {
				
				if(nums[minIndex]>nums[j]) 
				{
					minIndex = j;
					
				}
				
			}
				
				temp = nums[minIndex];
				System.out.println("\nNumber i: "+nums[i]);
				nums[minIndex] = nums[i];
				nums[i] = temp;
				System.out.print("\nSorting : ");
				for (int l : nums) {
					System.out.print(l + ", ");
					
				}
			
			
		}
		
		System.out.print("\nSorted Array: ");
		
		for (int i : nums) {
			System.out.print(i + ", ");
			
		}
		
		
	
		
		
		

	}

}
