package com.kh.chap04_assist2.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist2.model.vo.Phone;

public class ObjectDao {
	public void fileSave(String fileName) {
		Phone ph =new Phone( "아이폰",1_500_000);;
		//객체단위를 파일에 출력하고자 할떄 사용하는 스트림
		//FileOutStream : 파일에 데이터를 출력하는 기반 스트림.
		//ObjectOutputStream :객체단위로 출력할 수 있도록 도와주는 보조스트림.
		//NotSerializableException
		//Phone클래스에 Serializable인터페이스를 불러오면된다
		//저장된값을 열어보면 이상하게 써있음 
		//ы sr $com.kh.chap04_assist2.model.vo.Phone꾧?_n? I priceL namet Ljava/lang/String;xp ?t 	?꾩씠??
		//객체단위로 기록되어있으므로 깨저보인다.
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
			oos.writeObject(ph);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//파일 ->프로그램
	public void fileRead() {
		//FileInputStream : 파일로부터 데이터를 읽어들이기위해 사용되는 기반스트림
		//ObjectOutputStream : 스트림으로 부터 객체단위로 입력받기위해 사용되는 보조스트림이다.
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("phone.txt"))){
			Phone p =(Phone)ois.readObject();//리턴 타입이 object타입임으로 리턴 클래스로 강제형변환 해줘야된다
			System.out.println(p);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
