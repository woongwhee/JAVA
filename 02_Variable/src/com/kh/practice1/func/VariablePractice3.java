package com.kh.practice1.func;

import java.util.Scanner;

/*
 * 키보드로 가로,세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
 * 
 */
public class VariablePractice3 {
	Scanner sc= new Scanner(System.in);
	int length;
	int height;
	public void quadrangle() {
		System.out.println("가로길이를 입력하세요 : ");
		length= sc.nextInt();
		sc.nextLine();
		System.out.println("세로길이를 입력하세요 : ");
		height= sc.nextInt();
		sc.nextLine();
		
		System.out.println("가로: "+length);
		System.out.println("세로: "+height);
		System.out.println("면적: "+(length*height));
		System.out.println("둘레: "+(length+height)*2);
	}
	
}
