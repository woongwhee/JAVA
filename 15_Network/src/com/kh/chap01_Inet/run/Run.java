package com.kh.chap01_Inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {
	public static void main(String[] args) {
		/* 네트워크
		 * - 여러대의 컴퓨터들이 연결되어있는 통신망 같은 것들 -> 네트워크를 통해서 데이터 송, 수신이 가능.
		 *
		 *네트워크의 목적
		 *- 여러개의 통신기기(컴퓨터 , 핸드폰 등)들을 연결하여 데이터를 손쉽게 주고받기 위함.
		 *
		 *자바에서 네트워크 관련 지원하는 클래스
		 * java.net클래스 안에 존재
		 * 
		 * 서버와 클라이언트
		 * 
		 * 서버: 클라이언트에게 서비스를 제공해주는 프로그램(클라이언트의 요청을 처리해서 응답해준다.)
		 * 클라이언트 : 서비스를 제공받는 고객
		 * 단 서버에 요청을 하기 위해서는 요청하고자하는 서버의 ip 주소 포트 번호를 알고 있어야 한다....
		 * IP 주소와 Port 번호
		 * 
		 *IP 주소 : 네트워크상에서 통신기기를 구별하기위한 고유주소
		 
		 *ex) 193.168.10.96
		 *
		 *Port 번호 : 서비스 구분번호	
		 *					잘 알려진포트 번호의 경우 생략 가능
		 *					0~1000 은 잘알려진 포트번호(well known port Number) 이므로 사용하지 않는다.
		 *
		 *
		 *
		 */
		//InetAddress: 네트워크 정보를 확인할수 있는 클래스
		//로그기록할 때와 관리자 페이지 접근권한을 설정할때 사용
		try {
			InetAddress localhost = InetAddress.getLocalHost();//내 pc에 대한 정보를 반환하는 메소
			System.out.println(localhost);//jinui-MacBook-Pro.local/218.38.137.28
			System.out.println("내 pc명은 "+ localhost.getHostName());//jinui-MacBook-Pro.local/192.168.120.5?? 왜다르지??
			System.out.println("내 ip주소는 "+ localhost.getHostAddress());
			
			InetAddress googleHost =InetAddress.getByName("www.google.com");//도메인 명에서 해당 호스트에 대한 정보를 반
			
			System.out.println("구글의 서버명 : "+googleHost.getHostName());// www.google.com
			System.out.println("구글의 ip주소명 : "+googleHost.getHostAddress());// 142.250.196.100
			InetAddress[] naverhost=InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : naverhost) {
				System.out.println("네이버 서버명 "+ i.getHostName());
				System.out.println("네이버 ip주소명 "+ i.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* 현재 구동중인 서버가 있으면 클라이언트는 그 서버로 요청을 보낼수 있게됨.=>응답결과 반환
		 * -요청과 응답에 의해서 프로그램은 돌아간다.(통신한다 라고 표현)
		 * - 웹에서는 통신방식 http프로토콜 통신.
		 * 
		 * 자바만을 가지고 서버와 클라이언트간 통신실습
		 * 이때 데이터를 입출력하고자 한다면, 서버와 클라이언트간에 스트림이 필요함
		 * 
		 * 소켓 : 프로세스간 통신을 담당하는것(스트림을 열기위한문)
		 * TCP방식 : 데이터 전송속도가 느리다 데이터가 정확하고 안정적으로 전송이 가능하다.
		 * 신뢰성이 요구되는 프로그램에서 사용되는 방식이다 예를 들어 http,email

		 *UDP방식 : 데이터 전송속도가 빠르다 신뢰성 없는 데이터가 전달될수 있음.
		 *				(데이터를 빠른속도로 전소하고자 하는 프로그램에서 사용되는 방식이다 예를들어 실시간 동영상 서비스)
		 *
		 * 
		 */
		
		
		
	} 

}
