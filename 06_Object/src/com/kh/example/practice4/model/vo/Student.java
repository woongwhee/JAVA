package com.kh.example.practice4.model.vo;

public class Student {
	// 필드
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	// 생성자
	public Student() {
	};

	// 메소드
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height=height;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}

	public int getGrade() {
		return grade;
	};

	public int getClassroom() {
		return classroom;
	};

	public String getName() {
		return name;
	};

	public double getHeight() {
		return height;
	};

	public char getGender() {
		return gender;
	};
	public void information() {
		System.out.println("grade : "+grade);
		System.out.println("classroom : "+classroom);
		System.out.println("name : "+name);
		System.out.println("height : "+height);
		System.out.println("gender : "+gender);
		

	}
}
