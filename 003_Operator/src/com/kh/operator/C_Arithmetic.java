package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		int num1= 10;
		int num2=3;
		//System.out.println("num1+num2 ? "+num1+num2);num1+num2 ? 103
		System.out.println("num1+num2 ? "+(num1+num2));//13
		System.out.println("num1-num2 ? "+(num1-num2));//7
		System.out.println("num1*num2 ? "+num1*num2);//30
		System.out.println("num1/num2 ? "+num1/num2);//3
		System.out.println("num1%num2 ? "+num1%num2);//3
		System.out.println("num1/num2 ? "+((double)num1/num2));//3.333333
		//실수로 산술연산
		double a =35;//35.0
		double b= 10;//10.0
		System.out.println(a/b);
		System.out.println(a%b);
	}
	public void quiz() {
		int a = 5;
		int b =10;
		int c = (++a)+b;//16
		int d = c/a;//2
		int e = c%a;//4
		int f = e++;//4
		int g =(--b)+(d--);//11
		int h = 2;
		int i = (a++)+b/(--c/f)*(g-- - d)%(++e +h);
		//6+9/(15/4)*(11-1)%(6+2)
		// 6+ (9/3*10%8)
		//괄호값을 먼저 계산해서 정수값으로 만들어버린다
		//때문에 15/4는 3.75가 아니라 3으로 계산된다
		//a=7 b=9 c=15 d=1 e=6 f=4 g=10 h=2 i=12
		System.out.printf("%d,%d,%d,%d,%d,%d,%d,%d,%d",a,b,c,d,e,f,g,h,i);
	}
}
