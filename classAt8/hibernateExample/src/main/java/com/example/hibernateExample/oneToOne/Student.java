package com.example.hibernateExample.oneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	int id;

	String name;

	String address;

	String email;
	@OneToOne(mappedBy = "st")
	Book book;

	public Student(String name, String address, String email, Book book) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.book = book;
	}

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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", book=" + book
				+ "]";
	}

}
