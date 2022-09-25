package com.kh.chap01_objectArray.run;

import com.kh.chap01_objectArray.model.vo.Phone;

public class ObjectArrayRun {
	public static void main(String[] args) {
		Phone[] arr=new Phone[3];
		//System.out.println(pArr);
		//System.out.println(pArr.length);
		//System.out.println(pArr[0]);
		arr[0]=new Phone();
		arr[0].setName("아이폰");
		System.out.println(arr[0].getName());
		//System.out.println(arr[1].getName());//NullPointerException
		arr[0].setSeries("13pro");
		arr[0].setBrand("애플");
		arr[0].setPrice(1_500_000);
		
		arr[1]=new Phone("갤럭시s","22","삼성",900_000);
		arr[2]=new Phone("아이폰","11pro","애플",1_400_000);
		//info();
		// 총 가격:xx원
		// 평균 가격:xx원;
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].info());
			total+=arr[i].getPrice();
		}
		System.out.println("총 가격 : "+total+"원");
		System.out.println("평균가격 : "+total/arr.length+"원");
	}
}
