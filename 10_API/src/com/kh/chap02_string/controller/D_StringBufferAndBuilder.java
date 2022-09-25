package com.kh.chap02_string.controller;

public class D_StringBufferAndBuilder {
	/*	String 은 불변 클래스
	 * 	StringBuffer와 String Builder 은 mutable(변하는)클래스
	 *  String 클래스는 문자열 연산이 빈번하게 일어나는 알고리즘에서 메모리이슈가있어
	 *  그것을 해결하기 위해 StringBuilder 와 StringBuffer클래스가 나옴
	 *  
	 *  두 클래슨느 기본적으로 동일한 메소드를 지닌다.
	 *  차이점은 동기화 유무
	 *  추후 배우게될  thread개념이 적용되어 잇음.
	 *  
	 *  StringBuffer은 멀티스레드 환경에서 유용
	 *  StringBuilder은 단일 스레드 환경에서 유용.
	 * 
	 */
	
		public void method() {
			String str= "Hellow";
			System.out.println("변경전 str주소값 : "+System.identityHashCode(str));
			str+="World"; 
			System.out.println("변경후 str주소값 : "+System.identityHashCode(str));
			StringBuffer sb=new StringBuffer("Hello");
			sb.append("World");
			System.out.println("변경전 sb주소값 : "+System.identityHashCode(sb));
			System.out.println(sb);
			System.out.println("변경후 sb주소값 : "+System.identityHashCode(sb));//주소값동일
			StringBuffer sb2=new StringBuffer("Hello");
			System.out.println("변경전 sb2주소값 : "+System.identityHashCode(sb2));//주소값다름
			
			//유용한 메서드들.
			//내가 원하는 인덱스의 문자를 없애주는 메서드
//			sb.delete(4,sb.length()-1);
//			sb.deleteCharAt(sb.length()-1);
			//sb의 길이를 반환하느 메서드 .length()
			System.out.println(sb);
			
			System.out.println("o의 마지막위치 : "+sb.lastIndexOf("o"));
			//StringBuilder.delete(int start,int end)
			//문자열의 start부터 end의 문자까지 삭제시키는 메서드
			
			sb.delete(0,sb.length());
			System.out.println(" ."+sb);
		}
		
		
		
}
