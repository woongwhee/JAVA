package com.kh.chap02_abstractandinterface.model.vo;

public class BasketBall extends Sport {
	@Override
	public void rule() {
		System.out.println("농구는 손으로 공을 잡아서 골대에 넣어야 한다.");
	}
}
