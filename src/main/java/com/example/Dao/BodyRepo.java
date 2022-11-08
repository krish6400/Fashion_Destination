package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Body;

@Repository
public interface BodyRepo extends JpaRepository<Body, Integer>{
	
}
