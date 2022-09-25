package com.kh.chap02_byte.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	// DAO(Data access object) :즉 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 입출력하는 클래스.
	// 프로그램 -->외부매체(파일)
	// 출력 : 프로그램내의 데이터를 파일로 내보내기(즉 파일에 기록, 저장 하겠다)
	// 입력 : 파일을 읽어와 프로그램의 데이터로 가저오겠다. HDD->Ram;
	public void fileSave() {
		// FileOutputStream :"파일"로 데이터를 1byte단위로 출력하는 스트림.

		FileOutputStream fout = null;// input스트림이나 output스트림은 멀티스레드 환경에서 접근할수있다
		// 때문에 new 연산자로 초기화하는게 아닌 일단 null로 초기화 한다.
		try {
			fout = new FileOutputStream("a_byte.txt");// 덮어씌우기
			// fout=new FileOutputStream("a_byte.txt",true);//이어쓰기
			/*
			 * true를 작성하게 되면 기존 해당 파일이 있을경우 이어서 작성한다. true를 추가하지 않은 생성자는 기존 해당파일 있을경우 덮어씌워짐
			 * 
			 */
			// 2.write()메소드를 사용해 데이터 출력
			// 1byte:-128~127 까지의 데이터

			fout.write(97);// apple
			fout.write(112);//
			fout.write(112);//
			fout.write(108);//
			fout.write(101);//
			fout.write('a');//char형으로 받을수있다.
			// 3.바이트 배열을 받을수잇따.
			byte[] b = { 102, 103, 104, 106, 106 };
			fout.write(b);
			byte[] c = { 102, 103, 104, 105, 106 };
			fout.write(c, 0, 3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

// 프로그램 --> 외부매체(파일)
// 출력 : 프로그램내의 데이터를 파일로 내보내기(즉, 파일에 저장(기록)하겠다).
	public void fileSave2() {

		// FileOutputStream : "파일"로 데이터를 1byte단위로 출력하는 스트림.

		FileOutputStream fout = null; // 변수선언 및 null 초기화.
		try {
			// 1. FileOutputStream 객체 생성=> 해당 파일과 직접 연결되는 통로(스트림)을 만들겠다.
			// 해당 파일이 존재하지 않으면, 해당 파일이 생성되면서 통로가 연결됨.
			// 존재하는 파일이라면 , 그냥 통로만 연결

			fout = new FileOutputStream("a_byte.txt"); // 덮어씌우기
			// fout = new FileOutputStream("a_byte.txt" , true); // 이어쓰기.
			// true를 작성하게되면 기존 해당파일이 있을경우 이어서작성한다.
			// true를 추가하지 않은 생성자는 기존에 해당파일 있을경우 덮어씌워짐.

			// 2. 연결 통로로 데이터 출력 : write()메소드 사용.
			// 1byte : -128 ~ 127까지의 숫자.
			fout.write(97); // a
			fout.write(112);// p
			fout.write(112);// p
			fout.write(108);// l
			fout.write(101);// e
			// fout.write('a');

			byte[] b = { 99, 100, 101 };
			fout.write(b);

			byte[] c = { 102, 103, 104, 105, 106 };
			fout.write(c, 0, 3);
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 어떤 예외 가 발생하든, 발생 안하든 반드시 실행할 구문을 작성하는 블럭.
			try {
				// 3. 스트림을 다 사용 했다면 반드시 자원을 반납해야한다.
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	//프로그램 <--외부매체(파일)
	//입력 :파일로부터 데이터를 가지고 오겠다.
	public void fileRead() {
		//file InputStream 객체생성 (통로를 열겠다.)
		FileInputStream fin=null;//
		
		try {
			//1.a_byte.txt와 프로그램을 연결하는 입력스트림을 열겠다.
			fin =new FileInputStream("a_byte.txt");//반드시 존재하는 파일로 제시
			
				
			System.out.println(fin.read());//한글자씩 읽어오는 메서드,//97이 출력됨
			//저장될떄는 자동으로 ascii 코드로 변환되서 알아서 저장되지만
			//읽어올때는 숫자로 변환되  97이 출력됨
			
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());//-1
//			System.out.println(fin.read());//-1
//			System.out.println(fin.read());//-1
//			System.out.println(fin.read());//-1
			//파일의 끝을 만나는 순간 fin.read() =>-1
			//while문으로 뽑아오기
			//마지막이 -1이니까 while(fin.read()!=1)아니냐?
			//왜냐면 fin read로 한번더 호출되기때문이다.
			//그래서 값을 value에 대입해 
			//이렇게 하면 몇개 안나옴 왜?
			// a p p l e c d e f g h
			//이런식으로 먼저끊음
			//이후 fin.read()=>a
			//fin.read()=>p
			//fin.read()=>p
			//fin.read()=>l
			//...
			//권장하는방법
			int value =0;
			while((value = fin.read())!=-1) {
				
			System.out.println((char)value);
			}
		}catch(FileNotFoundException e){//읽어올 파일이 있을수도 없을수도 있기떄문에 무조건 있어된다.
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//다쓴 스트림 자원 반납하기
//			fin.close();이렇게하면 IOE가남
			try {
				// 3. 스트림을 다 사용 했다면 반드시 자원을 반납해야한다.
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

