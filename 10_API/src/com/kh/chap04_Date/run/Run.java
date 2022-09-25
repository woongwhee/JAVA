package com.kh.chap04_Date.run;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Run {
	public static void main(String[] args) {
		/*
		 * java.util.Date클래스 -날짜와 시간에 대한 정보를 담을수 있는 클래스. - 자바 개발 초창기에 급하게 만든 완성도가 높지않은
		 * 클래스(다국적으로 쓰기도 적합하지 않음.)
		 * 
		 * 
		 * 
		 */

		Date today = new Date();
		// 기본생성자를 통해 Date객체를 생성->현재 날짜및 시간을 가지고 옴.

		System.out.println("기본생성자 : " + today);

		// 내가원하는 날짜
		// 방법 1. 매개변수 생성자를 통해 변경
		// Date date1=new Date(2022,7,18)//Deprecated:권장하지 않음.
		// 년도=> 전달한연도 +1900 월=>0부터시작 
		Date date1 = new Date(2022-1900, 07-1, 18);// The constructor Date(int, int, int) is deprecated
		System.out.println(date1);// 개같이 나옴
		
		// 입맞대로 출력 형식을 지정하는 방법.
		// java.text.SimpleDateFormat
		// 1. 형식을 지정하면서 SimpleDateFormat 객체생성
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		//2. sdf객체에서 재공하는 format메서드 호출시 Date객체전달. ->포맷에 지정된 String으로 변환됨.
		
		String formateDate=sdf.format(date1);
		System.out.println(formateDate);
		SimpleDateFormat sdf2 =new SimpleDateFormat("dd:hh:mm");
		String formateDate2=sdf2.format(date1);
		System.out.println(formateDate2);
		
		
	}
}
