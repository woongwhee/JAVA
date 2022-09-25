package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	Scanner sc= new Scanner(System.in);
	public void keyboradInput() {
		System.out.print("문자열을 입력하세요 : ");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.printf("%d 번째 문자 %c\n",i,str.charAt(i));
		}
	}

}
