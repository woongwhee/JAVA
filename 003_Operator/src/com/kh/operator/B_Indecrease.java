package com.kh.operator;

public class B_Indecrease {
	public void method(){
		int a= 1;
		int b= 1;
		System.out.println(a++);
		System.out.println(++b);
		
	}
	public void method2() {
		//전위식
		int a = 10;
		int b= ++a;//	11
		System.out.printf("a : %d , b : %d\n",a,b);
		//후위식
		int c = 10;
		int d =c++;
		System.out.printf("c : %d , d : %d\n",c,d);
		
		System.out.println("====================");
		
		int num=20;
		System.out.println("현재 num?"+num);
		
		System.out.println("++num?"+(++num));//21
		System.out.println("num++?"+(num++));//21(22)
		System.out.println("--num?"+(--num));//21
		System.out.println("num--?"+(num--));//21(20)
		
		System.out.println("최종 num?"+num);
	}
	public void method3() {
		//후위식의 계산
		int num1 = 20;
		int result1= num1++*3;//60,21 result1 =20*3
		System.out.printf("num1 : %d, result1 : %d\n",num1,result1);
		//전위식의 계산
		int num2 = 20;
		int result2= ++num2*3;//63,21 result1 =21*3
		System.out.printf("num2 : %d, result2 : %d\n",num2,result2);
	
	}
	public void method4() {
		int a= 10;
		int b= 20;
		int c= 30;
		System.out.println(a++);//10(11)
		System.out.println((++a)+(b++));//32
		System.out.println((a++)+(--b)+(--c));//12(13)+20+29 =61 
		System.out.printf("a : %d b:%d c : %d",a,b,c);//a:13 b: 20 c : 29
		
		
		
	}
}
