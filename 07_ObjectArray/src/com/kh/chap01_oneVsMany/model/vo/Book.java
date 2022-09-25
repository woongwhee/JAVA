package com.kh.chap01_oneVsMany.model.vo;
public class Book {
	// 필드
	private String title;//작가
	private String author;//저자
	private int price;//가격
	private String publisher;//출판사

	// 생성자
	public Book() {
		
	}

	public Book(String title,  String author,int price,String publisher) {
		this.title = title;
		this.publisher = publisher;
		this.price=price;
		this.author = author;
	}

	// 메소드
	//setter
	public void setTile(String title) {this.title=title;}
	public void setAuthor(String author) {this.author=author;}
	public void setPrice(int price) {this.price=price;}
	public void setPublisher(String publisher) {this.publisher=publisher;};
	//getter
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	public int getPrice() {return price;}
	public String getPublisher() {return publisher;}
	//info
	public String information() {
		return title+" "+author+" "+price+" "+publisher;
	}
//	public void information() {
//		System.out.println("제목 : " + title);
//		System.out.println("출판사 : " + publisher);
//		System.out.println("작가 : " + author);
//		System.out.println("가격 : " + price);
//		
//	}
}
