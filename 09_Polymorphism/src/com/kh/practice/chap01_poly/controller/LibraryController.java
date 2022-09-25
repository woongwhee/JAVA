package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() {
		return mem;
	}

	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keyword) {
		Book[] sList = new Book[5];
		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			boolean isTrue = bList[i].getTitle().contains(keyword) || bList[i].getAuthor().contains(keyword)
					|| bList[i].getPublisher().contains(keyword);
			if (isTrue) {
				sList[count++] = bList[i];
			}
		}
		return sList;
	}

	public int rentBook(int index) {
		int result = 0;
//		if (bList[index] instanceof AniBook && 
//				mem.getAge() < ((AniBook) bList[index]).getAccessAge()) {
//			result = 1;
//
//		} else if (bList[index] instanceof CookBook && 
//				((CookBook) bList[index]).isCoupon()) {
//			result = 2;
//			mem.setCouponCount(mem.getCouponCount() + 1);
//		}
// Book의 인스턴스가 AniBook이면서 사용자가 성인인경우 위에 코드일때 인스턴스가 CookBook인지 여부를 한번 더 검사하게 되서 살짝 비효율적이다.
		if (bList[index] instanceof AniBook) {
			if (mem.getAge() < ((AniBook) bList[index]).getAccessAge()) {
				result = 1;

			}
		} else {
			if (((CookBook) bList[index]).isCoupon()) {
				result = 2;
				mem.setCouponCount(mem.getCouponCount() + 1);
			}
		}
		return result;
	}
}
