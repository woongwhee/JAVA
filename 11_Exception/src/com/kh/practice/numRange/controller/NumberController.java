package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	public boolean checkDouble (int num1,int num2) throws NumRangeException{
		int max=Math.max(num1, num2);
		int min=Math.min(num1, num2);
		
		if(max>100||min<1) {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
		
		return max%min==0;
	}
}
