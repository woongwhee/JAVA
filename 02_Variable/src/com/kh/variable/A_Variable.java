package com.kh.variable;
import java.util.Scanner;
public class A_Variable {
	//변수의 필요성 알아보기
	//시급과 근무일수를 곱해서 월급을 계산하는 프로그램 9160
	//시급
	String userName;
	int hourlyWage = 9180;
	int workTime=0;
	int workDay=0;
	public void setVariable(){
		Scanner sc= new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		userName=sc.nextLine();
		System.out.println("최저시급을 받나요? (y/n): ");
		String YN=sc.nextLine();
		char yn=YN.charAt(0);
		if(yn=='Y'||yn=='y') {
		System.out.println("시급 : "+hourlyWage);
		}else {
			System.out.println("시급을 입력하세요 : ");
			hourlyWage=sc.nextInt();
		}
		System.out.println("근무시간을 입력하세요 : ");
		workTime=sc.nextInt();
		System.out.println("근무일수를 입력하세요 : ");
		workDay=sc.nextInt();
		sc.close();
	}

	/*
	 * public void printVariable() {
	 * 
	 * System.out.println("시급 : 9180"); System.out.println("근무시간 : 6");
	 * System.out.println("근무일수 : 20"); //월급 System.out.println("진웅휘의 월급은"+
	 * (9180*6*20) +"입니다." ); }
	 */
	public void getInfo() {
		System.out.println("이름 : "+userName);
		System.out.println("근무시간 : "+workTime);
		System.out.println("근무일수 : "+workDay);
		System.out.println("시급 : "+hourlyWage);
	}
	public void printMontlypay() {
		System.out.println(userName+"의 월급은"+ hourlyWage*workTime*workDay +"입니다." );
	}

	
}
