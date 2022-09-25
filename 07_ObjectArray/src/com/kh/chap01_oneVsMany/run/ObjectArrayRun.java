package com.kh.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsMany.model.vo.Book;

public class ObjectArrayRun {
	public static void main(String[] args) {
		Book[] library=new Book[3];
		Scanner sc= new Scanner(System.in);
		
		for (int i = 0; i < library.length; i++) {
			System.out.print("책 제목 : ");
			String title=sc.nextLine();
			
			System.out.print("작가 : ");
			String author=sc.nextLine();
			
			System.out.print("가격 : ");
			int price=sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher=sc.nextLine();
			library[i]=new Book(title, author, price, publisher);
			
		}
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i].information());
			
		}
		//사용자에게 검색할 도서 제목을 입력받아.
		// 각 전체 도서들의 제목과 일일히 비교하여 일치하는 도서의 가격을 알려줌.
		//만약일치하는 도서를 찾지 못한경우 "검색된도서가없습니다."
		//일치하는 도서를 발겨하면 도서의 번호도 함계출력.
		//출력예시
		//xx책의 가격 : xxxx원,위치 :x번째;
		System.out.print("검색할 도서를 입력하세요: ");
		String serch=sc.nextLine();
		boolean isFind=false;
		for (int i = 0; i < library.length; i++) {
			if(library[i].getTitle().equals(serch)) {
				System.out.printf("%s책의 가격 : %d원,위치 %d번째\n",serch,library[i].getPrice(),i);
				isFind=true;
			}
		}
		if(!isFind) {
			System.out.println("검색된도서가 없습니다.");
		}
	}
}
