package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Perfume;

@Repository
public interface PerfumeRepo extends JpaRepository<Perfume, Integer>{
	
}
