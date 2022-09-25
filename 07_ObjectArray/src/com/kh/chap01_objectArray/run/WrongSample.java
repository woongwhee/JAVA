package com.kh.chap01_objectArray.run;

import com.kh.chap01_objectArray.model.vo.Phone;

public class WrongSample {
	public static void main(String[] args) {
		Phone [] arr= new Phone[3];
		
//		for(int i=0;i<=arr.length;i++) {
//			System.out.println(arr[i].getName());
//		}
		//첫번째 문제점 : 단지 phone 객체 3개를 담기위해 공간을 셋팅했을뿐 
		//			  각 인덱스별 phone 객체를 생성하지 않아 null이 담긴상태.
		//			  null임에도 불구하고 접근하려 했기때문에 NullPointerException이 발생
		//두번째 문제점 : 부적절한 index가 제시되으므로(크거나,음수거나) ArrayIndexOutOfBoundsException
		//			  해결방법은 범위를 수정하면됨
		//
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new Phone();
			System.out.println(arr[i].getName());
		}
		
	}
}
