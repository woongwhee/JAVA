package com.kh.chap02_encapsulation.model.vo;

public class Student {
	/*캡슐화 과정을 통해 완벽한 클래스의 형태를 갖추게 하자.
	 * 캡슐화란 ? 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어
	 * 
	 * 캡슐화를 하지않으면? 외부로부터 직접접근이 가능하기 때문에 함부로  값이 변질되거나 조회를 막지 못하는 문제가 생ㄱ김
	 * 
	 * 1) 정부은닉: private
	 * 			 접근제어자중하나 해당 클래스 밖에서는 접근할수 없다.
	 * 
	 * 2)setter getter:
	 * 			접근제어자가 private 인 경우 간접적으로 값에 
	 * 			접근하는 함수를 만들어
	 * 			값이 private라도 method가 public이라면 method를 통해 그값을
	 * 			그 값을 설정하거나(setter) 가저올수있다(getter)
	 * 
	 */
	private String name;
	private int age;
	private double height;
	
	//표현법 접근제한자 자료형 필드명
	/*
	 * [필드부]
	 * 필드== 멤버변수 == 인스턴스변수
	 */
	
	
	//메서드부.
	/* 
	 * 각기능을 구현하는 부분
	 * 
	 * [표현법]
	 * 접근제한자 반환형 메소드명(매개변수){
	 * 	기능구현
	 * 
	 * 	return 반환할 자료;
	 * }
	 * 
	 */
	//setter
	//this.=>해당객체의 포인터와 같다.
	//Spring에서 이 틀을 강제하기때문에 맞춰놓는게좋다.
	
	public void setName(String name) {
		this.name=name;
	}
	//this 없이도 필드에 접근해 초기화가능
	//권장하지않음
	public void setAge(int age2) {
		age=age2;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	
	//getter
	//private 데이터를 반환하는 메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public void getInfo() {
		System.out.printf("%s님의 나이는 %d이고, 키는 %.2fcm입니다. ",name,age,height);
		
		
	}
}
