package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Products;

@Service
public class ProductClass {
	
	@Autowired
	ProductRepo product;
	
	public Products register(Products products) {
		return product.save(products);
	}
	public Products getId(int id) {
		return product.findById(id).orElse(new Products());
	}
	
	public Products updateId(Products products) {
		return product.save(products);
	}
	public void deleteId(int id) {
		product.deleteById(id);
	}
	public List<Products> getProduct() {
		return product.findAll();
	}
}
