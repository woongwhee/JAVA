package com.kh.chap01_beforeVsafter.after.moder.vo;

public class Product {
	/* tv 스마트폰 pc 3클래스 모두 공통적으로 기술했던 요소들만 추출해서 단 한번 정의해둔 클래스
	 * "부모클래스"
	 * 
	 * 
	 * 
	 */
	
	
	
	private String brand;//브랜드
	private String pCode;//상품코드
	private String pName;//상품명
	private int price;//상품가격
	public Product() {}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pName = pName;
		this.price = price;
		this.pCode = pCode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String info() {
		return brand+" "+pCode+" "+pName+" "+price;
	}
}
