package com.kh.array;

import java.util.Scanner;

public class C_DimesionalArray {
	//이 차원 배열은 일차원 배열을 여러개 묶은것!
	void printarray(int arr[][]) {
		/*2차원 배열 출력;
		 * 중첩반복문을 사용해서 출력한다.
		 * 
		 */
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	void printarray(char arr[][]) {
		/*2차원 배열 출력;
		 * 중첩반복문을 사용해서 출력한다.
		 * 
		 */
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%c ",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public void method1() {
		/*
		 * 이차원 배열 선언
		 * [표현법]
		 * 	1. 자료형 배열명[][]
		 * 	2. 자료형[][] 배열명
		 * 	3. 자료형[] 배열명[]
		 * 
		 */
		int arr[][];
		int[][] arr2;
		int[] arr3[];
		/* 이차원 배열 할당
		 * 1. 배열명 =new 자료형[1차원 크기][2차원 크기];
		 *  배열명.length 는 1차원의 길이다.
		 *  배열명[x].length 는 2차원의 길이다.
		 *  
		 */
		arr=new int[2][3];
		int[][] arr1=new int[3][4];
		System.out.println(arr1.length);//2
		System.out.println(arr1[0].length);//2
		
		
		//String str[2][2]= {"","","",""}이건 C방식
		/*2차원 배열 선언과 동시에 초기화;
		 * 배열안에 배열을 초기화 한다고 생각하면된다.
		 * 타입 변수명[][]={{배열[0][0]요소,배열[0][1]},{배열[1][0]요소,배열[1][1]},{배열[2][0]요소,배열[2][1]}};
		 */
	}
	public void method2() {
		int[][]arr=new int[3][5];
		int num=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=num++;
			}
		}
		printarray(arr);
	}
	public void method3() {
		/* 가변 배열
		 * 행의 크기는 정해져있으나 각각의 행별 열의 갯수가 정해지지 않은 형태
		 * 이차원 배열== 일차원배열을 여러개 묶은 형태.
		 * 즉, 묶여있는 일차원 배열의 길이가 꼭 같을 필요는 없다.
		 * 행 크기는 생략이 불가능 반드시 지정해야 하지만
		 * 열크기는 생략이 가능하다. 각행의 열의 길이가 변경이 가능하다...?
		 * 
		 */
		int[][] arr= new int[3][];
		System.out.println(arr);
		System.out.println(arr[0]);//null
		
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[4];//에러안남
		int num=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=num++;
			}
		}
		printarray(arr);
		
	}
	public void method4() {
		char[][] cArr=new char[3][];
		cArr[0]=new char[3];
		cArr[1]=new char[2];
		cArr[2]=new char[4];
		char A='a';
		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				cArr[i][j]=A++;
			}
		}	
		printarray(cArr);
	}
	public void method5() {
		//int 형 2차원 배열을 만들어서
		//0 번행 에는 국어점수를 3개 입력받고
		//1 번행 에는 영어점수를 3개 입력받고
		//각기 반복문을 활용해서 출력하기
		Scanner sc=new Scanner(System.in);
		int[][] score=new int[2][3];
		char[] ge= {'국','영'};
		for (int i = 0; i < score.length; i++) {
			System.out.print(ge[i]+"어점수를 입력하세요: ");
			for (int j = 0; j < score[i].length; j++) {
				score[i][j]=sc.nextInt();
			}
			sc.nextLine();
		}
		for(int i=0;i<score.length;i++) {
			System.out.print(ge[i]+"어점수 : ");
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%d ",score[i][j]);
			}
			System.out.println();
		}
	}
}
