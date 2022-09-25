package com.kh.chap01_beforeVsafter.before.moder.vo;

public class Desktop {
	private String brand;// 브랜드명
	private String pCode;// 상품코드
	private String pName;// 상품명
	private int price;// 상품가격
	private boolean allInOne;// 일체여부
	// 이렇게 클래스별로 겹치는 사항이 있지만 복사 붙여넣기를 하였을때
	// 코드의 유지보수성이 떨어진다.

	public Desktop() {
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pName = pName;
		this.price = price;
		this.pCode = pCode;
		this.allInOne = allInOne;
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

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public String getBrand() {
		return brand;
	}

	public String getpCode() {
		return pCode;
	}

	public String getpName() {
		return pName;
	}

	public int getPrice() {
		return price;
	}

	public boolean getAllInOne() {
		return allInOne;
	}

}
