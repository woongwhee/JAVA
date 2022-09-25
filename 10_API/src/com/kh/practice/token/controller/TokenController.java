package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {}
	public String afterToken(String str) {
		StringTokenizer st=new StringTokenizer(str," ");
		StringBuffer str2=new StringBuffer();
		while(st.hasMoreTokens()) {
			str2.append(st.nextToken());
		}
		return str2.toString();
	}
	public String firstCap(String input) {
//		String lower=input.toLowerCase();
//		char[] cArr=lower.toCharArray();
//		cArr[0]-=32;
//		return String.valueOf(cArr);
		String front=input.substring(0,1).toUpperCase();
		String rear=input.substring(1).toLowerCase();//substring 을 이용하면 짤라쓸수있다 string에서도
		return front+rear;
	}
	public int findChar2(String input,char one) {
		char[] cArr=input.toLowerCase().toCharArray();
		int count=0;
		for (int i = 0; i < cArr.length; i++) {
			if(cArr[i]==one) {
				count++;
			}
		}
		return count;
		
		
	}
	public int findChar(String input,char one) {
		String str=String.valueOf(one);
		int count=input.length()-input.replace(str,"").length();
		
		return count;
		
		
	}
}
