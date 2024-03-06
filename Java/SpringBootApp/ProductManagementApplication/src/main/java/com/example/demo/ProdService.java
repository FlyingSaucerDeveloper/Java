package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface ProdService {

	
	public List<ProductModel> getProduct(String search);
	
	public void deleteProduct();
	
	public void updateProduct();
	
	public List<ProductModel> getAllProducts();

	void addProduct(ProductModel product);
	
	

}
