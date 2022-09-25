package com.kh.practice.chap02.loop;

import java.util.Scanner;


public class LoopPractice {
	// 사용자에게 1이상의 값을 입력받고 1부터 값까지의 모든값을 출력
	// 만약 1미만의 숫자가 입력되었다면 "1이상의 숫자를 입력해주세요 가 출력되면서
	// 다시 값을 입력받아라
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}
			System.out.println("1이상의 숫자를 입력해주세요.");

		}
	}

	public void practice2() {
		// practice1에서 숫자를 거꾸로 출력
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
				break;
			}
			System.out.println("1이상의 숫자를 입력해주세요.");

		}
	}

	public void practice3() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (num == i) {
				System.out.printf("%d = %d ", num, sum);
				break;
			}
			System.out.print(i + " + ");
		}

	}

	public void practice4() {
		// 두개의 값을 입력받아 사이값을 출력
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("첫번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 : ");
			int num2 = sc.nextInt();
			if (num1 > 0 || num2 > 0) {
				if (num1 > num2) {// 두번째숫자가 첫번째 숫자보다 클경우 두 변수의 값을 교환함
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}
				for (; num1 <= num2; num1++) {
					System.out.print(num1 + " ");
				}
				break;
			}
			System.out.println("1 이상의 숫자를 입력해 주세요.");
		}
	}

	public void practice5() {// 입력받은 단부터 9단까지출력
		// 9를 초과하는 숫자 입력시"9이하의 숫자를 입력해주세요.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 : ");
			int Dan = sc.nextInt();
			if (Dan <= 9) {
				for (int i = Dan; i < 10; i++) {
					System.out.println("=====" + i + "단=====");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d X %d = %d\n", i, j, i * j);
					}
				}
				break;
			}
			if (Dan < 1) {
				System.out.println("1이상의 숫자만 입력해주세요");
				continue;
			}
			System.out.println("9이하의 숫자만 입력해주세요.");
		}
	}

	public void practice6() {
		// 숫자와 공차를 입력받아 일정한 값으로 부터 커지거나 작아지는 값을
		// 10개 출력하는 프로그램 구현
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int allowance = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.print(startNum + " ");
			startNum += allowance;
		}
		
		/*for (int i = 0; i < 10; i++) {
			System.out.print(startNum+i*allowance + " ");
			강사님 코드인데
			수열을 표현 하는데는 이 방식이 더 깔끔한거 갓기도? 경기도?
		}*/
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("연산자(+,-,*,/,%) : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			char oper = str.charAt(0);

			System.out.print("정수1 :");
			int num1 = sc.nextInt();

			System.out.print("정수2 :");
			int num2 = sc.nextInt();
			sc.nextLine();
			if (oper == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요.");
				continue;
			} else {
				int result = 0;// 문제에서 결과값이 전부 int임으로 int에 넣어 출력
				switch (oper) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;

				case '*':
					result = num1 * num2;
					break;

				case '/':
					result = num1 / num2;
					break;

				case '%':
					result = num1 % num2;
					break;

				default:
					System.out.println("없는 연산자입니다. 다시 입력해주세요");
					continue;
				}
				System.out.printf("%d %c %d = %d\n", num1, oper, num2, result);
			}
		}
	}

	public void practice8() {
		///
		/*
		 * 정수입력 : 4 * ** *** **** 다음과같이 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public void practice9() {
		// 예제8 반대로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			for (int j = star; j > i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

	public void practice10() {
		/*
		 * 정수입력 : 4 * ** *** **** 다음과같이 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < star - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public void practice11() {
		// 예제10 반대로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = star; j > i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

	public void practice12() {
		/*
		 * 정수입력 : 4 
		 * 	  * 
		 *   *** 
		 *  ***** 
		 * ******* 다음과같이 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2 이상의 정수 : ");
		int Num = sc.nextInt();
		if (Num < 2) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		for (int i = 2; i < Num; i++) {
			if (Num % i == 0 && Num != 2) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		System.out.println("소수입니다.");

	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2 이상의 정수 : ");
		int Num = sc.nextInt();
		if (Num < 2) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		int count = 1;// 2는 미리 체크;
		int check = 0;
		for (int i = 3; i <= Num; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check++;// 소수가 아니면 체크를 1로만들고 for문을 빠저나감
					break;
				}

			}
			if (check == 0) {
				count++;
			}
			check = 0;
		}
		System.out.printf("2부터 %d까지 소수의 개수는 %d개입니다.", Num, count);

	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		while (true) {
			int Num = sc.nextInt();
			if (Num < 1) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}

			int count = 0;
			for (int i = 1; i <= Num; i++) {
				if (i % 2 == 0 || i % 3 == 0) {
					// 배수를 출력한다.
					System.out.print(i + " ");
					if (i % 2 == 0 && i % 3 == 0) {
						// 공배수인경우를 if문 안에서 확인
						count++;
					}
				}
			}
			System.out.println("\ncount : " + count);

			break;
		}
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int star = sc.nextInt();
		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 1; i <= star - 1; i++) {
			for (int j = 0; j < star - i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int square = sc.nextInt();
		for (int i = 1; i <= square; i++) {
			if (i == 1 || i == square) {
				for (int j = 0; j < square; j++) {
					System.out.print('*');
				}
				System.out.println();

			} else {
				for (int j = 1; j <= square; j++) {
					if (j == 1 || j == square) {
						System.out.print('*');
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();

			}

		}

	}

	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 0; i < star - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (star - i) * 2 - 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				if (j == 0 || j == 2 * i) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<star;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*(star-i)-1;j++) {
				if(j==0||j==2*(star-i)-2) {
				System.out.print('*');}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
