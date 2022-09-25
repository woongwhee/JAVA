package com.kh.practice.book.view;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;//null;

	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();

	}

	public void mainMenu() {
		while (true) {
			System.out.println("1. 도서 추가 저장  \n2. 저장 도서 출력\n9. 프로그램 종료\n ");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			if (select == 1) {
				fileSave();
			} else if (select == 2) {
				fileRead();
			} else if (select == 9) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			}
		}
	}

	public void fileSave() {
		int i=0;
		for (i = 0; i < bArr.length; i++) {
			if(bArr[i]==null) {break;}
			if(bArr[bArr.length-1]!=null) {
				Book[]temp=new Book[bArr.length+10];
				for (int j = 0; j < temp.length; j++) {
					temp[j]=bArr[j];
				}
				bArr=temp;
			}
		}
		System.out.print("도서 명 :");
		String title=sc.nextLine();
		System.out.print("저자 명 :");
		String author=sc.nextLine();
		System.out.print("도서 가격 : ");
		int price=sc.nextInt();
		sc.nextLine();
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String arr[]=sc.nextLine().split("-");
		System.out.print("할인율 : ");
		double discount=sc.nextDouble();
		int arr2[]=new int[3];
		for (int j = 0; j < arr.length; j++) {
			arr2[j]=Integer.parseInt(arr[i]);
		}
		Calendar date=new GregorianCalendar(arr2[0],arr2[1]-1,arr2[2]);
		bArr[i]=new Book(title, author, price, date, discount);
		bc.fileSave(bArr,i);	

	}

	public void fileRead() {
		for (int i = 0; i < bArr.length; i++) {
			if(bArr[i]==null) {break;}
			System.out.println(bArr[i]);
		}
	}
//			+ mainMenu() : void
//			+ fileSave() : void
//			+ fileRead() : void
}
