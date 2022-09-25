package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
	Student std =new Student();//객체생성완료 ==>인스턴스화
	//setter메소드로 필드에접근해서 초기화한다
	std.setAge(20);
	std.setHeight(172.512);
	std.setName("진웅휘");
	//getter메소드로 필드에 값을 얻을수있다.
	System.out.println("이름? "+std.getName());
	System.out.println("나이? "+std.getAge());
	System.out.println("키는? "+std.getHeight());
	std.getInfo();
	}
	
}
