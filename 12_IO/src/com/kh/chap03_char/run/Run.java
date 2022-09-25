package com.kh.chap03_char.run;

import com.kh.chap03_char.run.model.dao.FileCharDao;

public class Run {
	public static void main(String[] args) {
		FileCharDao fcd= new FileCharDao();
		fcd.fileRead();
	}
}
