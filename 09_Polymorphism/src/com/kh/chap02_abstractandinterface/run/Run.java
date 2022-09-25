package com.kh.chap02_abstractandinterface.run;

import com.kh.chap02_abstractandinterface.model.vo.BasketBall;
import com.kh.chap02_abstractandinterface.model.vo.FootBall;
import com.kh.chap02_abstractandinterface.model.vo.Sport;

public class Run {
	public static void main(String[] args) {
		Sport[] s= new Sport[2];
		s[0]=new BasketBall();
		s[1]=new FootBall();
		for (Sport Sp:s) {
//			Sp.rule();
		}
		//Sport ab=new Sport();//Cannot instantiate the type Sport 추상클래스는 인스턴스 화 시킬 수 없다.
		//추상클래스는 미완성된 클래스이기 때문에 객체 생성이 안되는것.
		// 1. Sport ab 라는 변수가 stack영역에 생성된다.
		// 2. heap메모리에 공간을 할당해 new Sport()를 하는데 미완성 클래스이기때문에 안된다.
		
		//때문에 변수생성은 가능하다.
		Sport sp;
		/* 추상 클래스
		 * - 미완성된 클래스 abstract class
		 * - 객체 생성불가(단, 레퍼런스 변수로는 선언가능)
		 * - 추상메소드가 존재하는 순간 반드시 추상클래스로 정의
		 *   (일반 필드 + 일반 메소드 + [추상메소드 생략가능]) 	
		 * 하지만 추상메소드가 없어도 추상클래스로 만들수 있긴함.
		 * 언제 => 클래스가 아직 구체적이지 않은 덜구현된 상태일때(개념적)
		 * 	   =>현재 이클래스를 객체 생성이 불가능하게 끔 하고자할때(기술적)
		 * -다형성 적용가능
		 *
		 * 추상 메소드
		 * - 미완성된 메소드로 몸통부가 {}가 구현되 있지 않아 
		 * - 자식클래스에게 메소드 오버라이딩을 강제하는 메소드
		 *   => 오버라이딩 하지 않을 경우 에러 발생
		 *   => ★메소드 사용의 통일성확보★
		 *   =>  표준화된 틀을 제공할 목적.
		 *
		 */
		
	}
}
