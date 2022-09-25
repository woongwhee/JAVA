package com.kh.chap03_constructor.model.vo;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	//생성자 오버로딩
	//
	
	public User(){
		//
	}
	public User(String userId,String userPwd,String userName){
		this.userId=userId;
		this.userPwd=userPwd;
		this.userName=userName;
	}
	public User(String userId,String userPwd,String userName,int age,char gender){
		//생성자의 내용이 겹칠경우 생성자 오버로딩을통해 코드를 줄일수있다.
		this(userId,userPwd,userName);
	}
	
	
	
	
	
	
	
}
