package com.kh.chap02_abstractandinterface.model.vo;

public abstract class Sport {
	private int people;
	
	public Sport() {}
	public Sport(int people) {this.people=people;}
	
	public void setPeople(int people) {
		this.people=people;
		
	}
	public int getPeople() {
		return people;
	}
	@Override
	public String toString() {
		return "people : "+people;
	}
	public abstract void rule();
	
	/* 추상메서드 -> 몸통부가 존재하지않은 미완성메서드
	 * 몸통북 ㅏ없는 미완성 메소드를 정의 하고자 하면 abstract 예약어를 사용해야 한다.
	 * 미완성 메소드가 하나라도 포함되는 순간 해당클래스는 미완성 클래스 가 되어버린다,
	 * 클래스 명 앞의 예약어에 abstract를 꼭 적어줘야 한다.
	 */
	
}
