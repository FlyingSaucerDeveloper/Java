package com.flyingsaucer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class NumList implements Comparable<NumList>{

	private int number;

	
	public NumList(int number) {
		this.number = number;
		
	}

	@Override
	public int compareTo(NumList num) {
		// TODO Auto-generated method stub
		if (this.number>num.number) 
		{
			return 1;	
		}
		else return -1;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+number+" ";
	}
	
	
	
}


public class CJ_15_comparatorXcomparable {

	public static void main(String[] args) {
		List<Integer> numsIntegers = new ArrayList<>();
		
		numsIntegers.add(56);
		numsIntegers.add(67);
		numsIntegers.add(51);
		numsIntegers.add(72);
		numsIntegers.add(93);
		
		List<Integer> unSortedNumsIntegers = numsIntegers;
		System.out.print("Unsorted List : ");
		System.out.println(unSortedNumsIntegers);
		
		//Sorting using the sort method
		Collections.sort(numsIntegers);
		
		//print the sorted list
		System.out.print("Sorted List using Collections.sort : ");
		System.out.println(numsIntegers);
		
		//To sort the elements based on a expicit condition we use comparator interface
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1<o2) {return 1;}
				else {	return -1;}
			}
		}; 
		Collections.sort(unSortedNumsIntegers, comparator);
		
		System.out.print("Sorted List using Comparator (Sorting in Decending order): ");
		System.out.println(numsIntegers);
		
		//Using the comparable
		
		//Creating the List of numbers
		
		List<NumList> numbersList = new ArrayList<NumList>();
		
		//numbersList.add("67"); This was of adding not work,
		//we need to create a new object for every addition
		
		numbersList.add(new NumList(56));
		numbersList.add(new NumList(51));
		numbersList.add(new NumList(67));
		numbersList.add(new NumList(93));
		numbersList.add(new NumList(72));
		
		//Printing the number List
		System.out.print("The Number List : ");
		System.out.println(numbersList); 
		//Remember to add to string method in the class 
		//or else the address will be pronted rather than values
		
		System.out.print("Printing By using Iterations: ");
		for (NumList n: numbersList) {
			System.out.print(n);
		}	
		//sorting
		System.out.print("\nSorting using the comparable :");
		Collections.sort(numbersList);
		System.out.println(numbersList);	
			
		
		
		
		
	}

}
