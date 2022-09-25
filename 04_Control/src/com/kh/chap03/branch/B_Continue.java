package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue; 반복문 안에서 continue를 만나게되면 뒤에 어떤 구문이 있던간에 실행하지 않고 가장 가까운(중괄호 범위)반복문으로
	 * 돌아가라
	 * 
	 */
	public void method1() {
		// continue를 이용 해 1부터 10까지 홀수만 출력
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

	public void method2() {
		// 1부터 100까지의 총합계
		// 단 , 6의 배수는 빼고 더하기
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i%6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
	public void method3() {
		//2~9까지 출력.
		//단사이는 ==으로 구분
		//======X단======
		//4의 배수단은 빼고 출력.
		for(int i=2;i<10;i++) {
			if (i%4==0) {
				continue;
			}
			System.out.println("====="+i+"단=====");
			
			for(int j=1;j<10;j++) {
				System.out.printf("%d X %d = %d",i,j,i*j);
			}
		}
	}
}
