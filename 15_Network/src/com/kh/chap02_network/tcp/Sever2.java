package com.kh.chap02_network.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever2 {
	public void serverStart() {
		int port = 2500;
		ServerSocket socket = null;

		try {
			socket = new ServerSocket(port);
			while (true) {
				System.out.println("서버 실행중...");

				Socket client = socket.accept();
				System.out.println("클라이언트 연결중...");
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
				while (true) {
					String mesege = br.readLine();
					if (mesege == null || "exit".equals(mesege)) {
						System.out.println("클라이언트 연결 종료");
						break;
					} else {
						System.out.println(client.getInetAddress().getHostAddress() + " : " + mesege);// getInetAddress??
																										// 뭔메소드지?
						pw.println("메세지 받았음");
						pw.flush();
					}

				}
				br.close();
				pw.close();
				client.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
