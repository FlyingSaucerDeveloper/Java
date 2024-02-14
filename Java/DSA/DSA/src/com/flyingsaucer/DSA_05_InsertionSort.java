package com.flyingsaucer;


public class DSA_05_InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {8,4,6,3};
		
		int key=0;
		int j=0;
		
		for (int i=1;i<arr.length;i++) {
			key = arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>key ) {
				
				arr[j+1] = arr[j];
				j=j-1;
				
			}
			arr[j+1] = key;
			
		}
		
		
		System.out.print("\nSorted array: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		

	}

}
