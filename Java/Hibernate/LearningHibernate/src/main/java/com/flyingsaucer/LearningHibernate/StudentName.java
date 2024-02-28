package com.flyingsaucer.LearningHibernate;

import jakarta.persistence.Embeddable;

@Embeddable // using this the 2 columns will be create in DB
public class StudentName {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StudentName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
