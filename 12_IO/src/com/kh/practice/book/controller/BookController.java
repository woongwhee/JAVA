package com.kh.practice.book.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
//	- bd:BookDAO = new BookDAO() + makeFile() : void
//			+ fileSave(bArr:Book[]) : void
//			+ fileRead() : Book[]
	BookDAO bd = new BookDAO();

	public void makeFile() {
		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("book.txt"));) {
		} catch (FileNotFoundException e) {// 파일을 못찾았을시 파일을 생성
			System.out.println("파일을 생성합니다.");
			try (ObjectOutputStream ois =new ObjectOutputStream(new FileOutputStream("book.txt"))) {
			} catch (IOException i) {
				i.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	
	public void fileSave(Book[] bArr,int i) {
		bd.fileSave(bArr, i);
	}

	public Book[] fileRead() {
		return bd.fileRead();
	}
}
