package com.kh.chap04_assist2.run;

import com.kh.chap04_assist2.model.dao.ObjectDao;
import com.kh.chap04_assist2.model.dao.ObjectcDao;

public class Run {
public static void main(String[] args) {
	ObjectDao od=new ObjectDao();
//	od.fileSave("D_Object.txt");
	ObjectcDao ods=new ObjectcDao();
	ods.fileSave("D_Objects.txt");
	ods.fileRead();;
}
}
