package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	Scanner sc= new Scanner(System.in);
	public void method1() {
		//사용자가 입력한 정수값이 양수이면서 짝수 인지 확인
		
		int num=sc.nextInt();
		boolean result = num> 0&&num%2==0;
		System.out.println("사용자가 입력한 값이 양수이면서 짝수? : "+result);
		
	}
	public void method2() {
		System.out.print("정수값 1개를 입력해 주세요: ");
		int num= sc.nextInt();
		
		//boolean result = 1<= num<=100;//이렇게 비교연산자를 이어 붙일 수 없다.
		boolean result = num>=1 &&num<=100;
		System.out.println("사용자가 입력한값이 1~100에 위치한 숫자인가요?: "+result);
	}
	public void method3() {
		System.out.println("영문를 한글자를 입력해주세요 : ");
		char ch= sc.next().charAt(0);
		sc.nextLine();
//		boolean result= ch>=65 && ch<=90;
		boolean result= ch>='A' && ch<='Z';
//		boolean result2= ch>='a' && ch<='z';
		boolean result2= ch>=97 && ch<=122;
		System.out.println("대문자인가?"+result);
		System.out.println("소문자인가?"+result2);	
	}
	public void method4() {
		System.out.println("계속하시려면 y를 입력해주세요: ");
		char ch= sc.next().charAt(0);
		boolean result = (ch=='y')||(ch=='Y');
		System.out.println("사용자가 입력4한값이 Y입까?"+result);
	}
	public void method5() {
		int num1=10;
		boolean result= num1<5&&num1++>1;
		System.out.printf("num1: %d , result : %s\n",num1,result);
		int num2=10;
		boolean result2= num2>5||num2++>1;
		System.out.printf("num2: %d , result2 : %s",num2,result2);
		boolean result3= false && ++num2>0;//이클립스에서 deadcode라고 알려준다.
	}
}
/*정리:
 * 
 * &&(and): 두조건 모두 true여야 결과값이 true
 * 	&&연산자는 연산자기준으로 왼쪽의 결과가 false면 뒤의 조건식은 실행되지않음.
 * ||(or): 두조건중 하나라도 true이면 결과값이 true
 *	||연산자는 연산자기준으로 왼쪽값이 true 뒤의 조건식은 실행하지않음.
 *
 */

