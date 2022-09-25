package com.kh.chap06_method.controller;

// 클래스를 넣는 일반적으로 챕터는 model.vo에 넣는다.=>getset메소드는 예외
// 기능을 넣는 챕터는 controller에 넣는다.
// 화면을 컨트롤하는 기능은 view
public class MethodTest1 {
	/*
	 * 메소드 [표현법]
	 * 
	 * 접근제한자 [예약어] return값 메소드명(타입 매개변수){ 
	 * 수행할 코드; 
	 * return 값;반환형이 void일경우 생략가능.
	 * } 반환값으로는 클래스도 반환할수 있다? 메소드를 정의한 후 항상 여러번 호출해서 쓸 수 있다.
	 * 
	 */
	// 1. 매개변수도 없고 반환형도없는 메서드 인 메서드
	public void method1() {
		System.out.println("매개변수,반환형 둘다 없는 메소드입니다.");
		// 1부터 10부터 합계를 출력하세요.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += 1;
		}
		System.out.println("총 합계 : " + sum);
		
		//return; 
		//void 메서드느 return문이 생략되어있음. JVM이 자동으로 생성.
		
	}

	// 2.반환형은있고 매게변수는없는 메서드
	public int method2() {
		System.out.println("매개변수 없고, 반환형은 있는 메소드 입니다.");
		int random = (int) (Math.random() * 100) + 1;
		return random;
	}
	// 3. 매개변수가 있고 반환형은 없는 메서드.
	public void method3(int num1,int num2) {
		System.out.println("매개변수가 있고 반환형은 없는 메소드입니다. ");
		int bigger=num1>num2?num1:num2;
		System.out.printf("%d와 %d중 더 큰 값은 %d입니다.\n",num1,num2,bigger); 
	}
	
	// 4. 매개변수와 반환형 둘다있는 메소드
	
	public int method4(int num1,int num2) {
		System.out.println("매개변수도 있고 반환형도 있는 메소드 ");
		return num1*num2;
	}
	
}
