package com.flyingsaucer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CJ_14_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> stuDetails = new HashMap<String,Double>();
		
		//Adding the Values
		List<String> stuNamesList = new ArrayList<String>();
		
		stuNamesList.add("A");
		stuNamesList.add("B");
		stuNamesList.add("D");
		stuNamesList.add("C");
		
		List<Double> stuMarksList = new ArrayList<Double>();
		
		stuMarksList.add(50.0);
		stuMarksList.add(50.4);
		stuMarksList.add(53.0);
		stuMarksList.add(96.7);
		
		
		Iterator<String> namesIterator= stuNamesList.iterator();
		Iterator<Double> marksIterator= stuMarksList.iterator();
		
		while(namesIterator.hasNext())
		{
			stuDetails.put(namesIterator.next(),marksIterator.next() );
			
		}
		
		//Print the Hashmap
		System.out.println(stuDetails);
		
		
		//Print all the keys
		System.out.println(stuDetails.keySet());
		
		//Fetch each key and value
		
		Set<String> keysString = stuDetails.keySet();
		
		for (String string : keysString) {
			
			System.out.println("Student : "+string+" Marks : "+stuDetails.get(string));
			
		}
		
		

		                         
		                         

	}

}
