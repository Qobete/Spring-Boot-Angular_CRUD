package com.ecommerce.shoponline.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity // This tells Hibernate to make a table out of this class
@Table
public class Product {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Basic(optional = false)
	
	@Column(name = "prod_name")
	private String name;
	
	@Column(name = "prod_desc")
	private String desc;
	
	@Column(name = "prod_price")
	private double price;
	
	@Column(name = "prod_added_on")
	private String added_on;
	
	@Column(name = "prod_category_id")
	private String category_id;
	
//	@Column(name = "prod_qty")
//	private int qty;
	
	@Lob
	@Column(name = "prod_image", length = Integer.MAX_VALUE, nullable = true)
	private byte[] image;



	public Product() {
	}

	public Product(long id, String name, String desc, double price, String added_on, String category_id, int qty, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.added_on = added_on;
		this.category_id = category_id;
//		this.qty = qty;
		this.image = image;
	}
	
	public String getAdded_on() {
		return added_on;
	}

	public void setAdded_on(String added_on) {
		this.added_on = added_on;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

//	public int getQty() {
//		return qty;
//	}
//
//	public void setQty(int qty) {
//		this.qty = qty;
//	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
