package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
	private int accessAge;
	
	public AniBook() {};
	public AniBook(String title, String author, String publisher, int accessAge) {
		super();
		this.accessAge=accessAge;
	}
	public String toString() {
		return null;
	}
}
