package com.kh.chap04_properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.model.vo.Snack;

public class Run1 {
//	옵션정보, 데이터베이스 연결정보, 국제화(다국어)정보를 기록하여 텍스트 파일로 활용
//	- 애플리케이션에서 주로 변경이 잦은 문자열을 저장하여 관리하기 때문에
//	유지보수를 편리하게 만들어 줌
//	- 키와 값이 ‘=‘기호로 연결되어 있는 텍스트 파일로 ISO 8859-1 문자셋으로 저장되고,
//	한글은 유니코드(Unicode)로 변환되어 저장
	//Properties : key value 모두 String 으로 제한되어있는 맵.
	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.put("나는","살아있다.");
//		prop.put("다이제",new Snack("초코맛",1500));
		System.out.println(prop);//둘다저장됨
		//키나 벨류값으로 객체가 오면 toString 을 이용해 문자열로 변환해버린다.
//		System.out.println(prop.get("다이제").getClass());//class com.kh.chap03_map.model.vo.Snack?? 아니네
		//1. String 으로 타입 강제하기
		prop.setProperty("다이제", "초코맛");
		//2. 값을가저오는건 getProberty(String key)를 사용 value값을 반환
		System.out.println(prop.getProperty("다이제"));
		try {
			prop.store(new FileOutputStream("testproperties.XML"), "처음에 들어갈 코멘트");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Snack cannot be cast to String 즉 다른 맵처럼 사용은 가능하지만 properties 타입으로 파일에 내보낼때 문제가 생긴다.
		
		
	}
}
