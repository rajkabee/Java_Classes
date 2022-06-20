package com.example.hibernateExample.intro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pupil")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	int id;
	@Column(name = "student_name")
	String name;
	@Column(name = "student_address")
	String address;
	@Column(name = "student_email")
	String email;

	public Student(int id, String name, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public Student(String name, String address, String email) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}

}
