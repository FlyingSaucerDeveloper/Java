package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity (name = "productmanagement" )
@Table (name = "productmanagement")
public class ProductModel {
	

	@Id
	@Column(name = "pid")
	private String id;
	
	@Column(name = "pname")
	private String name;
	
	@Column(name = "ptype")
	private String type;
	
	@Column(name = "plocation")
	private String location;
	
	@Column(name = "pwarranty")
	private String warranty;
	
	@Column(name = "powner")
	private String owner;
	
	
	

	/*
	 * public ProductModel() { super(); // TODO Auto-generated constructor stub }
	 * 
	 * public ProductModel(String id, String name, String type, String location,
	 * String warranty, String owner) { super(); this.id = id; this.name = name;
	 * this.type = type; this.location = location; this.warranty = warranty;
	 * this.owner = owner; }
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
	
	

}
