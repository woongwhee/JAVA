package com.kh.chap02_abstractandinterface.part01_interface.model.vo;

public class Baby extends Person implements Basic{
	public Baby() {
	}
	public Baby(String name, String weight, int health) {
		super(name, weight, health);
	}
	@Override
	public void eat() {
		super.setWeight(super.getWeight()+"0.5키로 증가");
		super.setHealth(getHealth()+5);
	}
	@Override
	public void sleep() {
		super.setHealth(super.getHealth()+10);
	} 
}



























