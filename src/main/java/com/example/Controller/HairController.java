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

import com.example.Dao.HairClass;
import com.example.Entity.Hair;
import com.example.Entity.Products;

@RestController
public class HairController {
	@Autowired
	private HairClass hairClass;
	
	@PostMapping("/Hair_register")
	public Hair register(@RequestBody Hair hair) {
		return hairClass.register(hair);
	}
	@DeleteMapping("/DeleteHair/{id}")
	public void deleteId(@PathVariable int id) {
		hairClass.deleteId(id);
	}
	@PutMapping("/updateHair/{id}")
	public Hair updateId(Hair hair) {
		return hairClass.updateId(hair);
	}
	@GetMapping("/getHair")
	public List<Hair> getHair() {
		return hairClass.getHair();
	}
	
}
