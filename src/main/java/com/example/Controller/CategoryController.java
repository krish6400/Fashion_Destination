//package com.example.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.Dao.CategoryClass;
//import com.example.Entity.Category;
//import com.example.Entity.Products;
//
//@RestController
//public class CategoryController {
//	
//	@Autowired
//	private CategoryClass catClass;
//	
//	@PostMapping("/catRegister")
//	public Category register(@RequestBody Category cat) {
//		return catClass.register(cat);
//	}
//	@DeleteMapping("/DeleteBy/{id}")
//	public void deleteId(@PathVariable int id) {
//		catClass.deleteId(id);
//	}
//	@PutMapping("/updateBy/{id}")
//	public Category updateId(@RequestBody Category cat) {
//		return catClass.register(cat);
//	}
//}
