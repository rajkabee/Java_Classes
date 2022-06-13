package com.spring.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("st")
public class Student {
	int id;
	String name;
	String address;
	@Autowired
	@Qualifier("book2")
	Book book;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.book = book;
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	@Value("${st.id}")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("${st.name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	@Value("${st.address}")
	public void setAddress(String address) {
		this.address = address;
	}
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", book=" + book + "]";
	}
	
	
	
	
	
	
}
