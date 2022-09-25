package com.kh.practice.verify.exam04;

public class Child extends Parent{
	private int student;
	public Child(String name, int student) {
		super(name);//코드상 부모생성자로 부모클래스부터 호출하고 
		
		this.student=student;
		
	}
}