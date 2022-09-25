package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	public String[] method() {
		Phone[] p=new Phone[2];
		String[] s=new String[2]; 
		p[0]=new GalaxyNote9();
		p[1]=new V40();
		s[0]=((GalaxyNote9)p[0]).printInfomation();
		s[1]=((V40)p[1]).printInfomation();
		
		return s;
				
	}

}
