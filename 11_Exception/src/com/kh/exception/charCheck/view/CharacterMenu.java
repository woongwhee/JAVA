package com.kh.exception.charCheck.view;

import java.util.Scanner;

import com.kh.exception.charCheck.controller.CharacterController;

public class CharacterMenu {
	public void menu() {
		CharacterController cc= new CharacterController();
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 :");
		String str=sc.nextLine();
		int count=cc.coutnAlpha(str);
		System.out.printf("'%s' 에 포함된 영문자수 : %d\n",str,count);
		
	}
}
