package com.example.hibernateOneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookId;
	String name;
	String author;
	@ManyToOne
	Student st;
	public Book(int bookId, String name, String author, Student st) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.st = st;
	}
	public Book(int bookId, String name, String author) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
	}
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public Book() {
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + "]";
	}
	
	 
	 
	
}
