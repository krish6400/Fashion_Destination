package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.ProductClass;
import com.example.Entity.Products;

@RestController
public class ProductController {
	@Autowired
	ProductClass product;
	
	@PostMapping("/product_register")
	public Products register(@RequestBody Products products) {
		return product.register(products);
	}
	@DeleteMapping("/Delete/{id}")
	public void deleteId(@PathVariable int id) {
		product.deleteId(id);
	}
	@PutMapping("/updateProduct/{id}")
	public Products updateId(Products products) {
		return product.updateId(products);
	}
	@GetMapping("/getProducts")
	public List<Products> getProduct() {
		return product.getProduct();
	}
}