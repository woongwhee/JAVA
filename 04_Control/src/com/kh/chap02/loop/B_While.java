package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	public void method1() {
	
		int i=0;
		while(i<10) {
			
			i++;
		}
			System.out.println(i);//i의값은 10; while문은 
			//false가 되는 시점에 탈출한다는 점만 유의하면 된다. 
	}
	public void method2() {
		//For 예제 2번 while 문으로 변경
		int i=1;
		while (i!=6) {
			System.out.print((i++)+" ");
			
		};
		
	}
	public void method3() {
		//1~10사이의 홀수만 출력하는프로그램
		
		int i=1;
		while(i<10) {
			if(i%2==1)System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println("i의값은?"+i);
		i=1;
		while(i<10) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println();
		System.out.println("i의값은?"+i);
	}
	public void method4() {
		//1~100까지의 총합!
		int Random=(int)(Math.random()*100)+1;
		int sum=0;
		int i=1;
		while(i<=Random) sum+=i++;
		
		System.out.printf("1부터 %d까지의 총합은%d",Random,sum);
	}
	public void method5() {
		Scanner sc= new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str= sc.nextLine();
		int i=0;
		int strLength=str.length();//.length()도 결국은 메소드 하나기때문에 
		//따로 변수로 빼서쓰는게 효율이 좋을거같다ㅏ.
		while(i<strLength) {
			System.out.println(str.charAt(i++));
		}
		
	}
	//do while 문 궂이? 잘안쓴다.
	/*[표현법]
	 * do{
	 * 실행할 코드;
	 * }while(조건식);
	 * 
	 * do-while문에는 세미콜론을 꼭 붙여줘야 한다.
	 * do-while문은 조건식이 true던 false던 무조건 1번은 실행하고, 그후에 조건을 검사함.
	 * while문은 처음 수행할때도 조건검사를 하고 true여야 안의 내용이 실행되는데
	 * 단, do-while문은 첫 실행은 별도의 조건검사 없이. "무조건" 한번은 실행됨
	 */
	public void method6() {
		//무조건 한번은 실행된다.
		int num =1;
		do {
			System.out.println("안녕하세요");
		}while(num==0);
	}
	public void method7() {
		// 1 2 3 4 5
		int i=1;
		do {
			System.out.println(i++ +" ");
		}while(i<=5);
	}
	
	public void method8() {
		//1부터 사용자가 입력한 숫자의 총 합계
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum=0,i=1;
		do {
			sum+=i++;
		}while(i<=num);
		
		System.out.printf("1부터 %d까지의 총 합계 : %d",num,sum);
	}
}
