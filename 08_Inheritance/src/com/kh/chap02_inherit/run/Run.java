package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.moder.vo.Airplane;
import com.kh.chap02_inherit.moder.vo.Car;
import com.kh.chap02_inherit.moder.vo.Ship;
import com.kh.chap02_inherit.moder.vo.Vehicle;

public class Run {
	public static void main(String[] args) {
		
		Airplane a= new Airplane("여객기", 0.9, "747", 6, 4);
		
		a.howToMove();
		
	}
}
