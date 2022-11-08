package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Products;

public interface ProductRepo extends JpaRepository<Products, Integer>{
	
}
