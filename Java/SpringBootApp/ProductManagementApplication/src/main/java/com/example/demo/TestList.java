package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TestList {

	
	List<String> warstatus = new ArrayList<>();

	
	public TestList() {
		super();
		// TODO Auto-generated constructor stub
			
		warstatus.add("expired");
		warstatus.add("not-expired");
		
		
		
		
		
	}
	
	
	
	
	
}
