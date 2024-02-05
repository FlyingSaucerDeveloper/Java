package com.flyingsaucer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CJ_16_streamAPI {

	public static void main(String[] args) {
		
		List<Integer> numbersList = Arrays.asList(45,67,89,100,35,25,10);
		
		Stream<Integer> s1 = numbersList.stream();
		Stream<Integer> s2 = s1.filter(x->x<50);
		s2.forEach(x->System.out.println(x));
		//s2.forEach(x->System.out.println(x)); cannot be used againg as stream can only run once
		

		// The other way to do this
		
		System.out.println("Another way by combinig all stream functions");
		
		Stream<Integer> resultIntegers = numbersList.stream()
									.filter(x->x<50);
		
		resultIntegers.forEach(x-> System.out.println(x));
		
		
		
	}

}
