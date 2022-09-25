package com.kh.chap03_wapper.run;

public class Run {
	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * =>기본자료형을 객체로 포장해준느 클래스들을 래퍼클래스라고함.
		 * 
		 * 기본자료형 <-->Wrapper클래스
		 * boolean		Boolean
		 * char			Character
		 * byte			Byte;
		 * short		Short;
		 * int			Integer
		 * long			Long
		 * float		Float
		 * double		Double
		 * 
		 * 
		 */
		int num1= 10;
		int num2=15;
		//일반자료형에 객체 자료형의 메소드를 활용학 싶을때 wrapper클래스로 변환하여사용한다.
		//자동형변환이 일어남
		//기본자료형 ->Wrapper자료형으로 Boxing됨.
		Integer i1=num1;
		Integer i2=num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());//값이나옴
		System.out.println(i1.compareTo(i2));//두값을 비교해서 앞이 작으면 -1 크면 1 같으면0을 리턴;
		//Wrapper자료형->기본자료형 으로(UnBoxing).
		int num3=i1;
		int num4=i2;
		
		//기본자료형 ==>String간의 변환 파싱한다고 표현
		String str="1";
		String str2="1.2";
		String strBl="true";
		int num5=Integer.parseInt(str);
		double dNum1=Double.parseDouble(str2);
		boolean b=Boolean.parseBoolean(strBl);
		System.out.println(b);
		//String =>기본자료형 간의 변환
		//String.valueof(변환할 기본자료형값):String 변환된다.
		String str3=String.valueOf(num1);
		String strD=String.valueOf(dNum1);
		System.out.println(str3);
		System.out.println(strD);
		
		
	}
}
