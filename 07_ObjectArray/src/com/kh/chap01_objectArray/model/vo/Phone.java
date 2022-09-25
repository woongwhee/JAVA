package com.kh.chap01_objectArray.model.vo;

public class Phone {
	private String name;
	private String series;
	private String brand;
	private int price;

	public Phone() {
	}

	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.series = series;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {

		return price;
	}

	public String getSeries() {
		return series;
	}

	public String info() {
		return name + " " + series + " " + brand + " " + price;
	}

}
