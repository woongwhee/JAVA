package com.kh.chap02_network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public void clientStart() {
		int port = 2500;
		String serverIP = "192.168.20.5";
		Socket socket = null;
		String str = null;

		try {
			socket = new Socket(serverIP, port);
			
			if (socket != null) {
//				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				InputStream is=socket.getInputStream();
				OutputStream os=socket.getOutputStream();
				
				//3)보조스트림을 통해 성능개선.
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				PrintWriter pw =new PrintWriter(os,true);
				Scanner sc = new Scanner(System.in);
				do {
					System.out.print("서버에 보낼 내용 : ");
					str = sc.nextLine();
					pw.println(str);
					pw.flush();// client에도 따로 반복문을 탈출해주자
					if ("exit".equals(str) || str == null) {
						System.out.println("클라이언트를 종료합니다.");
						break;
					}
					String mesege = br.readLine();// 서버에서 입력값 받기.
					System.out.println("서버에서 보낸 메세지 : " + mesege);
					System.out.println("??");
					
				} while (true);
				br.close();
				
				pw.close();
				socket.close();
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
