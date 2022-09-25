package com.kh.chap06_method.controller;

public class MethodTest2 {

	/*
	 * static 메소드 [표현법] 접근제한자 static [예약어] 반환형 메소드명(매개변수){ 실행문 return 반환값; }
	 * 
	 * -호출시 객체를 생성할 필요없음(static 필드와 동일) -프로그램 시작시 static메모리에 메소드가 자동으로 저장되어있음.
	 * -클래스명,메소드명(전달값);으로 호출가능. ex)Math.random() -예약어,매개변수 생략가능. -return문은 void형일경우
	 * 생략가능.
	 * 스태틱 메서드는 프로그램시작시 클래스 로더를 통해 메소드 메모리영역에 스태틱필드와 함께 저장된다.
	 * 때문에 스태틱 메서드에서 스태틱 필드에 접근가능하다.
	 */
	private int num=10;
	private static int num2=20;
	public static int method1(int num1, int num2, char oper) {
		System.out.println("매개변수도 있고,반환형도 있는 static 메소드입니다.");
		int result = 0;
		switch (oper) {
		case '+':result = num1 + num2;break;
		case '-':result = num1 - num2;break;
		case '*':result = num1 * num2;break;
		case '/':result = num1 / num2;break;
		case '%':result = num1 % num2;break;
		default:System.out.println("연산자를 잘못입력하셨습니다.");
			break;
		}
		//result+=num; static영역에서는 static이 아닌 필드멤버에 접근 할 수 없다.
		result+=num2;//static영역에서는 static필드로 선언된 필드멤버을 사용 할 수 있다/.
		
		
		return result;
	}
	
}
