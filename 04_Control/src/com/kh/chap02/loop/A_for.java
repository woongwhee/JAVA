package com.kh.chap02.loop;

import java.util.Scanner;

public class A_for {
	/*
	 * <반복문> 프로그램 흐름을 제어하는 제어문중 하나. 어떤 실행코드를 "반복적"으로 수행시켜줌.
	 * 
	 * 크게 두종류로 나누미(For문 ,while문(do-while문)) [표현법] for(초기식;조건식;증감식){ 반복적으로 실행시킬 코드 }
	 * 초기식 조건식 증감식 간에 세미콜론으로 각식을 구분한다. 무조건 세미콜론이 있어야한다. - 초기식 : 반복문이 시작될때
	 * "초기에 단한번만 실행"되는 구문 (반복문에서 사용할 변수를 선언 및 초기화 구문) 예) int i = 0; - 조건식 :
	 * "반복문이 수행될 조건" 을 작성하는구문 조건식이 true일경우 반복문 실행 조건식이 false가 되는 순간 반복문을 멈추고 빠저나옴
	 * (보통 초기식에 제시된 변수를 가지고 조건식을 작성) - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문 (보통 초기식에 제시된
	 * 변수를 가지고 증감식을 작성) 예) i++, i+=1
	 *
	 * for문 안에 초기식, 조건식, 증감식 가각생략 가능하긴 하다. 단 세미콜론은 생략하지 않고 반드시 2개 작성해야한다.
	 *
	 *
	 */
	public void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요");
		}
		for (int i = 0; i < 10; i += 2) {
			System.out.println("안녕하세요");
		}
		// 세개 모두 같은 내용이다.
	}

	public void method2() {
		// 1~5까지출력 i
		for (int i = 1; i < 6; i++)
			System.out.print(i + " ");
		System.out.println();
		for (int i = 0; i < 5; i++)
			System.out.println(i + 1 + " ");

	}

	public void method3() {
		// 5 4 3 2 1 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(5 - i);
		}
		for (int i = 5; i > 0; i--) {
			System.out.println(i + " ");
		}
	}

	public void method4() {
		//1~10사이 홀수만 출력
		for (int i = 1; i <= 10; i++)
			if (i % 2 != 0)
				System.out.print(i + " ");
		for (int i = 1; i < 10; i += 2)
			System.out.print(i + " ");
	}

	public void method5() {
		
		for (int i = 0; i <= 9; i++) {
			System.out.print(i + 1 + " ");
		}
	}

	public void method6() {
		//1~100까지의 총합계
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("1에서부터 " + i + "까지의 총합계 : " + sum);
		}
		System.out.println("최종합계 : " + sum);
	}

	//	산술연산 + 스캐너 + 반복문
	public void method7() {
		// 1에서 부터 사용자가 입력학 수자를 모두 더해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("양수입력 : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("양수를 입력하세요");
			return;
		}
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터" + num + "까지의 총 합계 : " + sum);

	}

	public void method8() {
		// 1에서 부터 random값까지 총 합계;
		// Math 클래스는 java.lang에 있으므로 import할 필요없다.
		// Math0.0<random<=1.0 의 값을 생성할수있다.
		// 최대값 최소값을 통제하기 위해선 (int)Math.random()*(최대값-최소값+1)+최소값;
		int random = (int) (Math.random() * 10) + 1;// 1<random<11즉 1~10;
		int sum = 0;
		for (int i = 0; i <= random; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 총 합계 : %d", random, sum);
	}

	public void method9() {// 문자열에서 문자뽑아오기
		String str = "apple";

		//
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void method10() {// 문자열에서 문자뽑아오기
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void method11() {
		//구구단 2단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 X %d = %d\n", i, (i * 2));
		}
	}

	public void method12() {
		//사용자에게 정수를 입력받고 해당하는 구구단을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단수 입력 : ");
		int dan = sc.nextInt();
		if (dan < 10 && dan > 1) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, (i * dan));
			}
		} else {
			System.out.println("잘못입력하셨습니다.(2~9)사이의 정수를 입력해주세요");
			method12();
		}

	}

	public void method13() {
		// 구구단 출력 단수를 랜덤한 값으로 받아서 출력
		// 범위는2~9
		int Dan = (int)( Math.random()*8) +2;
		System.out.println("====="+Dan+"단 출력!=====");
		for (int i = 1; i <= 9; i++) 
		{
			System.out.printf("%d X %d = %d\n", Dan, i, (i * Dan));
		}
	}
	public void method14() {
		//1 2 3 4 5 5번출력
		for (int i = 1; i <= 5; i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public void method15() {
		//***** 5번출력
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void method16() {
		/*
		 * 	1****
		 * 	*2***
		 * 	**3**
		 * 	***4*
		 * 	****5
		 * 출력
		 */
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.print(i+1);
//			for(int j=0;j<4-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i!=j) {
					System.out.print('*');
				}else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
	public void method17() {
		/*
		 * 12345
		 * 23456
		 * 34567
		 * 45678
		 * 56789
		 */
		for(int i=0;i<5;i++) {
			for (int j=1;j<6;j++) {
				System.out.print(j+i);
			}
			System.out.println();
		}
	}
}
