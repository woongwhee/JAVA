package com.kh.chap02_inherit.moder.vo;

public class Car extends Vehicle {
	private int tire;
	
	public Car(){}
	public Car(String name, double mileage, String kind,int tire) {
		super(name, mileage, kind);
		this.tire=tire;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public String infomation() {
		return super.information()+tire;
	}
	public void howToMove() {
		System.out.println("바퀴를 굴려서 움직인다.");
	}
}
