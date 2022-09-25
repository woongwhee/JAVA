package com.kh.example.practice5.model.vo;

public class Lotto {
	//필드
	private int lotto[]=new int[6];
	//생성자
	public Lotto() {
		int[] count=new int[46];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			count[lotto[i]]++;
			if(count[lotto[i]]>1) {
				i--;
			}
		}
	}
	//메소드
	 public void setLotto(int index,int number) {
		 lotto[index]=number;
	 }
	 public int getLotoo(int index) {
		 return lotto[index];
	 }
	 public void infomation() {
		 System.out.print("금주의 로또번호는??! : ");
		 for (int i = 0; i < lotto.length; i++) {
			 System.out.print(lotto[i]+" ");
		}
	 }
}
