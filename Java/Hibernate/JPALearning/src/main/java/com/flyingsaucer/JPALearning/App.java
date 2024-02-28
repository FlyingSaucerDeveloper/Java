package com.flyingsaucer.JPALearning;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class App 
{
	
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
       
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager entityManager =  entityManagerFactory.createEntityManager();
    			
    	//Adding Data to DataBase
    	students studetails= new students();
    	StudentName studentName= new StudentName();
    	
    	studentName.setFirstName("Kartik");
    	studentName.setLastName("Sharma");
    	
    	studetails.setStuid(786);
    	studetails.setName(studentName);
    	studetails.setFees(10000);
    	studetails.setHouse("Kashmir");
    
    	// To manage except view the data ,we need to follow acid properties, and use transaction
    	entityManager.getTransaction().begin();
     	entityManager.persist(studetails);
       	entityManager.getTransaction().commit();
    	
    	
    	
    	//Getting data from the database
    	students stud= entityManager.find(students.class, 786);	
    	
    	
    	System.out.println(stud);
    	
    }
}
