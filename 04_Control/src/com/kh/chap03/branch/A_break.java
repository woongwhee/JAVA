package com.kh.chap03.branch;

import java.util.Scanner;

public class A_break {
	/*
	 * break; break문에 속해 있는 반복문(중괄호 범위)을 빠저나간다
	 * 
	 * 주의할점: switch문에서 break는 해당 switch문만을 빠저나가기 위한 용도다. return 은 해당 메소드를 빠저나가는 구문이고
	 * break는 반복문을 빠저나가는 용도다.
	 */
	public void method1() {
		// 매번 반복적으로 발생되는 랜덤값(1~100)을 출력
		// 만약 그 랜덤값이 3의 배수라면 반복문을 빠저나간다.
		int i = 1;
		while (true) {

			int num = (int) (Math.random() * 100) + 1;
			System.out.printf("%d번쨰 숫자 : %d\n", i++, num);
			if (num % 37 == 0) {
				System.out.printf("37의 배수 %d 도착 프로그램 종료", num);
				break;
			}
		}

	}

	public void method2() {
		// 사용자에게 문자열을 입력받은 후 해당 문자열의 길이를 출력하는 반복문;
		// 사용자에게 입력받은 문자열이"exit"와 일치할 경우 반복을 종료
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("문자열을 입력하세요 : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {

				System.out.println("반복문 종료");
				break;
			}
			System.out.printf("문자열 : %s 길이 : %d\n", str, str.length());

		}

	}

	public void method3() {
		//사용자에게 정수값을 입력받아 양수라면 1부터 사용자가 입력한 정수까지 출력하고 종료
		//양수가 아니라면 다입력력 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력해주세요 : ");
		while (true) {
		int Num= sc.nextInt();
		
		if(Num>0) {
			System.out.printf("1부터 %d까지 출력 : ",Num);
			for(int i=1;i<=Num;i++) {
				System.out.print(i+" ");
			}
			break;
		}else {
			System.out.print("잘못된 입력 양수를 입력해 주세요 : ");
		}
		
		}

	}

}
