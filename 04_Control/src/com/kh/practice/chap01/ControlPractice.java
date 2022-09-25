package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n");
		int Input = sc.nextInt();

		switch (Input) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			// input();
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			// correct();
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			// search();
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			// delete();
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			// return;
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자 한개를 입력하세요 : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if (num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("\n수학점수 : ");
		int math = sc.nextInt();
		System.out.print("\n영어점수 : ");
		int eng = sc.nextInt();
		int total = kor + math + eng;
		if (total >= 180 && kor >= 40 && math >= 40 && eng >= 40) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + total / 3);
			System.out.println("축하합니다, 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월사이의 정수 입력: ");
		int month = sc.nextInt();
		if (month > 0 && month <= 12) {
			String season = "";
			switch (month / 3) {
			case 1:// 3 4 5
				season = "봄";
				break;
			case 2:// 6 7 8
				season = "여름";
				break;
			case 3:// 9 10 11
				season = "가을";
				break;
			case 0:
			case 4:// 1 2 12
				season = "겨울";
			}
			System.out.printf("%d월은 %s입니다.", month, season);
		} else {
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String idInput = sc.nextLine();
		System.out.print("비밀번호: ");
		String passwordIput = sc.nextLine();
		String id_01 = "minmin";
		String password_01 = "Min1234";
		if (idInput.equals(id_01) && passwordIput.equals(password_01)) {
			System.out.println("로그인 성공");
		} else if (!idInput.equals(id_01)) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String lever = sc.nextLine();

		switch (lever) {
		case "관리자":
			System.out.print("회원관리 , 게시글관리 ");
		case "회원":
			System.out.print("게시글 작성,댓글작성 ");
		case "비회원":
			System.out.print("게시글 조회");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double BMI = weight / height / height;
		System.out.println("BMI 지수 : " + BMI);
		if (BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI < 23) {
			System.out.println("정상체중");
		} else if (BMI < 25) {
			System.out.println("과체중");
		} else if (BMI < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1(양수) 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2(양수) 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		sc.nextLine();
		char oper = sc.next().charAt(0);
		if (num1 <= 0 || num2 < 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다. ");
			return;
		}
		System.out.printf("%d %c %d = ",num1,num2,oper);
		switch (oper) {
		case '+':
			System.out.printf("%d\n", num1, num2, num1 + num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			break;
		case '*':
			System.out.printf("%d * %d = %d\n", num1, num2, num2 * num2);
			break;
		case '/':
			System.out.printf("%d / %d = %f\n", num1, num2, (double) num1 / num2);
			break;
		case '%':
			System.out.printf("%d %% %d = %d\n", num1, num2, (int) (num1 % num2));
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다. ");
			return;
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		float midleScore = (float) sc.nextInt() * 0.2f;
		System.out.print("기말 고사 점수 : ");
		float endScore = (float) sc.nextInt() * 0.3f;
		System.out.print("과제 점수 : ");
		float projectScore = (float) sc.nextInt() * 0.3f;
		System.out.print("출석 회수 : ");
		float attend = sc.nextInt();
		sc.nextLine();
		float total = midleScore + endScore + projectScore + attend;

		System.out.println("===========결과============");
		if (attend < 15) {
			System.out.printf("Fail[출석 회수 부족(%d/20)]\n", (int) attend);
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", midleScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", endScore);
			System.out.printf("과제 점수(30)    : %.1f\n", projectScore);
			System.out.printf("출석 점수(20)    : %.1f\n", attend);
			System.out.println("총점: " + total);

			if (total >= 70) {
				System.out.println("PASS");
			} else {
				System.out.printf("Fail[점수미달]", (int) total);
			}
		}
	}

	

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.printf("1. 메뉴출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절 \n5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n9. P/f\n");
		System.out.print("선택 : ");
		int select = sc.nextInt();
		if (select > 0 && select < 10)
			System.out.printf("실습문제%d 실행\n", select);
		switch (select) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("잘못선택하셨습니다.정확한 값(1~9)을 입력해 주세요.");
			practice10();
		}

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999): ");
		int password_num=sc.nextInt();//정수만 받기위해 nextInt로 입력을 받는다.
		String password=password_num+"";
		
		
		if (password.length()!=4) {
			System.out.println("자리수 안맞음");
		} else if (password.charAt(0)!=password.charAt(1)&&password.charAt(0)!=password.charAt(2)
				&&password.charAt(0)!=password.charAt(3)&&password.charAt(1)!=password.charAt(2)
				&&password.charAt(1)!=password.charAt(3)&&password.charAt(2)!=password.charAt(3)) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

	}

}
