package com.example.demo.model;

import java.sql.Timestamp;

public class Product {
	long productId;
	String productName;
	String description;
	String Manufacturer;
	String Price;
	boolean isInStock;
	boolean isActive;
	Picture picture;
	Category category;
	
	Timestamp createdDate;
	Timestamp updatedDate;
	
	
}
