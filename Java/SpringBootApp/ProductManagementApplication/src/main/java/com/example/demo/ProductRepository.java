package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, String> {

	@Query(value = "Select pm FROM productmanagement pm where pm.owner = ?1")
	public List<ProductModel> getProductbyOwner(String search);
	
	
	@Query(value = "Select pm FROM productmanagement pm where pm.warranty = ?1")
	public List<ProductModel> getProductbyWarranty(String search);
	
}
