package com.kh.operator;

import java.util.Scanner;

public class G_TripleOper {
	/*
	 * 삼항연산자 : 3개의 값을 가지고 연산하는 연산자
	 * 
	 * 조건식? (true라면실행할)실행문:(false라면실행할)실행문 
	 * 조건식은 중첩해서 사용이 가능합니다.
	 * 조건식은boolean타입
	 * 실행문이 아니라 자료형들이 올수있음(str int 등)
	 * 그떄 실행문간의 자료형을 통일시켜야된다.
	 * 조건문보다 자료형을 저장하는데 유용한거같음
	 * 
	 */
	Scanner sc= new Scanner(System.in); 
	public void method1(){
		System.out.println("정수값을 입력하세요: ");
		int num = sc.nextInt();
		String str= num>0? "양수임":"양수가아님";
		System.out.println(str);
		sc.close();	
	}
	public void method2() {
		System.out.println("정수값 한개를 입력해 주세요: ");
		int num= sc.nextInt();
		String str= num% 2 == 0? "짝수입니다.":"홀수입니다.";
		System.out.printf("%d는%s",num,str);
		sc.close();
	}
	public void method3() {
		System.out.print("종료하시려면 y를 눌러주세요.");
		char ch= sc.nextLine().charAt(0);
		String str=ch == 'y'||ch=='Y'?"종료하겠습니다.":"계속진행하겠습니다.";
		System.out.println(str);
		sc.close();
	}
	public void method4() {//문자를 입력받고 대문자인지 판별
		System.out.println("영어를 입력해 주세요: ");
		char ch = sc.nextLine().charAt(0);
		String str= ch>='A'&&ch<='Z'?"대문자 입니다.":"대문자가 아닙니다.";
		System.out.println(str);
		sc.close();
	}
	public void method5() {
		System.out.println("정수값을 입력하세요: ");
		int num = sc.nextInt();
		String str= num>0? "양수임":num<0?"음수임":"0임";
		System.out.println(str);
		sc.close();
		
	}
	public void method6() {
		/* 3개 값을 입력받음
		 * 2개값은 정수 나머지는 +, - 문자를 입력받아
		 * +,-일경우 2개의 정수를 연산한후 출력
		 * +-도 아닌경우"잘못입력하셨습니다. 출력"
		 * 
		 */
		System.out.println("수식을 입력하세요(숫자 (+,-) 숫자) : ");
		int a= sc.nextInt();
		char oper= sc.next().charAt(0);   
		int b= sc.nextInt();
		
//		System.out.println(oper!='+'&&oper!='-'?
//				"잘못입력하셨습니다.":oper=='+'?(a+b):(a-b)
//			);
		String result=oper == '+' ? a+b+"" :oper =='-'?a-b+"":"잘못입력하셨습니다."; 
		//숫자에 +""를 해주면 강제로 String 타임으로 형변환이 가능하다.
	}

}

