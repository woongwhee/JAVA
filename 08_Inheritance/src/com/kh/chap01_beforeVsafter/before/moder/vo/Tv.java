package com.kh.chap01_beforeVsafter.before.moder.vo;

public class Tv {
	private String brand;//브랜드
	private String pCode;//상품코드
	private String pName;//상품명
	private int price;//상품가격
	private int inch;//인치

	public Tv() {
	}
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pName = pName;
		this.price = price;
		this.pCode = pCode;
		this.inch=inch;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getBrand() {return brand;}
	public String getpCode() {return pCode;}
	public String getpName() {return pName;}
	public int getPrice() {return price;}
	public int getInch() {return inch;}

}
