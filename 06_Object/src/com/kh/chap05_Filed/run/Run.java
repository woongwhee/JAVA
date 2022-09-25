package com.kh.chap05_Filed.run;

import com.kh.chap05_Filed.model.vo.FiledTest1;
import com.kh.chap05_Filed.model.vo.FiledTest2;
import com.kh.chap05_Filed.model.vo.FiledTest3;

public class Run {
	public static void main(String[] args) {
		//FiledTest1.classVariablePrint();
		//System.out.println(FiledTest1.classVariable);스테틱은 객체를 생성하지 않아도 접근가능하다.
		FiledTest1 ft = new FiledTest1();
		//		ft.method1(0);
		FiledTest2 ft2 =new FiledTest2();
	    //public 접근제한자
		System.out.println(ft2.pub);
//		System.out.println(ft2.pri);
		FiledTest3.method1();
		System.out.println(FiledTest3.NUM);
		System.out.println(FiledTest3.str);
		
		FiledTest3.str="스태틱값 변경후";//스태틱 키워드가 있으면 이클립스에선 기울어저 있음
		System.out.println(FiledTest3.str);
		//FiledTest3.NUM=300; 상수는 변경이 안된다.
		
	}
}
