package com.kh.chap05_Filed.model.vo;
//필드에서 사용가능한 접근제어자.
public class FiledTest2 {
	/*	+public => 어디서든 접근가능.
	 * 
	 *  #protected => 같은패키지,다른패키지에서의 "상속"구조인 클래스에서 접근가능
	 * 
	 *  ~default => 같은 패키지내에서만 접근가능.
	 *  
	 *  -private => 같은 클래스 내에서만 접근가능.
	 * 
	 * 	+#~- <= 클래스 다이어그램 표기법
	 * 
	 */
	public String pub= "public";
	protected String pro="protected";
	String def= "default";
	private String pri="private";
	
	
	
}
