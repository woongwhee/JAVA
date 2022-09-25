package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private BookController bc = new BookController();

	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("1. 새  도서 추가");
			System.out.println("2.  도서 전체 조회");
			System.out.println("3.  도서 검색 조회 ");
			System.out.println("4.  도서 삭제 ");
			System.out.println("5.  도서명 오름차순 정렬");
			System.out.println("9.  종료 ");
			System.out.print("메뉴 번호 선택 :");
			int select = sc.nextInt();
			sc.nextLine();
			switch (select) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				;
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}

	public void insertBook() {
		System.out.println("=====새 도서 추가=====");
		System.out.println("책 정보를 입력해 주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1.인문 / 2. 과학 / 3. 외국어 / 4. 기타 : ");
		int select = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		String category;
		switch (select) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "과학";
			break;
		case 3:
			category = "외국어";
			break;
		default:
			category = "기타";
			break;
		}
		bc.insertBook(new Book(title, author, category, price));
	}

	public void selectList() {
		ArrayList<Book> list = bc.selectList();
		if (list.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			return;
		}
		System.out.println("=====도서 전체 조회 =====");
		for (Book book : list) {
			System.out.println(book);
		}
	}

	public void searchBook() {
		System.out.println("=====도서 검색=====");
		System.out.print("검색할 키워드 ");
		String keyword = sc.nextLine();
		ArrayList<Book> list = bc.serchList(keyword);
		if (list.isEmpty()) {
			System.out.println("검색할 도서가 없습니다.");
		} else {

			for (Book book : list) {
				System.out.println(book);
			}
		}
	}

	public void deleteBook() {
		System.out.println("=====도서 삭제=====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		Book bk = bc.deleteBook(title, author);
		if (bk != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}

	public void ascBook() {
		try {
			bc.ascBook();
			System.out.println("정렬에 성공했습니다.");
		}catch(NullPointerException e) {
			e.printStackTrace();
		} 
		catch (RuntimeException e) {
			System.out.println("정렬에 실패했습니다. 정렬할 도서가 없습니다.");
		}
	}

}
