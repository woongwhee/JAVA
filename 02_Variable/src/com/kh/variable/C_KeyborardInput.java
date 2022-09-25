package com.kh.variable;
import java.util.Scanner;

public class C_KeyborardInput {
	double height;
	String name;
	String address;
	int age;
	char gender;
	public void inputTest1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name=sc.next();//사용자가 입력한 값중에 공백이 있을 경우에 공백 이전까지만 출력을 함
		sc.nextLine();
		System.out.print("키를 입력하세요(xx.x) : ");
		height=sc.nextDouble(); 
		sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		address=sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age=sc.nextInt();
		sc.nextLine();
	}
	public void info() {
		System.out.println("이름: "+name+"성별: "+gender+"키: "+height+"나이: "+age);
	}
	public void inputTest2() {
		Scanner sc = new Scanner(System.in);
		/*Scanner 클래스 
		 * 빈칸으로 입력을 구분하는 명령어(단어단위로) next()
		 * 개항으로 입력을 구분하는 명령어(줄단위) nextLine()
		 * 
		 * 자바는 문자형을 입력받는 명령어가 없다. 
		 *  charAt() 를 통해 char 형 문자를 받아야된다. 
		 */
		//인적사항을 출력하는 프로그램(이름,성별(M,F),나이,키)
		System.out.println("이름을 입력하세요 : ");
		name =sc.nextLine();
		System.out.println("성별을 입력해 주세요(M/f) : ");
		gender=sc.nextLine().charAt(0);
		System.out.print("키를 입력하세요(xx.x) : ");
		height=sc.nextDouble(); 
		sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age=sc.nextInt();
		sc.nextLine();
	}
}
