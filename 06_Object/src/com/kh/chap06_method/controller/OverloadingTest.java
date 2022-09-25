package com.kh.chap06_method.controller;

public class OverloadingTest {
	/*
	 * 메소드 오버로딩
	 * 	- 한 클래스 내에 같은 메소드명으로 정의할 수있는 방법.
	 * 	- 매개변수의 자료형의 개수,순서가 다르게 작성되어야한다.
	 *  - 단, 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 영향을 주지 않는다.
	 * 
	 * 
	 */
	public void test() {
		//메소드 오버로딩의 대표적 케이스: println
		//System.out.println;
		
	}

	//	public int test() {
	//		return 1;
	//	} 반환형이 다르다고 오버로딩이 적용되지 않는다.
	
	public void test(int a) {
		
	}
	
	public void test(int a, String b) {
		
	}
	public void test(String b,int a) {
		
	}//매개변수의 타입순서에따라 전혀 별개의 메서드로 인식된다.
	
	public void test(int a, int b) {}
	//매개변수의 개수에따라 전혀 별개의 메서드로 인식된다.
	//public void test(int c, int d) {}
	//매개변수가 같은 타입 같은 개수 같은 순서로되어있다면 매개변수명과는 상관없이 같이 판단한다. 
	private void test(int a, int b, int c) {}
	//접근제한자가 달라도 메소드 오버로딩이 적용된다.
	
}
