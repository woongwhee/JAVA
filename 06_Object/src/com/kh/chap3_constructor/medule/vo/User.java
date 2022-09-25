package com.kh.chap3_constructor.medule.vo;

public class User {
	//필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 반드시 클래스명과 동일해야함(대소문자 구분)
	 * 2. 반환형이 존재하지않는다.(메소드랑은 다르다.)
	 * 3. 여러개 생성이 가능하지만 매개변수가 중복되면 안된다.
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 jvm이 자동으로 생성해주지 않는다.
	 * 
	 */
	//생성자부
	public User(){
		//기본생성자(매개변수가 없는 생성자)
		//단지 객체 생성 공간을 확보만을 목적으로 할때 사용
		//기본생성자를 생략하는경우=>오류나지 않음. jvm이 자동으로 만들어줬기때문에 가능했던것
		//단, 매개변수가 있는 생성자가 작성되어있는경우 기본생성자는 반드시 기술해줘야한다.(jvm이 자동으로 생성해주지 않음.)
		//기본생성자를 작성하는 습관을 들이자.
	}
	public User(String userId,String userPwd,String userName) {
		this.userId=userId;
		this.userPwd=userPwd;
		this.userName=userName;
	}
	public User(String userId,String userPwd,String userName,int age,char gender) {
		this.userId=userId;
		this.userPwd=userPwd;
		this.userName=userName;
		this.age=age;
		this.gender=gender;
		
	}
	
	public String info() {
		return userId+" "+userPwd+" "+userName+" "+age+" "+(int)gender;
	}
}
