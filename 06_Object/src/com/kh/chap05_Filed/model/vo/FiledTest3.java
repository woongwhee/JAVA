package com.kh.chap05_Filed.model.vo;

public class FiledTest3 {
	//클래스 변수와 상수필드(final)에 대해.
	//접근제한자[예약어] 자료형 변수명;
	//클래스 변수
	public static String str="스태틱변수" ;
	/* static "공유" 의 개념이 강함=> 프로그램 실행과 동시에 메모리영역에 박스를 만들어두고 공유해서 슸기위함.
	 * 자주 사용하는 변수, 메서드를 static으로 선언함.
	 * 생성시점: 프로그램 실행과 동시에 메모리 static영역에 할당(객체를 만들지않아도 사용가능)
	 * 
	 * 소멸시점: 프로그램 종료시 소멸됨.
	 * 
	 */
	
	
	
	//상수 
	/*상수필드
	 * public static final 자료형 변수명 =값;
	 * 
	 * 한번지정된 값을 고정해서 쓰기 때문에 생성과 동시에 초기화를 해줘야 한다.
	 * 
	 * 예약어 순서는 상관없다. final static도 가능
	 * 
	 * static : 공유의 개념
	 * final : 상수.
	 * 값이 변경되어서는 안되는 고정적인 값을 메모리 상에 올려두고 공유하면서 사용할 목적이다.
	 * (프로그램 실행과 동시에 메모리 역역에 할당, 값이 변하지도 않음)
	 * 공유하면서 사용할 목적.
	 * %%상수명은 항상 대문자로 작성해야된다.
	 * ex)Math.PI; 자바에서는 자주쓰이는 고정된값을 설정해 놨음
	 * 
	 */
	public static final int NUM=10;
	public static void method1() {
		System.out.print(NUM);
	}
	
}

