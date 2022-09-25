package com.kh.chap02_inherit.moder.vo;

public class Airplane extends Vehicle {
	private int tire;
	private int wing;
	public Airplane(){}
	public Airplane(String name, double mileage, String kind,int tire,int wing) {
		super(name, mileage, kind);
		this.tire=tire;
		this.wing=wing;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	public String infomation() {
		return super.information()+" "+tire+" "+wing;
	}
	public void howToMove() {
		System.out.println("엔진을 태워 양력을 받아 움직인다.");
	}
}
