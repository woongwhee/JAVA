package com.kh.operator;

public class F_Compound {
	/*
	 * 복합대입연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * a=a+1;=> a+=1;
	 * 앞에방식보다 뒤에방식이 연산처리속도가 빨라짐으로 복합대입연산자를 권장한다.
	 * 
	 * +,-,/,%,* 에 모두 적용가능
	 * 
	 */
	public void method1() {
		int num=12;
		System.out.println("현재num의값?"+num);
		num+=3;
		System.out.println("+=3값은?"+num);
		num-=3;
		System.out.println("-=3값은?"+num);
		num*=6;
		System.out.println("*=6값은?"+num);
		num/=3;
		System.out.println("/=3값은?"+num);
		num%=3;
		System.out.println("%=3값은?"+num);
		
		System.out.println("최종 num의값?"+num);
		
	}
	public void method2() {
		String str="Hellow";
		System.out.println(str);
		
	}
	
}
