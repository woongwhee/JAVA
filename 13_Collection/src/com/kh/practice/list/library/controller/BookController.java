package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList();

	public BookController() {
//		list.add(new Book("대화의 기술", "강보람", "인문", 17500)); 
//		list.add(new Book("암 정복기", "박신우", "의료", 21000));
//		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000)); 
//		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000)); 

	}

	public void insertBook(Book bk) {
		list.add(bk);
	}

	public ArrayList selectList() {
		return (ArrayList) list;
	}

	public ArrayList serchList(String keyword) {
		List<Book> sList = new ArrayList();
		for (Book book : list) {
			if (book.toString().contains(keyword)) {
				sList.add(book);
			}
		}
		return (ArrayList) sList;
	}

	public Book deleteBook(String title, String author) {
		Book delete = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title) && list.get(i).getAuthor().equals(author)) {
				delete = list.remove(i);
				break;
			}
		}
		return delete;
	}

	public void ascBook() {
//		if (list.isEmpty()) {
//			throw new RuntimeException("정렬할 도서가 없습니다.");}
//		list.sort(Comparator.naturalOrder());
		Collections.sort(list);
	}
}
