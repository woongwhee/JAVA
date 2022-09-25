package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc=new Scanner(System.in);
	private TokenController tc=new TokenController();
	
	public void mainMenu(){
		System.out.printf("1. 지정 문자열\n2. 입력 문자열 \n9. 프로그램 끝내기\n");
		System.out.print("메뉴선택 : ");
		int select=sc.nextInt();
		sc.nextLine();
		if(select==1) {
			tokenMenu();
			mainMenu();
		}else if(select==2) {
			inputMenu();
			mainMenu();
		}else if(select==9) {
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("잘못입력하셨습니다. 다시입력하세요.");
			mainMenu();
		}
		
		
	}
	public void tokenMenu(){
		String str= "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 문자열 : "+str);
		System.out.println("토큰 처리 전 글자 수 : "+str.length());
		String str2=tc.afterToken(str);
		System.out.println("토큰 처리 후 문자열 : "+str2);
		System.out.println("토큰 처리 후 글자 수 : "+str2.length());
		System.out.println("모두 대문자로 변환 : "+str2.toUpperCase());
		
	}
	public void inputMenu(){
		System.out.print("문자열을 입력하세요 : ");
		String str=tc.firstCap(sc.nextLine());
		System.out.println("첫 글자 대문자 : "+str);
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char one=sc.nextLine().charAt(0);
		System.out.println(tc.findChar(str, one));
	}
	
}
