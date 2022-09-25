package com.kh.chap01_beforeVsafter.after.moder.vo;

public class SmartPhone extends Product {
	private String mobileAgency;

	public SmartPhone() {
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency=mobileAgency;
	}
	public String info() {
		return super.info()+" "+mobileAgency;
	}
}
