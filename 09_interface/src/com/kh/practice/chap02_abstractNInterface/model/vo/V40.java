package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements Notepen{
	public V40(){
		super.setMaker("LG");
	}

	public String printInfomation() {
		return "V40은 " + super.getMaker() + "에서 만들어 졌고 제원은 다음과 같다. \n" + makeCall() + takeCall() + picture()
				+ charge() + touch() + "블루투스 펜 탑재 여부 : " + bluetoothPen();
	}

	@Override
	public String charge() {

		return "고속 충전, 고속 무선충전\n";
	}

	@Override
	public String makeCall() {
		//
		return "번호를 누르고 통화를 누름\n";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "전화 받기 버튼을 누름\n";
	}

	@Override
	public String picture() {

		return "1200, 1600만 트리플카메라\n";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식\n";
	}

	@Override
	public boolean bluetoothPen() {
		return false;
	}

}
