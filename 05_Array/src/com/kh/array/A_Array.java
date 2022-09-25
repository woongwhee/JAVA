package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 배열 하나의 공간에 같은 자료형을 가진 여러가지 값을 담을 수 있다. [표현법] 자료형 [] 변수명;<= 권장 자료형 변수명 []; ex)
	 * int []arr=new int[3] ->int형의 자료가 3개 들어 갈 수 있는 공간을 할당한다. 배열의 공간 3칸에는
	 * arr[0],arr[1],arr[2]로 하나의 변수처럼 접근할수있다. 마지막 인덱스는 크기의-1 첫인덱스는 0부터 시작된다.
	 * 
	 * 변수는 값을 할당하면 stack 메모리에 값이 그대로 저장된다. 하지만 배열은 값을 할당 하면 heap메모리에 그 값이 저장된다.
	 * stack 메모리에 저장되는 값은 heap메모리에 할당된 배열의 0번값의 주소다.
	 * 
	 */
	public void method1() {
		// 배열의 장점
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		// 이런식으로 변수를 하나하나 선언할수도 있겠지만 이렇게 선언을하면
		// 변수를 제어하기위해 반복문을 사용할수없다.
		// 만약 변수가 1000개 100만개라면??

	}

	public void method2() {
		/*
		 * 1. 배열의 선언 자료형 [] 변수명;<= 권장 자료형 변수명 [];
		 *
		 * 2. 배열할당 배열에 크기를 지정해주는 방법 배열명 = new int[배열 크기]
		 *
		 *
		 */
		int[] arr;
		arr = new int[6];

		// 배열 선언과 동시에 할당
		int[] arr2 = new int[5];
		// 값을 할당하는법
		// 1.인덱스를 이용한 초기화
		arr[0] = 1;
		arr[1] = 2;
		// 2.for문을 이용한 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		// 3. 선언과 동시에 초기화
		int[] arr3 = { 1, 2, 3, 4, 5, 6 };

		// 배열 출력
		//
		System.out.println(arr);// 다음과같이 출력하면 arr[0] 의 주소값이 출력된다.
		System.out.println(arr.hashCode());// 주소값을 10진수로 출력할수있다.
		for (int i = 0; i < arr3.length; i++) {// 반복문으로인덱스에 접근해서 출력해야됨.
			System.out.printf("arr3[%d] = %d\n", i, arr3[i]);
		}
		/*
		 * 기본자료형 (char, float, byte, long ,short, int ,boolean,double) =>일반변수 : 실제
		 * 값(리터럴)을 stack 메모리에 바로 담을수 있는 변수 그 외 자료형:(int[],String,Scanner)등 => 참조변수(레퍼런스
		 * 변수) : 주소 값을 가지고 있는 변수. new를 통해 초기화가 가능한 변수
		 */
	}

	public void method3() {
		int[] iArr = new int[3];
		double[] dArr = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i]);// 0 0 0
		}
		for (int i = 0; i < 3; i++) {

			System.out.println(dArr[i]);// 0.0 0.0 0.0
		}
		// 배열 인덱스를 초기화 해주지 않아도 기본 값이 담겨있다.

		// 배열의 크기
		// 배열명.length
		// length는 함수가 아니다.
		// 배열을 선언함과 동시에 iArr에 담긴 맴버변수입니다.

		System.out.println("iArr의 크기는?" + iArr.length);

	}

	public void method4() {
		int result;
		int [] iArr;
//		System.out.println(iArr);
//		System.out.println(result);
//		배열도 리터럴이 초기화 되어 있지 않으면 없으면 사용 할 수 없다.
//		null값으로 빈 배열을 초기화 할 수 있다.
		iArr=null;
		System.out.println(iArr);//null
//		System.out.println(iArr.length);// NullPointerException
		if(iArr!=null) {
			System.out.println(iArr.length);
			System.out.println(iArr.hashCode());//}
		}
		
	}

	public void method5() {
		int[] arr= new int[5];
		/*arr[0]=2
		 *arr[1]=4
		 *arr[2]=6
		 *arr[3]=8
		 *arr[4]= 10
		 *대입하고 출력한다.
		 */
		for (int i = 0; i < arr.length; i++) {
			arr[i]=2*i+2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
//		arr[0]=2;
//		for (int i = 1; i < arr.length; i++) {
//			arr[i]=arr[i-1]+2;
//		}
		/*
		 * 배열의 단점 
		 * 한번 지정한 크기는 변경이 불가능하다.
		 * => 배열의 크기를 변경하고 자한다면  어쩔수없이 배열을 새로 선언해야 한다.
		 * 
		 * new 연산자 선언시 기존에 생성된 주소와는 다른고유한 주소값이 부여된다.
		 * 기존에 참고하고 있던 연결이 끊기고 새로운 곳을 참조하게 되는경우
		 * 연결이 끊긴 기존 배열은 heap영역에 붕뜨게된다. 
		 * 이를 자바에선 GC가 자동으로 삭제해준다.
		 * GC가 없는 경우 heap영역의 남은 값을 삭제해 주지 않으면 
		 * 메모리의 전원이 끊길때 까지 메모리에 남아 있게 된다. 
		 * 
		 */
		arr=null; // 연결을 수동으로 끊는방법
	}

	public void method6() {
		//선언과 동시에 할당 하고 초기화하는 방법
		int[] arr={0,1,2,3,4,5,6,7,8}; 
		int[] arr2=new int[]{0,1,2,3,4,5,6,7,8};//똑같이 작동된다.
		//배열 비교
		System.out.println(arr=arr2);//false;
		//String처럼 참조형 자료형은 비교연산자(==)를 사용할수없다.
		//이는 주소값간의 동등 비교 연산이다.
		
		
		
	}

	public void method7() {
		//1. 크기 10짜리 정수 배열선언
		//2. 반복문 활용해서 0에서 마지막 인덱스까지 순차적으로 값을 대입
		//값->랜덤값(1~100)
		//3.반복문활용해서 배열에 담긴값을 출력
		//arr[x] : xx
		int[] arr=new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
	}

	public void method8() {
		/*1. 사용자에게 배열의 사이즈 값을 입력받은후 해당크기만큼 배열생성
		 *2. 반복문을 활용해서 사용자에게 과일명을 입력받아 그 값을 인덱스에 대입
		 *3. 과일을 한줄료 출력
		 */
		Scanner sc =new Scanner(System.in);
		System.out.print("입력할 과일의 갯수를 입력하세요: ");
		int size=sc.nextInt();
		sc.nextLine();
		String[] fruit=new String[size];
		for (int i = 0; i < fruit.length; i++) {
			System.out.print("과일명 : ");
			fruit[i]=sc.nextLine();
		}
		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i]+" ");
		}
		
	}

	public void method9() {
		//1. 사용자에게 문자열을 입력받고.
		//2. char배열 생성해두기.(문자열의 길이만큼
		//3. 문자열을 문자배열로 만들기
		//4. 출력해서 확인
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열을 입력해 주세요");
		String str=sc.nextLine();
		char[] cArr=new char[str.length()];
		for (int i = 0; i < cArr.length; i++) {
			cArr[i]=str.charAt(i);
		}
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i]+" ");
		}
	}
	
	public void method10() {
		int [] arr= new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n ",i,arr[i]);
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("\n짝수들의 총합 : "+sum);
	}
}
