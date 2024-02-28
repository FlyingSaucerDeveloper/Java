package com.flyingsaucer.JPALearning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
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
	
	@Override
	public String toString() {
		return "students [stuid=" + stuid + ", name=" + name + ", fees=" + fees + ", house=" + house + "]";
	}
	
	
	

}
