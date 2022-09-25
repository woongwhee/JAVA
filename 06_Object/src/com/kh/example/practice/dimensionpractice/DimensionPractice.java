package com.kh.example.practice.dimensionpractice;

import java.util.Scanner;

public class DimensionPractice {

	public void printArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void printArray(char arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void printArray(String arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice1() {
		String arr[][] = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + "," + j + ")";
			}
		}
		printArray(arr);
	}

	public void practice2() {
		int arr[][] = new int[4][4];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		printArray(arr);
	}

	public void practice3() {
		int arr[][] = new int[4][4];
		int num = arr.length * arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num--;
			}
		}
		printArray(arr);
	}

	public void practice4() {

		int arr[][] = new int[4][4];
		int row = arr.length;// 가로길이(행)
		int line = arr[0].length;// 세로길이(열)
		for (int i = 0; i < row - 1; i++) {
			for (int j = 0; j < line - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;

				// 행들의 합
				arr[i][line - 1] += arr[i][j];
				// 열들의 합
				arr[row - 1][j] += arr[i][j];

				// 가로세로합
				arr[row - 1][line - 1] += arr[i][j] * 2;
			}
		}

		printArray(arr);

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		int row;
		int line;
		while (true) {
			System.out.print("행 크기 : ");
			line = sc.nextInt();
			System.out.print("열 크기 : ");
			row = sc.nextInt();

			if ((0 < row && row < 11) && (0 < line && line < 11)) {
				break;
			} else {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
			}
		}
		sc.close();

		char[][] cArr = new char[row][line];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < line; j++) {
				cArr[i][j] = (char) ((Math.random() * 26) + 65);
			}
		}

		printArray(cArr);
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!!" } };

		// 최대길이를 저장.
		int max = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (max < strArr[i].length) {
				max = strArr[i].length;
			}
		}

		for (int i = 0; i < strArr[0].length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}

	}

	public void practice6_1() {
		int[][] arr = new int[][] { { 1, 2 }, { 2, 3, 5, 6 }, { 4, 5, 6, 2, 4 }, { 2, 3 }, { 5, 7, 8, 6, 5 } };

		// 최대길이를 저장.
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i].length) {
				max = arr[i].length;
			}
		}
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (max == arr[j].length) {// 배열의 길이가 최대길이랑 같은 경우 그냥 출력
					System.out.print(arr[j][i] + " ");
				} else if (max > arr[j].length) {// 배열의 길이가 최대길이보다 짧을 경우 배열 끝에 도달했는지 검사 후 출력
					if (i < arr[j].length) {
						System.out.print(arr[j][i] + " ");
					}
//							else {
//							System.out.print("  ");//배열의 끝에 도달했을경우 빈칸을 출력
//						}
				}
			}
			System.out.println();

		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		// 입력
		int line;
		while (true) {
			System.out.print("행의 크기 : ");
			line = sc.nextInt();
			if (line > 0) {
				break;
			}
			System.out.println("0보다 큰 값을 입력해 주세요.");
		}
		int[] input = new int[line];
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d열의 크기 : ", i);
			input[i] = sc.nextInt();

			if (input[i] < 1) {
				System.out.println("0보다 큰 값을 입력해 주세요.");
				i--;
			}
		}
		char[][] cArr = new char[line][];
		char ch = 'a';
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = new char[input[i]];
			for (int j = 0; j < cArr[i].length; j++) {
				cArr[i][j] = ch++;
				if (ch == 'z' + 1) {
					ch = 'A';
				} else if (ch == 'Z' + 1) {
					ch = 'a';
				}

			}
		}
		printArray(cArr);
	}

	public void practice8() {
		// 1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		// 7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		String strArr[] = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String classPartition1[][] = new String[3][2];
		String classPartition2[][] = new String[3][2];

		int count = 0;
		for (int i = 0; i < classPartition1.length; i++) {
			for (int j = 0; j < classPartition1[i].length; j++) {
				classPartition1[i][j] = strArr[count++];
			}
		}
		for (int i = 0; i < classPartition2.length; i++) {
			for (int j = 0; j < classPartition2[i].length; j++) {
				classPartition2[i][j] = strArr[count++];
			}
		}

		System.out.println("==1분단==");
		printArray(classPartition1);
		System.out.println("==2분단==");
		printArray(classPartition2);
	}

	public void practice9() {
		String strArr[] = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String classPartition1[][] = new String[3][2];
		String classPartition2[][] = new String[3][2];// 3차원배열로 설정하는건 ??
		int count = 0;
		for (int i = 0; i < classPartition1.length; i++) {
			for (int j = 0; j < classPartition1[i].length; j++) {
				classPartition1[i][j] = strArr[count++];
			}
		}
		for (int i = 0; i < classPartition2.length; i++) {
			for (int j = 0; j < classPartition2[i].length; j++) {
				classPartition2[i][j] = strArr[count++];
			}
		}
		char line[] = { '첫', '두', '세' };
		String row[] = { "오른쪽", "왼쪽" };
		Scanner sc = new Scanner(System.in);
		Loop1: while (true) {
			System.out.print("검색할 학생 이름을 입력하세요 : ");
			String search = sc.nextLine();

			for (int i = 0; i < classPartition1.length; i++) {
				for (int j = 0; j < classPartition1[i].length; j++) {
					if (classPartition1[i][j].equals(search)) {
						System.out.printf("검색하신 %s 학생은 1분단 %c 번째 줄 %s에 있습니다.", search, line[i], row[j]);
						break Loop1;
					}
				}
			}
			for (int i = 0; i < classPartition2.length; i++) {
				for (int j = 0; j < classPartition2[i].length; j++) {
					if (classPartition2[i][j].equals(search)) {
						System.out.printf("검색하신 %s 학생은 2분단 %c 번째 줄 %s에 있습니다.", search, line[i], row[j]);
						break Loop1;
					}
				}
			}

			System.out.println("검색하신 학생과 일치하는 학생이 없습니다. 다시 입력해주세요.");
		}

	}
}
