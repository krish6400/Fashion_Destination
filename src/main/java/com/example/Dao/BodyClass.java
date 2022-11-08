package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Body;
import com.example.Entity.Hair;

@Service
public class BodyClass {
	@Autowired
	private BodyRepo bodyRepo;
	
	public Body register(Body body) {
		return bodyRepo.save(body);
	}
	public Body getId(int id) {
		return bodyRepo.findById(id).orElse(new Body());
	}
	
	public Body updateId(Body body) {
		return bodyRepo.save(body);
	}
	public void deleteId(int id) {
		bodyRepo.deleteById(id);
	}
	public List<Body> getBody() {
		return bodyRepo.findAll();
	}
}
