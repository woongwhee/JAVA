package com.kh.chap01_poly_basic.model.vo;

public class Child2 extends Parent{
	private int n;
	public Child2() {}
	public Child2(int x, int y , int z) {
		super(x,y);
		this.n=n;
	}
	public void setN(int n) {
		this.n=n;
	}
	public int getN() {
		return n;
	}
	public void printChild2() {
		System.out.println("자식클래스 2");
	}
	@Override
	public void printParent() {
		System.out.println("부모클래스를 상속받은 자식클래스 2");
	}
	@Override
	public void print(){
		System.out.println("자식클래스2임");
	}
	
}