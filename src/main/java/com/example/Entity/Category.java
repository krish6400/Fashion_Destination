//package com.example.Entity;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Category {
//	@Id
//	@Column(length = 50)
//	private int id;
//	@Column(length = 50)
//	private String name;
//	@Column(length = 50)
//	private String image;
//	
//	
//	@OneToMany(mappedBy="category")
//	List<Products> products;
//	
//	public Category() {
//		
//	}
//
//	public Category(int id, String name, String image) {
//		this.id = id;
//		this.name = name;
//		this.image = image;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//	public String toString() {
//		return "Category [id=" + id + ", name=" + name + ", image=" + image + "]";
//	}
//	
//	
//}
