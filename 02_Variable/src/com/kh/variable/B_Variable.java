package com.kh.variable;

public class B_Variable {
	// 변수의 선언
	/*
	 * 변수의 선언(값을 기록하기 위한 변수를 메모리 공간에 확보해 두겠다 = 박스를 만들겠다)
	 * 
	 * 자료형 : 어떤값을 담아낼지 , 어떤 크기의 값을 담아낼지에 따라 변수의 크기 및 모양을 지정하는 부분
	 * 변수명 : 변수의 이름을 정하는 부분.
	 * 
	 * 주의할점! 
	 * 1. 변수명은 소문자로 시작하게끔 이름 지어줄것.(단,낙타등 표기법 지키기)
	 * ex) String userName;(0)
	 * ex2) String username;(x)
	 * 2. 같은영역({})안에서는 동일한 변수명으로 선언불가.
	 * 3. 해당영역에 선언된 변수는 해당영역안에서만 사용가능 (다른 일반메소드에서는 사용불가)
	 */
	public void declareVariable() {
		//표현법
		// 자료형 변수이름;
		//논리형 자료형(true,false)
		boolean isTrue;//1byte;
		//정수형 자료형
		byte bNum;//1byte
		short sNum;//2byte
		int iNum;//4byte
		long lNum;//8byte
		//실수형 자료형
		float fNum;//4byte
		double dNum;//8byte;
		//문자형 자료형
		char ch;//2byte
		//문자열 참조자료형 문자의 배열\0이다.
		String str;
		/*변수의 값을 대입하는 방법
		 * [표현법] 변수명 = 값;
		 */
		isTrue=true;
		bNum=1;
		sNum=2;
		iNum=4;
		lNum=8L;
		fNum=4.0f;
		dNum= 8;
		
		ch= 'A';
		str = "ABC";
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : "+bNum);
		System.out.println("iNum : "+iNum);
		System.out.println("sNum : "+sNum);
		System.out.println("lNum : "+lNum);
		System.out.println("fNum : "+fNum);
		System.out.println("dNum : "+dNum);
		System.out.println("ch : "+ch);
		System.out.println("str : "+str);
	}
	//변수의 초기화
	public void initVariable() {
		/*
		 * 변수 선언과 동시에 초기화(값 대입)
		 * [표현법] 자료형 변수명 =값(리터럴);
		 * 리터럴: 변수에 대입되는 값 자체
		 */
		//논리형
		boolean isTrue =true;
		//정수형
		byte bNum=1;
		short sNum=20;
		int iNum=300;
		long lNum=4000;
		//실수형;
		float fNum = 4.1313f;//소수점 7자리까지 표현가능하다.
		double dNum = 5.223455334;//소수점 15자리까지 표현가능하다.
		//문자 자료형
		char ch ='민';
		//참조 자료형(참조형)
		int[] iArr= {1,2,3,4,5,6,7,8,9};
		String str="최민";
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : "+bNum);
		System.out.println("iNum : "+iNum);
		System.out.println("sNum : "+sNum);
		System.out.println("lNum : "+lNum);
		System.out.println("fNum : "+fNum);
		System.out.println("dNum : "+dNum);
		System.out.println("ch : "+ch);
		System.out.println("str : "+str);
		System.out.print("iArr : {");
		for(int i=0;i<iArr.length;i++) 
		{
			System.out.print(iArr[i]);
		}
		System.out.print("}\n");
		int bigInt=999_999_999;//_로 자리수를 구분가능
		
		System.out.println("bigInt : "+ bigInt );
	}
	public void constantVariable() {
		//상수 는 변하지않는 변수값을 설정할수있음
		//상수는 대문자로 표기하는게 관례
		int age=20;
		final int CONSTAGE=300;
		System.out.println("age : "+age);
		System.out.println("constAge : "+CONSTAGE);
		age=25;
		//CONSTAGE=22;The final local variable CONSTAGE cannot be assigned. 
		System.out.println("5년뒤 age : "+age);
		System.out.println("5년뒤 constAge : "+CONSTAGE);
		
		
	}
}
