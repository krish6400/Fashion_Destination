package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perfume {
	@Column(length = 50)
	private String name;
	@Column(length = 50)
	private String image;
	@Column(length = 50)
	private String brand;
	@Column(length = 50)
	private String mfg;
	@Column(length = 50)
	private int quantity;
	@Id
	@Column(length = 50)
	private int cat_id;
	@Column(length = 50)
	private int mrp;
	
	public Perfume() {
		
	}

	public Perfume(String name, String image, String brand, String mfg, int quantity, int cat_id, int mrp) {
		super();
		this.name = name;
		this.image = image;
		this.brand = brand;
		this.mfg = mfg;
		this.quantity = quantity;
		this.cat_id = cat_id;
		this.mrp = mrp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMfg() {
		return mfg;
	}

	public void setMfg(String mfg) {
		this.mfg = mfg;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public int getMrp() {
		return mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	public String toString() {
		return "Perfume [name=" + name + ", image=" + image + ", brand=" + brand + ", mfg=" + mfg + ", quantity="
				+ quantity + ", cat_id=" + cat_id + ", mrp=" + mrp + "]";
	}
	
}
