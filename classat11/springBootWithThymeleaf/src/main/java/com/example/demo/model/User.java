package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String fName;
	String lName;
	String address;
	String email;
	public User(int id, String fName, String lName, String address, String email) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.email = email;
	}
	public User(String fName, String lName, String address, String email) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", address=" + address + ", email=" + email
				+ "]";
	}
	
}
