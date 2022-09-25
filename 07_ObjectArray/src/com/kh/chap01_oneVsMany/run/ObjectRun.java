package com.kh.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsMany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
//		Book book1 = new Book("노인과바다", "어니스트헤밍웨이", 8000, "민음사");
//		System.out.println(book1.information());
//		
//		Book book2 = new Book("죄와 벌 ", "표도르 도스토예프스키 ", 12000, " 열린책들");
//		System.out.println(book2.information());
//		//3. 사용자가 입력한 값들로 객체 생성.
//		
//		
//		
//		Book book3=new Book(title, author, price, publisher);
//		System.out.println(book3.information());
//		
		Book book1=null;
		Book book2=null;
		Book book3=null;
		Scanner sc=new Scanner(System.in);
		for(int i = 0;i<3;i++) {
			System.out.print("책 제목 : ");
			String title=sc.nextLine();
			
			System.out.print("작가 : ");
			String author=sc.nextLine();
			
			System.out.print("가격 : ");
			int price=sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher=sc.nextLine();
			if(i==0) {
				book1=new Book(title, author, price, publisher);
			}else if (i==1) {
				book2=new Book(title, author, price, publisher);
				
			}else {
				book3=new Book(title, author, price, publisher);				
			}
		}
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
	}

}
