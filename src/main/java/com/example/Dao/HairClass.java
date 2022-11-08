package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Hair;


@Service
public class HairClass {
	@Autowired
	private HairRepo hairRepo;
	
	public Hair register(Hair hair) {
		return hairRepo.save(hair);
	}
	public Hair getId(int id) {
		return hairRepo.findById(id).orElse(new Hair());
	}
	
	public Hair updateId(Hair hair) {
		return hairRepo.save(hair);
	}
	public void deleteId(int id) {
		hairRepo.deleteById(id);
	}
	public List<Hair> getHair() {
		return hairRepo.findAll();
	}
	
}
