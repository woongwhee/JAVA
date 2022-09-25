package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	//bufferedreader/bufferdewriter
	
	public void fileSava() {
		//1.기반스트림 객체를 먼저생성
		//보조스트림도 REader/Writer ,Input Stream/OuPutteram
		
		BufferedWriter bw=null;
		//권장하지 않는방법
//		try {
//			bw=new BufferedWriter(new FileWriter("C_Buffer.txt"));
//			bw.write("안녕하쇼");
//			bw.newLine();//개행을 넣어주는 메소드
//			bw.write("안녕하쇼쇼\n");
//			bw.write("안녕하쇼쇼\n");
//		}catch(IOException e) {e.printStackTrace();}finally {
//			try {
//				bw.close();
//			}catch(IOException e){
//				e.printStackTrace();
//			}
//		}
//		
		//try with resource 구문(jdk7버전 이상부터 사용가능)
		/*
		 * [표현법]
		 * try(스트림 객체 생성;){
		 *예외가 발생할 구문
		 * }catch(예외클래스명){
		 * 예외가 발생할때 실행할 구문
		 * }
		 * 스트림 객체를 try 안에 넣어버리면 ,스트림 객체 생성 이후 해당블록의 구문이 실행 완료되면 알아서 반납이 된다.
		 * 
		 * 
		 */
		try (BufferedWriter bw2=new BufferedWriter(new FileWriter("c_Buffer.txt"))){
			bw2.write("안녕하소");
			bw2.newLine();
			bw2.write("반갑네\n");
			bw2.write("저리좀가세요");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(BufferedReader br=new BufferedReader(new FileReader("c_Buffer.txt"))){
//			System.out.println(br.readLine()); 
//			System.out.println(br.readLine()); 
//			System.out.println(br.readLine()); 
//			System.out.println(br.readLine()); //null
//			
			String str= null;
			while((str=br.readLine())!=null) {//readLine()의 빈값은 null로 초기화됨
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
