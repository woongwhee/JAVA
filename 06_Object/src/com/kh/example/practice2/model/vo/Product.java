package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String band;
	
	public Product(){};
	
	public void setpName(String pName) {//이경우 'p'는 대문자가 아닌 소문자.
		this.pName=pName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBand(String band) {
		this.band=band;
	}
	
	public String getPName() {
		return pName;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public String band() {
		return band;
	}
	
	
	public void information() {
		System.out.println("pName : "+pName);
		System.out.println("price : "+price);
		System.out.println("band : "+band);
	}
}
