package com.kh.chap01_poly_basic.model.vo;
//다형성
/* 부모클래스의 자료형에 자식객체를 집어넣는거
 * 
 * 
 * 
 */


public class Parent {
	private int x;
	private int y;
	
	public Parent() {
//		printParent();
	}

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
//		printParent();
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void printParent() {
		System.out.println("부모클래스");
	}
	public void print() {
		System.out.println("부모클래스임");
	}
}
