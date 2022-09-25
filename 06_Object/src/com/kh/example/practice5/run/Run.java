package com.kh.example.practice5.run;

import com.kh.example.practice5.model.vo.Lotto;

public class Run {
	public static void main(String[] args) {
		Lotto lt=new Lotto();
		lt.infomation();
		
		System.out.println("\n첫번째 숫자 : "+lt.getLotoo(0));
		lt.setLotto(0, 2);
		System.out.println("변경된 첫번째 숫자 : "+lt.getLotoo(0));
		}
}
