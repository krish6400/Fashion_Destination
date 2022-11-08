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

import com.example.Dao.BodyClass;
import com.example.Dao.HairClass;
import com.example.Entity.Body;
import com.example.Entity.Hair;

@RestController
public class BodyController {
	@Autowired
	private BodyClass bodyClass;
	
	@PostMapping("/Body_register")
	public Body register(@RequestBody Body body) {
		return bodyClass.register(body);
	}
	@DeleteMapping("/DeleteBody/{id}")
	public void deleteId(@PathVariable int id) {
		bodyClass.deleteId(id);
	}
	@PutMapping("/updateBody/{id}")
	public Body updateId(Body body) {
		return bodyClass.updateId(body);
	}
	@GetMapping("/getBody")
	public List<Body> getBody() {
		return bodyClass.getBody();
	}
}
