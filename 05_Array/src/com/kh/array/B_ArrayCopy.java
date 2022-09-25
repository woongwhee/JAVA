package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	//배열의 복사에는 얕은(주소값)복사와 깊은(리터럴) 복사가 있다.
	void printArray(int arr[]) {
		for(int e:arr) {
		System.out.print(e+" ");
		}
		System.out.println();
	}
	public void method1(){
		//얕은복사
		int[] origin = {1,2,3,4,5};
		System.out.println("\n===원본배열===");
		printArray(origin);
		int[] copy = origin;
		System.out.println("\n===복사배열===");
		printArray(copy);
		
		origin[1]=50;
		System.out.println("\n===원본배열 수정후 출력===");
		printArray(origin);
		System.out.println("\n===원본배열 수정후 복사배열 출력===");//copy[1]도 50으로 변했다.
		printArray(copy);
		System.out.println();
		System.out.println(origin);//
		System.out.println(copy);//두값의 주소값을 확인해보면 똑같은걸 확인할수있다.
		
		
		
	}
	public void method2(){
		//깊은 복사 (4가지 방법이있다.)
		//1. 손복사
		int[] origin = {1,2,3,4,5};
		int[] copy=new int[origin.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i]=origin[i];
		}
		System.out.println("\n===원본배열===");
		printArray(origin);
		System.out.println("\n===복사배열===");
		printArray(copy);
		
		origin[0]=2000;
		System.out.println("\n===원본배열 수정후 출력===");
		printArray(origin);
		System.out.println("\n===원본배열 수정후 복사배열 출력===");//copy[0]은 변하지 않았다.
		printArray(copy);
		System.out.println("\n===주소값 확인===");
		System.out.println(origin);
		System.out.println(copy);//두값이 다르다
		
	}
	public void method3(){
		//2. System.arraycopy메소드
		int[] origin = {1,2,3,4,5};
		int[] copy=new int [10];
		System.arraycopy(origin, 0, copy, 0, 5);
//		System.arraycopy(원본배열명, 복사시작할 인덱스(원본), 복사본 배열명, 복사시작할 인덱스(복사본), 복사할 개수);
		System.out.println("\n===원본배열===");
		printArray(origin);
		System.out.println("\n===복사배열===");//1,2,3,4,5,0,0,0,0,0 
		printArray(copy);
		//크기를 10으로 설정해서 기본값이 나온다.
		
		// 예제 다음과 같이 배열을 만들어봐라
		//0 0 1 2 3 4 5 0 0 0
		//0 1 2 3 0 0 0 0 0 0
		//0 3 4 5 0 0 0 0 0 0
		int[] copy2=new int [10];
		System.arraycopy(origin, 0, copy2, 2, 5);//0 0 1 2 3 4 5 0 0 0
		int[] copy3=new int [10];
		System.arraycopy(origin, 0, copy3, 1, 3);//0 1 2 3 0 0 0 0 0 0
		int[] copy4=new int [10];
		System.arraycopy(origin, 2, copy4, 1, 3);//0 3 4 5 0 0 0 0 0 0
//		double[] copy5= new double[10];
//		System.arraycopy(origin, 0, copy5, 0, 5);
//		자동 형변환이 되지 않아 실행이 되지 않음.		
		System.out.println("\n===복사배열2===");
		printArray(copy2);
		System.out.println("\n===복사배열3===");
		printArray(copy3);
		System.out.println("\n===복사배열4===");
		printArray(copy4);
	}
	public void method4(){
		//Arrays 클래스의 copyof메소드
		//대신 java.util.Arrays를 불러와야된다.
		//
		int[] origin = {1,2,3,4,5};
		int[] copy=Arrays.copyOf(origin, 10);
		System.out.println("\n===원본배열===");
		printArray(origin);
		System.out.println("\n===복사배열===");//1,2,3,4,5,0,0,0,0,0 
		printArray(copy);
		
	}
	public void method5(){}
	public void method6(){}
	public void method7(){}
}
