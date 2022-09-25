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
/*
 * 정리 
 * 1. 콘솔 창(모니터)에 출력하기 위해 : System.out.(print,printf,println)메소드 사용
 * 2. 콘솔 창(키보드)에 입력 받기 위해 :Scanner(System.in)을 이용해서(nextLin,next,nextInt,nextDouble)...
 * >주의사항<
 * 1. nextLine() 메소드을 제외한 메소드들은 \n 버퍼를 지워주는 기능을하지않는다 때문에
 *nextXxx()메소드 뒤에 nextLine()이 오면 엔터값만 삽입되게된다. 
 * 2. Scanner는 문자값을 입력받지 못해 charAt() 메소드를 통해 문자를 따로 뽑아야한다.
 * 
 */
