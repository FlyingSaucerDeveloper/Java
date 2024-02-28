package com.flyingsaucer.LearningHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class students {

	@Id
	private int stuid;
	private StudentName name;
	private int fees;
	private String house;

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public StudentName getName() {
		return name;
	}

	public void setName(StudentName name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	@Override // To string will come into play when we are going to fetch value from the db.

	public String toString() {
		return "students [stuid=" + stuid + ", name=" + name + ", fees=" + fees + ", house=" + house + "]";
	}

}
