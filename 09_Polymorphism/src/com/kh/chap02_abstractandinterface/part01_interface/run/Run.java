package com.kh.chap02_abstractandinterface.part01_interface.run;

import com.kh.chap02_abstractandinterface.part01_interface.model.vo.Baby;
import com.kh.chap02_abstractandinterface.part01_interface.model.vo.Mother;
import com.kh.chap02_abstractandinterface.part01_interface.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		//인터페이스 적용전
		Person p;
		Person mom=new Mother("정엄마","50",70,"출산");
		Person baby=new Baby("민애기","8",60);
		System.out.println(mom);
		System.out.println(baby.toString());
		mom.eat();
		mom.sleep();
		baby.eat();
		baby.sleep();
		System.out.println(baby.toString());
		System.out.println(mom);
	}
}
