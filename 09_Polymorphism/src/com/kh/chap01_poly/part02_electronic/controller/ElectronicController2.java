package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController2 {

	//다형성을 적용시킨 경우
	private Electronic[] elec=new Electronic[4];
	private int count=0;
	public void insert(Electronic ec,int index) {
		elec[index]=ec;
	}
	public void insert(Electronic ec) {
		if (count>=elec.length) {System.out.println("매대가 꽉찼습니다.");return;}
		elec[count]=ec;
		count++;
	}
	public Electronic select(int index) {
		return elec[index];
	}
	public int elecLength() {
		return elec.length;
	}
	//or 배열 자체를 오버로딩해서  반환하는 방법이 있다.
	public Electronic[] select() {
		return elec;
	}
	
	
	

}
