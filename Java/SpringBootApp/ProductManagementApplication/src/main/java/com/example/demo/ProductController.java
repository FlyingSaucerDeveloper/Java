package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProdService service;

	@Autowired
	ProductModel product;

	@PostMapping("addProduct")
	public void addProduct(@Param("id") String id, @Param("name") String name, @Param("location") String location,
			@Param("owner") String owner, @Param("waranty") String waranty, @Param("type") String type) {

		product.setId(id.toLowerCase());
		product.setLocation(location.toLowerCase());
		product.setName(name.toLowerCase());
		product.setOwner(owner.toLowerCase());
		product.setType(type.toLowerCase());
		product.setWarranty(waranty.toLowerCase());

		service.addProduct(product);

	}

	@GetMapping("getAllProducts")
	@ResponseBody
	public List<ProductModel> getAllProducts() {

		return service.getAllProducts();

	}

	@GetMapping("getProduct")
	public List<ProductModel> getProduct(@Param("id") String id, @Param("owner") String owner,
			@Param("waranty") String waranty) {

		if (id != null) {

			return service.getProduct(id);

		}

		else if (waranty != null) {

			return service.getProduct(waranty);

		}

		else if (owner != null) {

			return service.getProduct(owner);

		}
		return null;

	}

	@DeleteMapping("deleteAllProducts")
	public void deleteAll() {

		service.deleteProduct();

	}

}
