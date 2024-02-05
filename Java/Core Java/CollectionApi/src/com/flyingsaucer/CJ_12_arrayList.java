package com.flyingsaucer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CJ_12_arrayList {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Directly using the Parent class Collection
		Collection<Comparable> arrList = new ArrayList<Comparable> ();
		
		//add values
		arrList.add("Kartik");
		arrList.add(07);
		
		//print values
		System.out.println(arrList);
		
		for (Object i : arrList) { // By default all the items in the arraylist is object, 
									//to change update the data type in the <> brackets
			System.out.println(i);
			
		}
		 
		
		// Using the SUB class List, as this has a function to fetch element by index.
		
		System.out.println("\nUsing List Sub class");
		
		List<Object> arr = new ArrayList<Object>();
		
		//add values
		arr.add("Kartik-Alpha");
		arr.add(31);
		
		//Print values
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		
	}

}
