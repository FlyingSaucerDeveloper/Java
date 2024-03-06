package com.example.demo;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProdService {

	@Autowired
	ProductRepository repository;
	
	@Autowired
	TestList checkList;

	
	@Override
	public void addProduct(ProductModel product) {
		
		repository.save(product);
		
	}



	@Override
	public void deleteProduct() {
		// TODO Auto-generated method stub
		repository.deleteAll();
		
	}

	@Override
	public void updateProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductModel> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public List<ProductModel> getProduct(String search) {
		
				
		 if (checkList.warstatus.contains(search)) {
		
			 
			return (repository.getProductbyWarranty(search));
			
		}
		
		 else if (search.contains("ak")|| search.contains("ks")) {
			return repository.getProductbyOwner(search);
			
		}
		else
		{
			List<ProductModel> pmlist = new ArrayList<>();
			pmlist.add(repository.findById(search).get());
			
			return pmlist;
		}
		

		// TODO Auto-generated method stub
		
	}

}
