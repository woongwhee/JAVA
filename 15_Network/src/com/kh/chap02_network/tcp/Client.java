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

public class Client {
	/*
	 * 
	 *  클라이언트 tcp소켓 프로그래밍 순서
	 *  1) 서버의 ip 주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 셍성
	 *  2) 서버와의 입출력 스트림오픈
	 *  3)보조스트림을 통한 성능개선
	 *  4)스트림을 통해 읽고 쓰기
	 *  5)통신종료(스트림,소켓 닫기)
	 * 
	 */
	public void clientStart() {
		//192.168.120.5
		//1) 서버의 ip주소와 포트번호를 매게변수로 해서 클라이언트용 소켓객체생성
		
		int port =3000;
		String serverIP="192.168.20.5";
		Socket socket=null;
		String str=null;
		
		try {
			
			socket=new Socket(serverIP,port);
			if(socket !=null) {
				//2)서버와 입출력 스트림 오픈
				InputStream is=socket.getInputStream();
				OutputStream os=socket.getOutputStream();
				
				//3)보조스트림을 통해 성능개선.
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				PrintWriter pw =new PrintWriter(os,true);
				//4)스트림을 통해 읽고 쓰기
				Scanner sc=new Scanner(System.in);
				do{
					System.out.print("서버에 보낼 내용 : ");
					str=sc.nextLine();
					pw.println(str);
					pw.flush();
					if("exit".equals(str)||str==null) {
						System.out.println("접속종료!!");
						break;
						
					}

					String mesege=br.readLine();
					System.out.println("받은메세지 : "+mesege);
					
				}while(true); 
				br.close();
				pw.close();
				socket.close();
				
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
