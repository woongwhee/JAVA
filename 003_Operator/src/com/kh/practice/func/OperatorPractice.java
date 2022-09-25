package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 : ");
		int People = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int Candy = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + (Candy / People));

		System.out.println("남은 사탕 개수 : " + (Candy % People));

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("반(숫자만) : ");
		int cLass = sc.nextInt();
		sc.nextLine();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String koreanGender = gender == 'M' ? "남학생" : gender == 'F' ? "여학생" : "?성별오류?";
		System.out.print("성적(소수점아래 둘째자리까지) : ");
		float record = sc.nextFloat();
		sc.nextLine();

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, cLass, number, name, koreanGender, record);

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.close();
		String isAdult = age > 19 ? "성인" : age > 13 ? "청소년" : "어린이";
		System.out.println(isAdult);

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int Language = sc.nextInt();
		sc.nextLine();
		System.out.print("영어 : ");
		int English = sc.nextInt();
		sc.nextLine();
		System.out.print("수학 : ");
		int Math = sc.nextInt();
		sc.close();
		int total = Language + English + Math;
		String result = Language >= 40 && English >= 40 && Math >= 40 && total / 3 >= 60 ? "합격" : "불합격";
		System.out.printf("합계 : %d\n평균 : %.1f\n", total, (float) total / 3);
		System.out.println(result);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char num = sc.nextLine().charAt(7);
		String gender = num < '0' && num > '4' ? "??" : (num == '1' || num == '3') ? "남자" : "여자";
		System.out.println(gender);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		boolean result = num1 >= input && num2 < input ? true : false;
		System.out.println(result);
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		sc.nextLine();

		boolean result = (num1 == num2 && num2 == num3) ? true : false;
		System.out.println(result);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int A = sc.nextInt();
		sc.nextLine();
		System.out.print("B사원의 연봉 : ");
		int B = sc.nextInt();
		sc.nextLine();
		System.out.print("C사원의 연봉 : ");
		int C = sc.nextInt();
		sc.nextLine();
		double Apa = A * 1.4;
		double Bpa = B;
		double Cpa = C * 1.15;
		System.out.printf("A사원의 연봉/연봉+a : %d/%.1f\n", A, Apa);
		System.out.println(3000.0 > Apa ? "3000미만" : "3000이상");
		System.out.printf("B사원의 연봉/연봉+a : %d/%.1f\n", B, Bpa);
		System.out.println(3000.0 > Bpa ? "3000미만" : "3000이상");
		System.out.printf("C사원의 연봉/연봉+a : %d/%f\n", C, Cpa);
		System.out.println(3000.0 > Cpa ? "3000미만" : "3000이상");
		//BigDecimal bd= new BigDecimal(Cpa+"");실수 정확한 계산을 위한 메소드
		//bd.add()
	}
	
}
