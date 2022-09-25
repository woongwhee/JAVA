package com.kh.chap02_network.run;

import com.kh.chap02_network.tcp.Sever;
import com.kh.chap02_network.tcp.Sever2;
public class Run {
	public static void main(String[] args) {
		/*
		 *TCP(Treansmission controlprotocol)
		 *-서버 클라이언트간의 1:1소켓통신
		 *데이터를 교환하기에 앞서서 서버 클라이언트 연결되어있어야함(서버가먼저 실해되어 클라이언트의 요청을 대)
		 *-신뢰성 있는 데이터전잘가능.
		 *
		 * ServerScoket 
		 * - 서버에서 클라이언트의 요청을 하면 그 요청을 받을때까지 기다리는 클래스
		 * -사용법 : serversocket server =new severscket(Int protNumber)
		 * - 메소드 
		 *       Socket clinet = server.accept() 메소드를 통해 클라이언트의 연결을 기다리고 연결이 오면 socket객체로 변환.
		 * 
		 *  Socket
		 *  -클라이언트에서 서버에 요청을 하거나 서버내에서 클라이언트의 요청을 받았을때 사용하는 클래스
		 *  -사용방법 
		  *  메소드 
		 *  OutputStream out =client .getOutputStream()을통해 내보낼수잇는 아웃풋스트림객체를 생성
		 *  InputStream in =client .getinputStream()을통해 읽어올수있는 인풋스트림객체를 생성
		 *       
		 *       
		 *       Socket 연결순서
		 *       1)서버의 소켓 객체 생성
		 *       2) 클라이언트의 젒속 요청을 기다림
		 *       3)요청이 오면수락
		 *       4) 클라이언트 정보를 저장.
		 *       5) 클라이언트 정보를 통해 outputstream 생성
		 *       6) 클라이언트 정보를 통해서 inputStream 생성
		 *       7. 스트림을 통해 읽고쓰기
		 *       8. 통신종료
		 * -
		 */
//		Sever s= new Sever();
//		s.serverStart();
//		
		Sever2 s= new Sever2();
		s.serverStart();
		
	}

}
