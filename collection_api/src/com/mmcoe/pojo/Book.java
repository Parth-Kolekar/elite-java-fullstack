package com.mmcoe.pojo;

public class Book {
	private int isbn;
	private String title,author;
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book [ISBN = " + isbn+ ",Title = "+ title+", Author = "+author+ ",Price = "+price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Object getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	
	
	
}
