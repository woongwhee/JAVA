package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	public void method1() {

		String str1 = "hellow";
		String str2 = new String("hellow");
		String str3 = new String("hellow");
		String str4 = "hellow";

		System.out.println(str1 == str4);// 이게 왜true?
		System.out.println(str1);
		// String 클래스의 toString() 메서드의 경우 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있음.
		System.out.println(str2.toString());
		// equals는 원래 주소값을 비교하는 메서드지만 String클래스는 equals는 재정의해서
		// 문자열을 비교하도록 되어있음
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());// 주소값을 10진수형태로 반환
		System.out.println(str2.hashCode());// 주소값을 10진수형태로 반환=>왜같음?
		// 원래는 주소값을 hashcode로 반환하는 메서드지만
		// 문자열기반으로 해시코드값을 만들어 반환하도록 변경됨.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));// str1 과 str4는 같다.
	}

	public void method2() {
		String str1 = "hellow";// 이렇게 리터럴값을 대입 하면 stringPool(상수풀)에 값이 저장되고 그 주소값을 반환한다.
		String str2 = "hellow";// 그래서 이렇게
		// 상수풀에 동일한 문자열이 존재불가능하다
		String str3 = new String("hellow");
		String str4 = new String("hellow");

		System.out.println(str1 == str2);// true
		System.out.println(str3 == str4);// false

	}

	public void method3() {
		String str1 = "hellow";
		String str2 = "hellow2";
		String str3 = "hellow3";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		//메모리가 꽉차는걸 주의해야한다!
	}

}
