package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r= new Rectangle();
	public String calcArea(int x,int y,int height,int width) {
		
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		return "면적 : "+r.toString()+(width*height);
	}
	
	public String calcPerimeterint(int x,int y,int height,int width) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		return "둘레 : "+r.toString()+((width+height)*2);
		
	}
}
