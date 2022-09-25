package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {
	ScoreDAO sd=new ScoreDAO();
public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
	sd.saveScore(name, kor, eng, math, sum, avg);
			
}

public DataInputStream readScore() throws FileNotFoundException/* , IOException , EOFException */ {
	
	DataInputStream ds=sd.readScore();
	return ds;	//기능상의 구분을위해  메소드를 호출하는 메소드를 만들어 줄 필요있다
}
}	
