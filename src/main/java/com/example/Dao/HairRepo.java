package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Hair;

@Repository
public interface HairRepo extends JpaRepository<Hair, Integer> {
	
}
