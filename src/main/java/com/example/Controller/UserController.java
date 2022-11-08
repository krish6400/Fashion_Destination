package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.UserClass;
import com.example.Dao.UserRepo;
import com.example.Entity.User;

@RestController
public class UserController {
	@Autowired
	UserClass userClass;
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userClass.register(user);
	}
	@GetMapping("/getUser/{id}")
	public User getId(@PathVariable int id) {
		return userClass.getId(id);
	}
	
	
//	@GetMapping("/login/{email/password}")
//	public User userLogin(@PathVariable String email, @PathVariable String password) {
//		return userClass.userLogin(email, password);
//	}

	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		userClass.deleteById(id);
	}
	@PutMapping("/update/{id}")
	public User updateById(@RequestBody User user) {
		return userClass.register(user);
	}
	@GetMapping("/getUser")
	public List<User> getAllUser() {
		return userClass.getAllUser();
	}
//	@GetMapping("/getUserByEmail/{email}")
//	public User getUserByEmail(@PathVariable String email) {
//		return userClass.getUserByEmail(email);
//	}
	
	@GetMapping("/getUser/{email}")
	public User getByUserEmail(@PathVariable String email) {
		return userClass.getUserByEmail(email);
	}
	
}
