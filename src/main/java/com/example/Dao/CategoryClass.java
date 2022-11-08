//package com.example.Dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.Entity.Category;
//
//@Service
//public class CategoryClass {
//	@Autowired
//	private CategoryRepo cat;
//	
//	public Category register(Category category) {
//		return cat.save(category);
//	}
//	public Category getId(int id) {
//		return cat.findById(id).orElse(new Category());
//	}
//	public Category update(Category category) {
//		return cat.save(category);
//	}
//	public void deleteId(int id) {
//		cat.deleteById(id);
//	}
//}
