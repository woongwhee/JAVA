package com.kh.chap02_network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public void serverStart() {
		// 1) 포트번호설정.
		int port = 3000;
		ServerSocket server = null;

		try {
			// 2)서버 소켓 객체 생성
			server = new ServerSocket(port);
			while (true) {
				System.out.println("서버시작.....");
				
				// 3)클라이언트 정보를 저장.
				
				Socket client = server.accept();

				System.out.println("클라이언트 대기중");

				// 4, 5) 연결된 클라이언트와 입출력 스트림생성
				OutputStream os = client.getOutputStream();// 클라이언트'로' 값을 출력하는 스트
				InputStream in = client.getInputStream();// 클라이언트'로' 값을 입력하는스트림

				// 5,6 보조스트림으로 성능개선
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				// 클라이언트로부터 달된 값을 한줄단위로 읽어 들이기 위한 입력용 스트
				PrintWriter pw = new PrintWriter(os,true);// 대이터를 출력할때 print println 메소드를 가지고 있음

				// 7. 스트림을 통해 일고 쓰기

				while (true) {
					String message = br.readLine();
					
					if (message == null || "exit".equals(message)) {
						System.out.println("클라이언트 접속종료");
						break;
					} else {
						System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메세지 : " + message);
						pw.println("메세지 받기 성공");
						pw.flush();// 현재 스트림에 남아있는 메소드들을 강제로 내보내는 메소드.(close 메소드 호출되면 자동으로 flush 호출)

					}

				}
				// 8.통신 종료
				br.close();
				pw.close();
				client.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
