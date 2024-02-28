package com.flyingsaucer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

	
	@Autowired
	Repository repository;
	
	@GetMapping("testStudents")
	public List<Students> getTestStudents(){
		
		List<Students> studentsList = new ArrayList<Students>();
		
		Students student= new Students();
		
		student.setId(786);
		student.setName("Kartik Sharma");
		
		
		studentsList.add(student);
		
		return studentsList;
		
		
	} 
	
	@GetMapping("students")
	public List<Students> getStudents(){
		
		List<Students> studentsList = (List<Students>) repository.findAll();
		
		
		return studentsList;
		
		
	} 
	
	
	@PostMapping("students")
	public List<Students> addStudents(){
		
		List<Students> studentsList = new ArrayList<Students>();
		
		Students student1= new Students();
		
		student1.setId(786);
		student1.setName("Kartik Sharma");
		
		studentsList.add(student1);
		
		Students student2= new Students();
		
		student2.setId(420);
		student2.setName("Harsh Bhat");
		
		studentsList.add(student2);
		
		repository.saveAll(studentsList);
			
		
		
		return studentsList;
		
		
	} 
	
	
}
