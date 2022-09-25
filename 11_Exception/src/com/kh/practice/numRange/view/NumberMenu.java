package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;

public class NumberMenu {
	public void menu() {
		NumberController nc= new NumberController();
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1=sc.nextInt();
		System.out.print("정수2 : ");
		int num2=sc.nextInt();
		
		System.out.printf("%d은(는) %d의 배수인가? %b",Math.max(num1, num2),Math.min(num1, num2),nc.checkDouble(num1, num2));
	}
}
