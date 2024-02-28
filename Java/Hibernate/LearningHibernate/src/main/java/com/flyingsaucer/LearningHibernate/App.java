package com.flyingsaucer.LearningHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		students pojo = new students();	
		StudentName name = new StudentName();

		name.setFirstName("Harsh");
		name.setLastName("Bhat");
		pojo.setStuid(420);
		pojo.setName(name);
		pojo.setHouse("Jammu");
		pojo.setFees(50);



		

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(students.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// To save the data in the database we follow ACID Properties, therefore we need
		// to do the transaction

	
		Transaction transaction = session.beginTransaction();

		session.saveOrUpdate(pojo);
		transaction.commit();

		// Retrieving the data from DB
		pojo = session.get(students.class, 420);

		System.out.println(pojo);

		session.close();

		// In cfg file, set <property name = "hbm2ddl.auto">update</property>, this will
		// create a table in database if it does not exist
		// "create" can replace the existing table

	}
}
