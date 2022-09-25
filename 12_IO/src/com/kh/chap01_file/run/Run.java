package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		try {
			//1.별도의 경로 지정을 하진 않고 파일명(test.txt)만 제시해서 생성할수있는 메소드.
			File file1 = new File("test.txt");
			file1.createNewFile();
			//2.경로와 파일명을 함께 제시해서 file을 생성할수있는 방법.
			File file2=new File("C:\\test\\test.txt");//이스케이프 문자로 \를 두개씩 작성해줘야됨
			file2.createNewFile();
			//3. 폴더를 생성하고 나서 그안에 파일을 생성하는 방법
			File bbbFolder= new File("C:\\bbb");;
			bbbFolder.mkdir();//makeDirectory의 약자
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 프로그램 상의 데이터를 외부매체로 출력하거나 입력장치로 받는 과정에 받느시
		 * 외부매체와의 ㅌ농로를 만들어야한다=>스트림
		 * 
		 * 스트림 특징:
		 * -단방향 입력이면 입력 출력이면 출력 입력 출력용 스트림이 따로 존재한다.
		 * 	즉 동시에 입출력을 하자고 한다면 하나의 스트림으로는 불가능.
		 * 시간지연문제가 발생할수있다.
		 * 
		 * 
		 * 스트림 구문
		 * -통로의스트림
		 *  	바이트스트림 : 1byte짜리가 이동할수있을정도의 사이즈 ->입력/출력
		 *      문자스트리 ㅁ 2byte정도가 이동할수있는 사이즈 =>입력writer/출력reader
		 *      
		 * -외부매체와의 직접적인 연결 여부:
		 * 		기반스트림 :외부매체와 직접적으로 연결되는 통로
		 * 		보조스트림 :기반스트림만으로 부족한 성능을 향상시켜주는 용도의 스트림
		 * 					외부매체와 직접적으로 연결 되지않음 단독사용할수없다
		 * (속도향상 , 자료형에 맞춰 변환한다거나 객체단위로 입출력하게 도와준다거나,등등)
		 * 단보조스트림은 단독으로 사용불가능함 반드시 외부매체와 직접적으로 연결되는 기반스트림이 필수.
		 * 
		 * 	
		 * 
		 */
	}
}
