package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_CheckedException {
	private Scanner sc = new Scanner(System.in);
	/*
	 * checkedException은 반드시 예외처리를 해줘야 하는 예외들 즉 예측 불가한 곳에서 발생하기 때문에 미리 예외 처리 구문을 작성해
	 * 둬야됨. 주로 외부 객체와 어떤 입출력 하는 상황에서 발생
	 * 
	 */

	public void method1() throws IOException {
		try {
			method2();// Unhandled exception type IOException
		} catch (IOException e) {

		}
		// trow를 통에 떤진 예외는 호출한 메소드에서 처리해야된다.
	}

	public void method2() throws IOException {// 내부에서 해당 예외가 발생하면 호출한 메서드에게 그 예외를 던지겠다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아무 문자열 입력해 주세요 : ");
//		try {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			String str=br.readLine();
//			System.out.println("문자열의 길이 "+str.length());
			int num = Integer.parseInt(st.nextToken());
//		} catch (IOException e) {
//			System.out.println("예외발생");
//		}
	}
}
