package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.User;

@Service
public class UserClass {
	@Autowired
	private UserRepo userRepo;
	
	public User register(User user) {
		return userRepo.save(user);
	}
	public User getId(int id) {
		return userRepo.findById(id).orElse(new User());
	}
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	public void deleteById(int id) {
		userRepo.deleteById(id);
	}
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
//	public User getUserByEmail(String email) {
//		return userRepo.getUserByEmailList(email);
//	}
	
	public 	User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
//	public User getLogin() {
//		return userRepo.
//	}
	public User userLogin(String email, String password) {
		return userRepo.findByEmail(email);
	}
}
