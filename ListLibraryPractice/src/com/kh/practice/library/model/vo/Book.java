package com.kh.practice.library.model.vo;

import java.util.Objects;

public class Book implements Comparable<Object> {
	private String title; 
	private String author;
	private String category;
	private int price;
	
	
	public Book() {}
	public Book(String title, String author, String category, int price) {
		this.title=title;
		this.author=author;
		this.category=category;
		this.price=price;
	}
	
	//==========================================================================
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//==========================================================================
	
	
	public String toString() {
		return "(" + title + "/ " + author + "/ " + category + "/ " + price + ")"; 
	}
	public int hashCode() {
		return Objects.hash(author, category, price,title);
	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (getClass() != obj.getClass()) return true;
		return false;
	}
	public int compareTo(Object obj) {
		if(this.title.compareTo(((Book)obj).title)<=1) return 1;
		else if (this.title.compareTo(((Book)obj).title)<=-1) return -1;
		return 0;
	}
	
	
}
