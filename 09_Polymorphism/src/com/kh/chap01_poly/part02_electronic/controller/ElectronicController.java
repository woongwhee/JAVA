package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController {
	private Desktop desk;
	private NoteBook note;
	private Tablet tap;
	public ElectronicController() {}
	public ElectronicController(Desktop desk, NoteBook note, Tablet tap) {
		this.desk = desk;
		this.note = note;
		this.tap = tap;
	}
	public void insert(Electronic ec) {
		if(ec instanceof Desktop) {
			desk=(Desktop)ec;
		}else if(ec instanceof NoteBook) {
			note=(NoteBook)ec;
		}else if(ec instanceof Tablet) {
			tap=(Tablet)ec;//다운캐스팅은 명시적으로 해줘야된다?
		}else {
			System.out.println("잘못된값");
		}
	}

//	
//	public void insert(Desktop dt) {
//		desk = dt;
//	}
//
//	public void insert(NoteBook nt) {
//		note = nt;
//	}
//
//	public void insert(Tablet tb) {
//		tap = tb;
//	}

	public Desktop selectDesktop() {
		return desk;
	}

	public NoteBook selectNoteBook() {
		return note;
	}

	public Tablet selectTablet() {
		return tap;
	}
}
