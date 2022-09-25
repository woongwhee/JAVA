package com.kh.operator;

public class A_LogicalNegation {
	/*
	 * 논리 부정 연산자 !(단항연산자)
	 * !논리값 =논리값
	 * 논리값 (true /false)를 반대로 바꿔주는 연산자
	 */
	public void method() {
		System.out.println("treu 의 부정은?" + !true);
		System.out.println("false 의 부정은?" + !false);
		
		boolean b1= true;
		boolean b2= 1>2;
		boolean b3= !b1;
		System.out.println("b1 : "+b1+"\nb2 : "+b2+"\nb3 : "+b3 );
		
	}
}
