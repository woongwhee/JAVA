package com.kh.chap03_override.run;

import com.kh.chap03_override.moder.vo.Book;

public class Run {
	public static void main(String[] args) {
		//모든 클래스는 object 클래스의 후손으로 object안에 메소드를 가저다 쓸수있음
		
		Book book = new Book("수학의 정석", "누구더라", 12000);
		Book book2 = new Book("수학의 정석", "누구더라", 12000);
		// toString메서드 오버라이드전=> 클래스이름@주소값
		// toString메서드 오버라이드후=>
		System.out.println(book.toString());
		System.out.println(book2.toString());
		System.out.println(book.equals(book2));
		// System.out.println(book);
		// 위의 값과 아래값은 동일하다 출력문에 참조형변수 를 제시해 호출하면 JVM이 자동으로 object 클래스의 toString 메서드를 실행해 주던것
		
	}
}
