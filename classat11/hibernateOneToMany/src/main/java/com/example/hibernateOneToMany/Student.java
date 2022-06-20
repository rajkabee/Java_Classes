package com.example.hibernateOneToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentId")
	int id;
	@Column(name = "studentName")
	String name;
	String email;
	String address;
	@OneToMany(mappedBy = "st")
	List<Book> books = new ArrayList<Book>();

	
	public Student(String name, String email, String address, ArrayList<Book> books) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.books = books;
	}
	public Student(int id, String name, String email, String address, ArrayList<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.books = books;
	}
	public Student(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", books=" + books
				+ "]";
	}
	
	
	
	
	
}
