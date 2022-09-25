package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	public void method1() {
		String str="Hellow World";
		//1. 문자열의 전달받은 인덱스의 문자로 리턴
		char ch=str.charAt(0);
		System.out.println(ch);
		//2. 문자열 concat 문자열과 전달된 문자열 하나를 합처서 return;
		String str2="!!";
		String str3=str.concat(str2);
		System.out.println(str3);
		//3. 문자열의 길이 length();
		System.out.println("str1의 길이는 ?"+str.length());
		//4.문자열.substring(int beginIndex),문자열.subStirng(int beginIndex,int endIndex);
		// 문자열을 위치부터 끝가지추출
		System.out.println(str.substring(7));
		System.out.println(str.substring(0,5));
		//5.문자열.replace(char od,char new) :string;
		//문자열의 old문자를 new 문자로 변환한 문자열을 리턴.
		String str4=str3.replace('!','?');
		System.out.println(str4);
		//6.문자열.trim.()
		//=>문자열의 앞뒤 공백을 제거한 문자열 리턴
		str4=" Java Java  ";
		System.out.println("trim"+str4.trim());
		//메소드에 이것도 가능
		System.out.println("trim"+" Java Java  ".trim());
		
		//7. toUpperCase() toLowerCase()
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		//8. toCharArray;문자배열로
		char[] cArr=str2.toCharArray();
		//9.valueof(char[] data)
		//char[]에 담긴 문자들을 문자열로
		System.out.println(str4.valueOf(cArr));
	}
	
}
