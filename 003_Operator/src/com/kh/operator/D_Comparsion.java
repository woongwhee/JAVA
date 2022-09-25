package com.kh.operator;

import java.util.Scanner;

public class D_Comparsion {
	/*
		 * 비교연산자 / 관계연산자(이항연산자)
		 * 
		 * 두 개의 값을 가지고 비교
		 * 비교 연산한 결과가 참일 경우 true / 거짓일경우 false값을 반환
		 * 즉, 비교연산자결과의 자료형은 논리값(boolean)임.
		 * =>후에 특정조건을 제시할 수있는 조건문에 많이 쓰일 예정.
		 * 등호는 뒤에온다.
		 * 크고 작음을 비교하는경우 < > <= >=  
		 * 일치함을 비교할때 == !=
	 * 
	 *
	 *
	 */
	public void method1() {
		int a= 10,b=25;
		System.out.println("a > b ? "+(a>b));
		//System.out.println("a > b ? "+a>b);
		//산술연산자가 비교연산자보다 우선순위가 높다
		System.out.println("a <= b ? "+(a<=b));
		
		boolean result1 =(a==b);
		boolean result2 =(a!=b);
		System.out.println("result1="+result1+" , result2="+result2);
		
		System.out.println(a-b<0);//true
		
		System.out.println(a*2>b/5);//true
		
		System.out.println("a가 짝수입니까?"+(a%2==0));
		System.out.println("b가 짝수입니까?"+(b%2==0));
		System.out.println("a와b가 5의 배수입니까?"+(a%5==0&&b%5==0));//출력문 안에서 AND,OR연산자를 사용가능
		System.out.println("a가 짝수가 아닙니까?"+!(a%2==0));
		System.out.println("a가 짝수가 아닙니까?"+(a%2!=0));
		
	}
	public void method2() {
		//사용자에게 값을 입력받아 욕설을 필터링 비교해보기
		Scanner sc = new Scanner(System.in);
		String S= sc.nextLine();
		char[] S2=S.toCharArray();
		char[] blank=new char[2];
		String[] G={"섹스","시발","병신"};
		
		for(int i=0;i<S2.length;i++) {
			if (blank==null) {
				blank[1]=S2[i];
			}else {
				blank[0]=blank[1];
				blank[1]=S2[i];
			}
			for(int j=0;j<G.length;j++) {
				
			}
		}
		
		
		
	}
}
