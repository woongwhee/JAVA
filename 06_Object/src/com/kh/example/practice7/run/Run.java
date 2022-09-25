package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;
public class Run {
	public static void main(String[] args) {
		Employee ep=new Employee();
		ep.setEmpNo(100);
		ep.setEmpName("홍길동");
		ep.setDept("영업부");
		ep.setJob("과장");
		ep.setAge(25);
		ep.setGender('남');
		ep.setSalary(2500000);
		ep.setBonusPoint(0.05);
		ep.setPhone("010-1234-5678");
		ep.setAddress("서울시 강남구");
		System.out.println("EmpNo : "+ep.getEmpNo());
		System.out.println("EmpName : "+ep.getEmpName());
		System.out.println("dept : "+ep.getDept());
		System.out.println("Job : "+ep.getJob());
		System.out.println("Age : "+ep.getAge());
		System.out.println("Gender : "+ep.getGender());
		System.out.println("BonusPoint : "+ep.getBonusPoint());
		System.out.println("Phone : "+ep.getPhone());
		System.out.println("Address : "+ep.getAddress());
		                   
		
		
	}
}
