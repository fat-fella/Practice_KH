package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount;
	
	public Member() {}
	
	public Member(String name, int age, char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public String toString() {
		return "이름 : " + name + "\n" + "나이 : " + age + "\n" + "성별 +" + gender;
		
		
	}
}
