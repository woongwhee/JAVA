package com.kh.chap01_objectArray.run;

import java.util.Scanner;

import com.kh.chap01_objectArray.model.vo.Phone;

public class ArrayForeach {
	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]++);
		}
		/* for each문 (향상된 for문)
		 * 배열 또는 컬렉션과 사용됨(컬렉션은 추후 학습예정)
		 * 
		 * 배열 또는 컬렉션의 0번인덱스부터 마지막인덱스까지 순차적으로 접글할 목적일때.
		 * 
		 * 초기식 조건식 증감식 없음
		 * 반복하는 횟수는 배열 또는 컬렉션의 크기만큼 반복함
		 * 
		 * [표현법]
		 * 
		 * for(순착적으로 접근한 값을 담을 변수 선언 : 순차적으로 접근할 배열/컬렉션){
		 *  실행문
		 * }
		 * 
		 * 
		 * 
		 */
		int[]arr2= {10,20,30,40};
		for(int num:arr2) {
			//arr2라는 배열의 0번인덱스부터 순차적으로 접근해 int num이라는 변수에 각 인덱스의 값을 저장함.
			System.out.println("num?"+num);
		}
		Phone[] phones=new Phone[3];
		phones[0]=new Phone("아이폰","13pro","애플",1_900_000);
		phones[1]=new Phone("갤럭시s","22","삼성",900_000);
		phones[2]=new Phone("아이폰","11pro","애플",1_400_000);
		int total=0;
		for(Phone E:phones) {
			System.out.println(E.info());
			total+=E.getPrice();
		}
		System.out.println("총 가격 : "+total+"원");
		System.out.println("평균가격 : "+(total/arr.length)+"원");
		//구매하고자하는 폰:
		//있으면 가격 :xx원;
		Scanner sc= new Scanner(System.in);
		System.out.print("구매하고자하는 폰 : ");
		String seruch=sc.nextLine();
		sc.close();
		boolean isFound=false;
		for(Phone P:phones) {
			if(P.getName().equals(seruch)) {
				System.out.println("가격 : "+P.getPrice());
				System.out.println("시리즈 : "+P.getSeries());
				isFound=true;
			}
		}
		
		if(!isFound) {
			System.out.println("구매하고자하는 폰이 없습니다.");
		}
		
		
	}
}
