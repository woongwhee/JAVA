package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	Scanner sc=new Scanner(System.in);
	
	public void seting() {
		System.out.print("이름을 입력하세요 : ");
		String name= sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender=sc.nextLine().charAt(0);
		String Gender;
		if (gender=='남') {
			Gender="남자";
		}else if(gender=='여') {
			Gender="여자";
		}else {
			Gender="무성";
		}
		
		System.out.print("나이를 입력하세요 : ");
		int age= sc.nextInt();
		sc.nextLine();		
		System.out.print("키를 입력하세요 : ");
		double height= sc.nextDouble();
		sc.nextLine();
		System.out.println("키 "+height+"인 "+age+"살 "+Gender+" "+name+"님 반갑습니다^^");
	}
	
}
