package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * switch 문은 조건문이다. switch문과 if문의 차이점.
	 * 
	 * if(조건식)=>조건식을 복잡하게 기술가능함. 범위도 제시가능함(비교연산자 등) switch 조건식=> 확실한 값의 조건만
	 * 기술가능(동등비교만수행가능)
	 * 
	 * [표현법] switch(동등비교할 대상){ case 값1: 실행될코드1; braek; //else if문과는 다르게 뒤에 문장이 전부
	 * 실행된다. //때문에 break를 걸어줘야된다. case 값2: 실행될코드2; braek; case 값3: 실행될코드3; braek;
	 * default: 실행할코드;//생략가능 } switch문의 장점.-> case를 통해 내가 실행하길 원하는 코드를 한번에 찾아가기 때문에
	 * 연산이 빠르다.
	 * 
	 * 
	 */
	public void method1() {
		/*
		 * 1~3사이의 정수값을 입력받아서 1인경우 "빨간불입니다." 출력 2인경우 "파란불입니다." 출력 3인경우 "초록불입니다." 출력
		 * 잘못입력한경우 => "잘못입력했습니다."출력
		 */
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
//		if (number == 1) {
//			System.out.println("빨간불입니다.");
//		} else if (number == 2) {
//			System.out.println("파란불입니다.");
//		} else if (number == 3) {
//			System.out.println("초록불입니다.");
//		} else {
//			System.out.println("잘못입력했습니다.");
//		}
		switch (number) {
		case 1:
			System.out.println("빨간불입니다.");
			break;
		case 2:
			System.out.println("파란불입니다.");
			break;
		case 3:
			System.out.println("초록불입니다.");
			break;
		default:
			System.out.println("잘못입력했습니다.");
		}
	}

	public void method2() {
		// 사용자에게 구매할 과일 이름을 입력받고(사과 복숭아 바나나)을 입력받아
		// 각 과일마다 가격을 출력하는 프로그램(사과 1000 바나나 2000 복숭아 5000);
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 과일을 입력하세요 (사과,바나나,복숭아) : ");
		String fruit = sc.nextLine();

		int price = 0;
		switch (fruit) {//switch 에서는 String은 equals메소드 없이 비교가 가능하다.
		case "사과":
			price = 1000;
			break;
		case "바나나":
			price = 2000;
			break;
		case "복숭아":
			price = 5000;
			break;
		default:
			System.out.println("잘못입력하셨습니다.다시입력해주세요");
			method2();
			return;
		}
		System.out.printf("%s의 가격은 %d입니다.",fruit,price);
	}
	public void method3() {
		//사용자에게 등급별로 권한을 부여하는 프로그램
		//1 : 관리권한, 글쓰기권한, 읽기권한
		//2 : 글쓰기권한 ,읽기권한
		//3 : 읽기권한
		Scanner sc = new Scanner(System.in);
		System.out.println("등급을 입력하세요(정수): ");
		int lever=sc.nextInt();
		
		switch (lever) {
		case 1:System.out.print("관리권한 ");
		case 2:System.out.print("글쓰기권한 ");
		case 3:System.out.print("읽기권한");
		default: System.out.println();
		}
	}
	public void method4() {
		//사용자에게 1월~12월사이의 월을 입력받아 해당달의 마지막날짜를 출력하는 프로그램
		//출력문 : 해당 달은 xx일까지 입니다.
		//"1월에서 12월까지 의 숫자를 입력하셔야  합니다"
		//2월은 ->해당달은 28일또는 29일까지입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("마지막 날을 알고 싶은 달을 입력하세요(1~12): ");
		int Moon=sc.nextInt();
		
		switch(Moon) {
		case 1: case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println("해당 달은 31일까지 입니다.");
			break;
		case 4: case 6:case 9:case 11:
			System.out.println("해당 달은 30일까지 입니다.");
			break;
		case 2:
			System.out.println("해당 달은 28일또는 29일까지 입니다.");
			break;
		default:
			System.out.println("1월에서 12월까지 의 숫자를 입력하셔야합니다. 다시입력하세요");
			method4();
			return;
			
			
			
		}
	}
}
