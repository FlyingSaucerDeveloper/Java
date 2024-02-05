package com.flyingsaucer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CJ_17_MapReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbersIntegers = Arrays.asList(77,66,50,2,4,99,100);
		
		Stream<Object> i= numbersIntegers.stream()
				.filter(x -> x%2!=0)
				.map(x->x*x); // We will get the list/stream of numbers where each number is squared
		i.forEach(x -> System.out.println(x));
		
		
		// Printing the sum of squared odd numbers.
		
		Integer i1= numbersIntegers.stream()
				.filter(x -> x%2!=0)
				.map(x->x*x)
				.reduce(0,(x,y)->x+y);
				
		System.out.print(i1);
		
		//Printing sorted numbers
		Stream<Integer> k= numbersIntegers.stream()
				.filter(x -> x%2==0)
				.sorted();
		
		k.forEach(x -> System.out.println(x));
		
	
	
	
	}

}
