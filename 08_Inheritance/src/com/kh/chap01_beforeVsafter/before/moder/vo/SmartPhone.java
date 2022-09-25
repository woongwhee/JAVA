package com.kh.chap01_beforeVsafter.before.moder.vo;

public class SmartPhone {
	private String brand;//브랜드명
	private String pCode;//상품코드
	private String pName;//상품명
	private int price;//상품가격
	private String mobileAgency;//통신사

	public SmartPhone() {
	}
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pName = pName;
		this.price = price;
		this.pCode = pCode;
		this.mobileAgency = mobileAgency;
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

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	public String getBrand() {return brand;}
	public String getpCode() {return pCode;}
	public String getpName() {return pName;}
	public int getPrice() {return price;}
	public String getMobileAgency() {return mobileAgency;}
}
