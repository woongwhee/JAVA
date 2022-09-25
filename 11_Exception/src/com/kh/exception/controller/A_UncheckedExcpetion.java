package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedExcpetion {
	//ArithmeticException 해결방법
	Scanner sc =new Scanner(System.in);
	public void method1() {
		System.out.print("첫번째 정수 : ");
		int num1=sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2=sc.nextInt();
		//방법1.조건문을 이용
//		System.out.println("나눗셈 연산 결과 : "+num1/num2);
//		if(num2!=0) {
//			System.out.println("나눗셈 연산 결과 : "+num1/num2);
//		}else {
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		System.out.println("프로그램 종료.");
		//방법2. 예외처리 구문으로 해결(예외가 발생했을 경우 실행할 내용을 정의해 두는것)
		/* [표현법]
		 * try ~ catch문.
		 * 
		 * try{
		 * 예외가 발생할 가능성이 있는 구문 
		 * }catch(발생될 예외 클래스 변수명){
		 * 예외가 발생할 경우 실행할 구문 
		 * 	
		 * }
		 */
		try {
			System.out.println("나눗셈 연산 결과 : "+num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
	}
	public void method2() {
		System.out.print("정수 입력(0 제외) : ");
		try {
			int num= sc.nextInt();
			//정ㅇ수 이외의 값을 입력한 경우 ,InputmisMatchException 발생!
			System.out.println("나눗셈 연산결과"+10/num);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("정수로 입력해주세요.");
			
		}
		
		System.out.println("프로그램 종료.");
		
	}
	public void method3() {
		System.out.print("배열의 크기 : ");
		int size =sc.nextInt();
//		try {
//			//100번째 인데스에 담긴 값을 출력
//			int []arr=new int[size];
//			for (int i = 0; i < arr.length; i++) {
//				arr[i]=(int)(Math.random()*100)+1;
//			}
//			System.out.print("출력할 값의 위치를 입력해주세요 : (0~"+(size-1)+")");
//			int print=sc.nextInt();
//			System.out.println("arr["+print+"] : "+arr[print]);
//		}catch(InputMismatchException e){//InputMissMatch를 제외하곤 if문으로 걸러낼수 있는 예외다 
//			System.out.println("정수로 입력해주세요.");
//		}
//		catch(NegativeArraySizeException e)  {
//			System.out.println("양수로 입력해주세요.");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("부적절한 인덱스로 접근했습니다.");
//		}
		try {
			//100번째 인데스에 담긴 값을 출력
			int []arr=new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=(int)(Math.random()*100)+1;
			}
			System.out.print("출력할 값의 위치를 입력해주세요 : (0~"+(size-1)+")");
			int print=sc.nextInt();
			System.out.println("arr["+print+"] : "+arr[print]);
		}catch(RuntimeException e){
			// 런타임 에러를 전부 걸러낼수있지만 권장하는 방법이 아니다.
			System.out.println(e.getMessage());
			System.out.println("에러 발생.근데 배열의 크기가 음수로 입력되었거나.입력값이 정수가 아니거나 배열의 사이즈가 100이하네요");
			
		}
		System.out.println("\n프로그램 종료.");
	}
	
	/* RuntimeException 관련된 예외는 조
	 * 건문으로 해결이 가능:
	 * 예외자체가 발생 안되게끔 개발자가 소스코드로 핸들링 할 수 있다.
	 * 예외처리 구문으로 해결 가능:
	 * 예외가 발생했을때를 대비해서 그 때 실행할 내용을 정의해 두는것.
	 * 
	 * 예측 가능한 상황=>조건문으로 해결 권장
	 * 예측 불가능한 상황=>예외처리 구문으로 해결.
	 * 
	 * RuntimeExceptionr계열은 충분히 예측가능한 상황이기 때문에 조건문으로 해결하는것을 권장.
	 * 
	 */
}
