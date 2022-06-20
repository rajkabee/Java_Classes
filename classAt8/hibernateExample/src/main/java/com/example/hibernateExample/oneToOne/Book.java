package com.example.hibernateExample.oneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String title;
	String author;
	@OneToOne
	Student st;

	public Book(String title, String author, Student st) {
		super();
		this.title = title;
		this.author = author;
		this.st = st;
	}

	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}

}
