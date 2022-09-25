package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 프로그램은 기본적으로 순차적으로 진행된다. 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 통해 직접 제어가 가능하다.
	 *
	 * 선택적으로 실행시키고자 할때-> 제어문 반복적으로 실행시키고자 할때 -> 반복문 그 외의 흐름제어시 ->분기문
	 *
	 * 조건문 조건문을 통해 참이냐 거짓이냐를 판단해서 그에 해당하는 코드 실행.
	 *
	 * 조건식의 결과는 항상 true/false여야 한다! 보통 조건식에는 비교연산자(대소,등등),논리연산자(and or)을 주로 사용.
	 *
	 * 조건문은 크게 if문(단독 if ,if else,if elsif, 중복 if문),switch문 으로 나뉜다.
	 */

	public void method1() {
		// 삼항연산자를 조건문으로 바꿔보자.

		/*
		 * if문 [표현법] if(조건식){ //조건식이 true인 경우 실행될 코드작성 }
		 * 
		 * => 조건식의 결과가 참인경우 중괄호블럭 안의 코드가 실행됨. => 조건식의 결과가 거짓인경우 중괄호블럭 안의 코드가 무시되고 넘어감.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
//		System.out.println(num>0?"양수다":"양수가 아니다")
		if (num > 0) {
			System.out.println("양수다.");
		}
		if (num <= 0) {
			System.out.println("양수가 아니다.");
		}
//		이런식으로 작성하면 앞에 조건문을 만족해도 뒤의 조건문을 2번실행하게되어 비효율적이다.
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
		/*
		 * if else문.
		 * 
		 * [표현법] if (조건식){ 조건식이 참이면 실행될 실행문 }else { 조건식이 거짓이면 실행될 실행문 }
		 */
		if (num > 0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}

		/*
		 * 커버리지로 실행할시 jvm이 실행한부분 초록 검사한부분 노랑 실행하지 않은부분 빨강
		 */

	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
		/*
		 * if else if문 [표현법] if(조건식1){ 조건식 1의 값이 참인경우 실행될 코드 }else if(조건식 2){ 조건식 2의 값이
		 * 참인경우 실행될 코드 }else if(조건식 3){ 조건식 3의 값이 참인경우 실행될 코드 }else{(생략가능) 위의 조건들이 모두
		 * 거짓인경우 실행될 코드 }
		 * 
		 * else if가 없던시절엔 이렇게 else에 중첩해서 작성해야됬다 너무 복잡하다
		 * 
		 * if(){
		 * 
		 * }else{ if(){ } else{ if(){} else(){} } }
		 * 
		 */
		if (num > 0)
			System.out.println("양수다.");
		else if (num == 0)
			System.out.println("0이다.");
		else
			System.out.println("음수다.");

	}

	public void method4() {
		// 사용자에게 정수값을 입력받고 청소년 어린이 성인 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요:");
		int age = sc.nextInt();
		sc.close();
//		if(age>19) {
//			System.out.println("성인입니다.");
//		}else if(age>13) {
////		}else if(age<=19	&&age>13) {
////age>19는 false라는게 위에서 확인되었으니 다시한번 확인할필요없다
//			System.out.println("청소년입니다.");	
//		}else {
//			System.out.println("어린이입니다.");	
//			
//		}
		String result;
		if (age > 19) {
			result = "성인";
//			String result="성인";

		} else if (age > 13) {
			result = "청소년";
//			String result="청소년";
		} else /* if(age<=13) */ {
			result = "어린이";
//			String result="어린이";
		}
		System.out.println(result);
		/*
		 * 조건문에 있는 중괄호도 하나의 영역이다. 중괄호 안에서 선언한 변수는 밖에서 사용 할 수 없다. else 문없이 else if문으로
		 * 마무리되면 result 값이 확정이 되지않는다. 때문에 컴파일러 오류가 나오게 된다.
		 */
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);
		// 이름, 성별 한글자를 입력받아 남자인지 여자인지 출력하는 프로그램
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char Sex = sc.nextLine().charAt(0);

		String result = null;
		if (Sex == 'm' || Sex == 'M') {
			result = "남자";
		} else if (Sex == 'f' || Sex == 'F') {
			result = "여자";
		} else {
			System.out.println("잘못입력하셨습니다.");
			return;// 현재 메소드를 빠저나가는 역활.
		}
		System.out.printf("%s님은 %s입니다.", name, result);

	}

	public void method6() {
		/*
		 * 특이케이스 문자열간의 동등비교에 관하여(문자열== 문자열) 사용자에게 이름을 입력받아 민경민과 일치하는지 비교하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요:");
		String name = sc.nextLine();
		String Min = "민경민";
		/*
		 * 문자열은 참조형 자료형이기 때문에 문자열.equals(문자열);
		 * 
		 */
//		if(name.charAt(0)==Min[0]&&name.charAt(1)==Min[1]&&name.charAt(2)==Min[2]) {
		if (Min.equals(name)) {
			System.out.println("민경민이시군요");
		} else {
			System.out.println("민경민이 아니시군요");

		}
	}
	public void method7() {
		/* 중복 if문
		 * 양수를 입력 받고 짝수 홀수를 판별하는 출력프로그램
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력해주세요:");
		int num = sc.nextInt();
		
		if(num>0) {
			
			if(num%2==0){
			System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println("양수가 아닙니다.다시입력하세요");
			method7();//양수를 입력할때까지 재귀호출
		}	
	}
}
