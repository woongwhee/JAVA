package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("User_Score.txt", true))) {
			String str=name+" "+kor+" "+eng+" "+math+" "+sum+" "+avg;
			dos.writeUTF(str);
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public DataInputStream readScore() throws FileNotFoundException/* , IOException , EOFException */ {//이거 따로 쓰로우 안해줘도 되네??
		DataInputStream dis=new DataInputStream(new FileInputStream("User_Score.txt"));
		return dis;
	
		
	}

}
