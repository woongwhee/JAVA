package com.kh.example.practice7.model.vo;

public class Employee {
	// 필드
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

	// 생성자
	public Employee() {
	}
	public Employee(int empNo,String empName) {
		this.empNo=empNo;
		this.empName=empName;
	}
	// 메소드

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public String getDept() {
		return dept;
	}

	public String getJob() {
		return job;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

}
