package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Perfume;
import com.example.Entity.Products;

@Service
public class PerfumeClass {
	@Autowired
	private PerfumeRepo perfumeRepo;
	
	public Perfume register(Perfume perfume) {
		return perfumeRepo.save(perfume);
	}
	public Perfume getId(int id) {
		return perfumeRepo.findById(id).orElse(new Perfume());
	}
	
	public Perfume updateId(Perfume perfume) {
		return perfumeRepo.save(perfume);
	}
	public void deleteId(int id) {
		perfumeRepo.deleteById(id);
	}
	public List<Perfume> getPerfume() {
		return perfumeRepo.findAll();
	}
}
