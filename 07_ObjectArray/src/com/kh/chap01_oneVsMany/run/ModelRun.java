package com.kh.chap01_oneVsMany.run;

import com.kh.chap01_oneVsMany.model.vo.Book;

public class ModelRun {
	public static void main(String[] args) {
		Book book1=new Book("노인과바다","어니스트헤밍웨이",8000,"민음사");
		System.out.println(book1.information());
		Book book2=new Book("죄와 벌 ","표도르 도스토예프스키 ",12000," 열린책들");
		System.out.println(book2.information());
		
	}
}
