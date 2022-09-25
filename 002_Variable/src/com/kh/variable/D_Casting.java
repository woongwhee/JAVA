package com.kh.variable;

public class D_Casting {
	/*
	 * 형변환 :값의 자료형을 바꾸는 개념
	 * 
	 * 1. 대입연산자를 기준으로 왼쪽값과 오른쪽값이 같은 자료형이여야한다.
	 * =>즉 , 같은 자료형에 해당하는 값만 대입이 가능하다.
	 * => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수!
	 * [표현법] 자료형 변수명 =(바꿀 자료형) 값;
	 * ex) long a = (long) 999999999;
	 * 2. 같은 자료형끼리만 연산가능.
	 *  => 즉, 다른 자료형끼리 연산을 수행하고 싶으면 한 구문은 "형변환을" 해야함.
	 *  [표현법]값 +(바꿀 자료형) 값;
	 *  ex) int a= 3; 
	 *  	double b= 3.14;
	 *  a+(int) b;//6
	 *  형변환의 종류
	 *  ㄱ. 묵시적 형변환 => 자동을형변환이 진행되기 떄문에 내가 직접 형변환을 진행할 필요가 없음.
	 * 				
	 * 		 
	 *  ㄴ. 명시적 형변환=> 자동 형변환이 되지 않아 직접 형변화을 해야 하는 경우
	 *  
	 *  [표현법] (바꿀자료형) 값;
	 *  
	 *  
	 *  (바꿀자료형)== 형변환연산자 == cast연산자
	 */
	public void autoCasting() {
		int i1=10;
		double d1=i1;
		System.out.println("d1 : "+d1);
		int i2 =12;
		double d2 = 3.3;
		double result= i2+d2;
		System.out.println("result : "+result);
		i2+=d2;//15
		System.out.println("i2+=d2 : "+i2);
		//특이케이스 long float 간에는 자동 형변환이된다.
		long l3 =1000000l;
		float f1= l3;
		//특이케이스 char=>int 형변환
		char ch =65;
		System.out.println("ch"+ch);
		int i4='A';
		System.out.println("i4:"+i4);
		int sum ='A'+10;
		System.out.println("sum: "+sum);
		
		byte b1= 1;
		byte b2 =10;
		byte b3 =(byte)(b1+b2);//11는 int 형 자료형임
		System.out.println("b3: "+b3);
	}
	public void forceCasting() {
		//double->float
		double d1= 9.0;
		float f1 = (float) d1;
		System.out.println("f1: "+f1);
		//double -> int
		double d2= 9.13;
		int i1 =(int) d2;
		System.out.println("i1: "+i1);//9 소수점 아래는 버린다.
		int i2= 10;
		double d3 = 5.89;
		int i3= i2+(int)d3;
		System.out.println("i3: "+i3);//15
		double d4 = 4.55;
		int A=(int)(d4+d3);//10
		System.out.println("A= "+A);
		int B=(int)d4+(int)d3;//10
		System.out.println("B="+B);//9
		//강제 형변환 간에 데이터 손실 
		int i5 = 253;
		byte b1=(byte) i5;
		System.out.println("b1 : "+b1);//-3 
		//int i5의 맨 뒤 1byte만 짤라오는 형식이다
	}
	
}
