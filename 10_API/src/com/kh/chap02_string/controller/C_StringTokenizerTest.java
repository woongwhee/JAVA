package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	public void method1() {
		String str="Java,Oracle,JDBC,HTML,CSS,JavaScript";
		String[] arr=str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=====");
		//분리된 각각의 문자의 
		StringTokenizer stn=new StringTokenizer(str,",");
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());토큰이 없으면 에러남 
				
	}
}
