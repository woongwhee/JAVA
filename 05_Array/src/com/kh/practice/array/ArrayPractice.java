package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int aLength = sc.nextInt();
		System.out.print("양의 정수: ");
		int[] arr = new int[aLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() {
		String[] sArr = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(sArr[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String str = sc.nextLine();
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		int strLenght = str.length();
		int count = 0;// 개수를 샌다.
		for (int i = 0; i < strLenght; i++) {
			if (str.charAt(i) == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.printf("\n%c 개수 : %d", ch, count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		char[] week = { '월', '화', '수', '목', '금', '토', '일' };
		while (true) {
			System.out.print("0~6 사이 숫자 입력: ");
			int num = sc.nextInt();
			if (num > 0 && num < 7) {
				System.out.println(week[num] + "요일");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int aLenght = sc.nextInt();
		int dynamicArr[] = new int[aLenght];
		for (int i = 0; i < dynamicArr.length; i++) {
			System.out.printf("배열 %d번쨰 인덱스에 넣을값: ", i);
			dynamicArr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < dynamicArr.length; i++) {
			System.out.print(dynamicArr[i] + " ");
			sum += dynamicArr[i];
		}
		System.out.println("\n총 합 :" + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("홀수(3이상) : ");
			int aLenght = sc.nextInt();
			if (aLenght > 2 && aLenght % 2 == 1) {
				int[] arr = new int[aLenght];
				for (int i = 0; i < arr.length / 2 + 1; i++) {
					arr[i] = i + 1;
					arr[arr.length - 1 - i] = i + 1;
					// 배열 0과 끝부터 시작해 가운대로 차례차례 값을대입한다.
				}
				for (int i = 0; i < arr.length; i++) {
					if (i != arr.length) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				}

				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}

	}

	public void practice9() {
		String[] Menu = { "뿌링클", "양념", "간장", "불닭", "커리퀸", "후라이드" };
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요: ");
		String oder = sc.next();
		sc.close();
		boolean isMenu = false;
		for (int i = 0; i < Menu.length; i++) {
			if (Menu[i].equals(oder)) {
				isMenu = true;
				break;
			}
		}
		if (isMenu) {
			System.out.println(oder + "치킨 배달 가능");
		} else {
			System.out.println(oder + "치킨은 없는 메뉴입니다.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("주민등록번호 : ");
			char[] address = sc.nextLine().toCharArray();

			if (address.length == 14 || address[6] == '-') {

				for (int i = 0; i < address.length; i++) {
					if (i < 8) {
						System.out.print(address[i]);
					} else {
						System.out.print('*');
					}
				}
				break;
			}

		}
	}

	public void practice11() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요. ex. 9
		 * 7 6 2 5 10 7 2 9 6
		 */
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
//		버블소트 만들기
//		int temp=0;
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		Arrays.sort(arr);
//		System.out.println("\n최대값 : " + arr[9]);
//		System.out.println("최소값 : " + arr[0]);
//		??
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice13() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요
		int arr[] = new int[10];
		// 확인용배열 사용하는방법
		int count[] = new int[11];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			count[arr[i]]++;
			if (count[arr[i]] > 1) {
				i--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//2중 포문으로 하는법;
		//인덱스의 값이 리터럴값과 같게 설정할수없을때 쓰면 될듯
		int arr2[]= new int[10];
		for (int i = 0; i < arr2.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			for(int j=0;j<i;j++) {
				if(arr2[i]==arr2[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("\n===================");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	public void practice14() {
		int arr[] = new int[6];
		int count[] = new int[46];//45+ 0 1개 확인용 배열

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			count[arr[i]]++;
			if (count[arr[i]] > 1) {
				i--;
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		
		int[] allpa = new int[26];
		String str = sc.next();
		int strLength = str.length();
		for (int i = 0; i < strLength; i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				allpa[str.charAt(i) - 97]++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				allpa[str.charAt(i) - 65]++;
			}
		}
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < allpa.length; i++) {
			if (allpa[i] > 0) {
				System.out.print((char) (i + 97) + ", ");
			}
		}
		System.out.println("\n문자 개수 : " + count);
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);
		//최초입력
		System.out.print("배열의 크기를 입력하세요 : ");
		int length = sc.nextInt();
		sc.nextLine();
		String origin[] = new String[length];
		String copy[]=new String[length];
		for (int i = 0; i < origin.length; i++) {
			System.out.printf("%d번째 문자열 : ",i+1);
			origin[i] = sc.nextLine();
		}
		//추가입력
		while (true) {
			System.out.print("더 값을 입력하겠습니까?(Y/N): ");
			char ys = sc.nextLine().charAt(0);
			if (ys == 'N' || ys == 'n') {
				break;
			}
			System.out.print("더 입력하고싶은 개수:");
			int length2 = sc.nextInt();
			sc.nextLine();
			copy=new String[length+length2];//카피
			System.arraycopy(origin, 0, copy, 0, length);
			for(int i=length;i<length+length2;i++) {
				System.out.printf("%d번째 문자열 : ",i+1);
				copy[i]=sc.nextLine();
			}
			length+=length2;
			origin=new  String[length];
			System.arraycopy(copy, 0, origin, 0, length);
		}
		
		System.out.print("[");
		for (int i = 0; i < origin.length; i++) {
			if (i != origin.length - 1) {
				System.out.print(origin[i] + ", ");
			} else {
				System.out.print(origin[i] + ']');
			}
		}
		System.out.print("]");
	}
}