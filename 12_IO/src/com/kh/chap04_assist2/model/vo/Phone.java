package com.kh.chap04_assist2.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {
	private String name;
	private int price;
	public Phone() {
		
	}
	public Phone(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getprice() {
		return price;
	}
	public void SetPrice(int price) {
		this.price=price;
	}
	@Override
	public String toString() {
		return "Name : "+name+"Price : "+price;
	}
}
