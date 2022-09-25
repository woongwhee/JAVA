package com.kh.chap03_char.run.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
//프로그램 -> 외부매체(파일)
	public void filesave() {
		// FileWriter : 파일로 데이터를 2byte단위로 출력 스트림을 연결.

		FileWriter fw = null;
		try {
			fw=new FileWriter("B_char.txt");
					
			String str="진웅휘 , 26, ";
			fw.write(str);
			fw.write('a');
			fw.write(' ');
			char [] cArr= {'1','2','3'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	public void fileRead() {
		FileReader fr=null;
		try {
			fr=new FileReader("b_char.txt");
			int value=0;
			while((value=fr.read())!=-1) {
				System.out.print((char)value);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{fr.close();}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
