package com.bahiazone.bahiazone.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bahiazone.bahiazone.admin.dto.ResponseDto;
import com.bahiazone.bahiazone.admin.entity.Products;
import com.bahiazone.bahiazone.admin.repository.ProductsRepository;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	ProductsRepository productsRepository;
	
	// Get all products
	@GetMapping("")
	public List<Products> getAll(@RequestParam("title") String title) {
		
		if (title != null && title != "") {
			return productsRepository.findByProductTitleContaining(title);
		}
		return productsRepository.findAll();
		
	}
	
	// Get one product by id
	@GetMapping("/{productId}")
	public Optional<Products> getOne(@RequestParam("id") int productId) {
		return productsRepository.findById(productId);
	}
	
	//Save products
	@PostMapping("")
	public Products save(@RequestBody Products products) {
		return productsRepository.save(products);
	}
	
	// Update products
	@PutMapping("/{productId}")
	public Products update(@RequestBody Products products) {
		boolean exists = productsRepository.existsById(products.getProductId());
		
		if (exists) {
			return productsRepository.save(products);
		}
		throw new RuntimeException("Product does not exist");
	}
	
	@DeleteMapping("/{productId}")
	public ResponseDto deleteOne(@RequestParam("id") int productId) {
		boolean exists = productsRepository.existsById(productId);
		
		if (exists) {
			productsRepository.deleteById(productId);
			return new ResponseDto("Sucess", "Product deleted", new Date(), null);
		}
		throw new RuntimeException("Product does not exist");
		
	}

}
