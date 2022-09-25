package com.kh.chap01_math;

public class MathRun {
	public static void main(String[] args) {
		// Math mat=new Math();private로 설정되어있음
		// java.lang 은 항상 import되어있다,
		// math클래스에 있는 다양한 기능
		// 파이 클래스안에 상수필드로 정의되어있음
		System.out.println("파이 : " + Math.PI);

		double num1 = 4.435;
		System.out.println("올림 : " + Math.ceil(num1));// 1.1이여도 2로올림
		System.out.println("반올림 : " + Math.round(num1));// long으로 반환
		System.out.println("내림 : " + Math.floor(num1));// 뒷자리를 버림
		// r가장 가까운 정수를 알아낸후 실수형 반환
		System.out.println("가장 가까운 정수값 : " + Math.rint(num1));

		int num2 = -19;
		System.out.println("절대값 : " + Math.abs(num2));

		// 최소값 최대값
		System.out.println("최소값 : " + Math.min(num1, num2));
		System.out.println("최대값 : " + Math.max(num1, num2));
		
		//제곱근(루트)
		System.out.println("제곱근 : "+Math.sqrt(25));
		System.out.println("제곱 :"+(long)Math.pow(12, 10));
		
		/* 자바 java.lang.Math 클래스의 특징
		 * -모든필드 =>상수필드
		 * - 모든 메소드 =>static메소드
		 * 
		 * 모든게 다 static이기 때문에 Math.으로 접근이 가능한것
		 * 객체생성을 안해도 되고 할수도 없다
		 * 
		 */
		
	}
}
