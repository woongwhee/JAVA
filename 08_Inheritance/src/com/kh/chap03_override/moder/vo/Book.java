package com.kh.chap03_override.moder.vo;

import com.kh.practice.point.model.vo.Point;

public class Book {
	private String title;
	private String author;
	private int price;
	public Book() {
		
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
	public Book(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	/*오버라이딩
	 *  - 상속받고 있는 부모 클래스의 메소드를 자식클래스에서 재정의 하는것
	 *  - 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미(자식메소드가 우선권을 지님)
	 * 오버라이딩 성립 조건
	 *  - 부모메소드의 메소드명과 동일.
	 *  - 매개변수 자료형,개수 순서가 동일
	 *  - 부모메소드의 접근제한자와 같거나 공유범위가 커야함
	 *  ex) 부모의 접근제한자가 protected라고 한다면 자식은 public protected여야함
	 *  =>규약의 개념이 들어가있음(재정의 하려면 이정도 규칙은 지켜야 한다는것.)
	 * 
	 * 
	 */
	
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;}
		if (obj == null) {
			return false;}
		if (getClass() != obj.getClass()) {
			return false;}
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null) {
				return false;}
		} else if (!author.equals(other.author)) {
			return false;}
		if (price != other.price) {
			return false;}
		if (title == null) {
			if (other.title != null) {
				return false;}
		} else if (!title.equals(other.title)) {
			return false;}
		return true;
	}
	
	
}
