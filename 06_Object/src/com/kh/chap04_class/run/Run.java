package com.kh.chap04_class.run;

import com.kh.chap04_class.model.vo.Person;

public class Run {
		
		
	public static void main(String[] args) {
		Person ps=new Person();
		//System.out.println(ps.info2());
		//이렇게 출력하면 null 값으로 초기화 되어있다.
		//인스턴스가 생성되었다는건 일정한 크기만큼의 공간이 heap메모리에 할당이 되기때문에 필드가 초기화 되어있지않더라도 기본값으로 초기화 해준다? 
		ps.setAge(20);
		ps.setEmail("홍길동@gmail.com");
		ps.setGender('남');
		ps.setId("acbcacba");
		ps.setName("홍길동");
		ps.setPwd("11223344");
		System.out.println(ps.info());
		System.out.println(ps.info2());
		
		
	}
	
}
