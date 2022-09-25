package com.kh.chap05_Filed.model.vo;

public class Run2 {
	public static void main(String[] args) {
		FiledTest2 ft2 =new FiledTest2();
	    //public 접근제한자 어디서든접근가능
//		System.out.println(ft2.pub);
		
		//protected 접근제한자는 같은 패키지에서만 가능(상속구조일때도 가능)
//		System.out.println(ft2.pro);
		//default 접근제한자 같은패키지 내에서만 가능
		//ft2.def;
		//private 접근제한자. 같은 클래스에서만 가능
		//System.out.println(ft2.pri);
		System.out.println(FiledTest3.str);//클래스 변수에 접근할때는 클래스명을 같이 작성해줘야 사용가능!
		
		FiledTest3.method1();
		
	}
}
