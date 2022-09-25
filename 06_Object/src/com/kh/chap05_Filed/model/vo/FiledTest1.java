package com.kh.chap05_Filed.model.vo;

public class FiledTest1 {
/* 변수구분
 * - 전역변수 : 클래스 영역에 바로 선언하느 변수->클래스 내에서면 어디서든 사용가능.
 * - 지역변수 : 클래스 영역내의 어떤특정구역({})에 선언한 변수(선언한 지역에서만 사용가능)
 *
 * 1. 전역벽수(2가지로 크게 구분됨)
 * 		1)멤버변수(= 인스턴스변수,필드)
 * 			인스턴스가 생성됨과 동시에 생성되는 변수.
 * 			생성시점 : new 연산자를 통해 해당 객체가 생성되는 순간 heap메모리영역에 할당 
 * 			소멸시점 :객체 소멸시 같이 소멸.
 * 		2)클래스변수 static변수 :static이라는 예약어가 붙어 있냐 아니냐에 따라 멤버변수냐 클래스변수냐로 구분.
 * 			프로그램이 시작되면 그 단계에 static영역에 호출이되는 변수.
 * 			생성시점 : 프로그램 실행과 동시에 static메모리영역에 할당
 *			단 해당 클래스가 import 되어 있어야 한다.
 * 			소멸시점 : 프로그램 종료시 같이 소멸
 * 2. 지역변수
 *		생성시점 : 특정구역({})실행시 stack메모리영역에 할당 ex)메소드 실행
 * 		소멸시점 : 특정한 구역을 빠저나올때 소멸.
 * 		 
 */
	private int global;//전역변수(필드)
	//초기화블록으로 전역변수 초기화.
	/*{
	 * 	global=1;
	 * }
	 */
	public static int classVariable;
	// 스태틱 초기화 블록	
	 static{
		 classVariable=100;
	 }
	 
	public static void classVariablePrint() {
		System.out.println(classVariable);
	}
	public void method1(int num) {
		//private int local; (x) 지역변수는 접근제한자가 붙지않음.
		//final int local;
		int local=0;
		if(true) {
			int a= 0;
		}
		
		//멤버변수 : 객체생성시 자동으로 초기화가 되기때문에 초기화를 해주지 않아도 사용가능.
		System.out.println("global : "+global);
		
		//클래스변수 : 프로그램 시작시 자동으로 초기화되기 때문에 사용가능;
		System.out.println("classVariable : "+classVariable);
		
		//지역변수: 초기화를 한뒤 사용가능.
		System.out.println("local : "+local);
		
		//초기화를 해야 메소드를 실행할수 있기때문에 초기화를 해주지 않아도 실행가능.
		System.out.println("num : "+num);
		
		//System.out.println("a : "+a); 지역변수: 중괄호 밖에서 사용불가
	}	
	
}
