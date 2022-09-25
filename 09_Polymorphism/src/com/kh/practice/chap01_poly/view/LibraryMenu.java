package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	private LibraryController lc=new LibraryController();
	private Scanner sc=new Scanner(System.in);
	public void mainManu() {
		
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("나이 : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender=sc.nextLine().charAt(0);
		Member mem=new Member(name, age, gender);
		lc.insertMember(mem);
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int select=sc.nextInt();
			sc.nextLine();
			switch(select) {
			case 1:
				System.out.println(lc.myInfo());break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				
			}
		}
	}
	public void selectAll() {
		Book[] bList=lc.selectAll();
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i+"번도서 : "+bList[i]);
		}
	}
	public void  searchBook() {
		System.out.print("검색할 키워드 : ");
		String keyword=sc.nextLine();
		Book[] sList=lc.searchBook(keyword);
		if(sList[0]==null) {
			System.out.println("키워드와 일치하는 도서가 없습니다.");
		}
		for (int i = 0; i < sList.length; i++) {
			if(sList[i]==null) {
				return;
			}
			System.out.println(sList[i]);
		}
	}
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int select=sc.nextInt();
		sc.nextLine();
		int result=lc.rentBook(select);
		if(result==0) {
			System.out.println("성곡적으로 대여되었습니다.");
		}else if(result==1) {
			System.out.println("나이 제한으로 대여 불가능");
		}else {
			System.out.println("성공적으로 대여되었습니다. \n요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		}
	}
	
}
