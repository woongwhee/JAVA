package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	Scanner sc= new Scanner(System.in);
	int first;
	int second;
	public void computer() {
		System.out.print("정수를 입력하세요 : ");
		first=sc.nextInt();
		second=sc.nextInt();
		sc.nextLine();
		System.out.println();
		//결과출력
		System.out.println("첫번째 정수 : "+first);
		System.out.println("두번째 정수 : "+second);
		System.out.println("더하기 결과 : "+(first+second));
		System.out.println("빼기 결과 : "+(first-second));
		System.out.println("곱하기 결과 : "+(first*second));
		System.out.print("나누기 결과 : "+(first/second));
		if(first%second!=0) {
			System.out.println("(나머지 :"+first%second+")");
		}//정수끼리의 나누기는 몫만 표시된다 때문에 형변환을 해줘야한다.
		System.out.print("(형변환)나누기 결과 : "+((double)first/second)+"\n");
		System.out.println("\n\n 괄호없이");//입력 20 3
		System.out.println("더하기 결과 : "+first+second);//결과 203
		//System.out.println("빼기 결과 : "+first-second);//실행불가
		//이경우 string+int 를 string으로 변환으후 -를 하는 거기 떄문에 에러가 난다.
		System.out.println("곱하기 결과 : "+first*second);//결과 60
		System.out.print("나누기 결과 : "+first/second);//6
		/*
		 *
		 */
		
	}
	
}
