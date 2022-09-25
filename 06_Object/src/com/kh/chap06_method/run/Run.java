package com.kh.chap06_method.run;
import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class Run {
	public static void main(String[] args) {
		MethodTest1 mt=new MethodTest1();
//		mt.method1();
//		System.out.println(mt.method2());
//		mt.method3(100,100);
//		System.out.println(mt.method4(100,200));
		System.out.println(MethodTest2.method1(1,2,'+'));
		
		
		
	}
	
}
