package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book implements Serializable{//외부 매체에 보내는데 필요한 인터페이스
	private String title;
	private String author;
	private int price;
	private Calendar date ;
	private double discount;
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
	public Book() {}
	public Book(String title,String author,int price,Calendar date,double discount) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.date=date;
		this.discount=discount;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return title+"\t"+author+"\t"+price+"\t"+sdf.format(date.getTime())+"\t"+discount;
	}
	
}
