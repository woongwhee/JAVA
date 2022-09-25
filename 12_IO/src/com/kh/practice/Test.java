package com.kh.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public void write(){
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("test.txt",true))){
			for (int i = 0; i < 20; i++) {
			 String str="자료"+i;
			 dos.writeUTF(str);
			}
		}catch(EOFException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void read() {
		try(DataInputStream dis=new DataInputStream(new FileInputStream("test.txt"))){
			for (int i = 0; i < 21; i++) {
				String str=dis.readUTF();
			System.out.println(dis.readUTF());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}