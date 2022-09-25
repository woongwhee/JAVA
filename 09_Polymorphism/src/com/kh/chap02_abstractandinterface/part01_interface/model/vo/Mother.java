package com.kh.chap02_abstractandinterface.part01_interface.model.vo;

public class Mother extends Person {
	private String babyBirth;

	public Mother() {
	}

	public Mother(String name, String weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother ["+super.toString()+"babyBirth=" + babyBirth + "]";
	}
	@Override
	public void eat() {
		super.setWeight(super.getWeight()+"1키로 증가");
		super.setHealth(getHealth()+10);
	}
	@Override
	public void sleep() {
		super.setHealth(super.getHealth()+20);
		
	} 
}
