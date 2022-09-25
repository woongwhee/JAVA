package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book bk1=new Book("호밀밭의 파수꾼","민음사","J.D 샐린저",8000,0.5);
		Book bk2=new Book("노인과 바다","민음사","어니스트 헤밍웨이");
		bk1.information();
		bk2.information();
	}
}
