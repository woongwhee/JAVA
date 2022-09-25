package com.kh.example.practice1.model.vo;

public class Member {
	//필드
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age; 
	private char gender; 
	private String phone; 
	private String email;
	//기본생성자
	public Member(){};
	//메소드
	public void changeName(String memberName) {
		this.memberName=memberName;
	} 
	public void printName() {
		System.out.println(memberName);
	}

}
