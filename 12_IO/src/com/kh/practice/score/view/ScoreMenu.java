package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적저장\n2. 성적출력 \n9. 끝내기");
			System.out.print("메뉴 번호: ");
			int select = sc.nextInt();
			sc.nextLine();

			if (select == 1) {
				saveScore();
			} else if (select == 2) {
				readScore();
			} else if (select == 9) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

	public void saveScore() {
		int num = 0;// 학생숫자
		while (true) {
			num++;
			System.out.println(num + "번째 학생 정보기록");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.println("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.println("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.println("수학 점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			int sum = kor + eng + math;
			scr.saveScore(name, kor, eng, math, sum, sum / 3);

			System.out.print("계속하시려면 아무키나 눌러주시고 그만 하시려면 N이나 n을 입력해 주세요 : ");
			char yn = sc.nextLine().charAt(0);
			if (yn == 'n' || yn == 'N') {
				break;
			}
		}
	}

	public void readScore() {
		int count=0;
		int totalSum=0;
		double totalAvg=0;
		
		try(DataInputStream dos= scr.readScore()){
			System.out.println("이름 국어 영어 수학 총점 평균");
			while(true) {
				StringTokenizer st=new StringTokenizer(dos.readUTF()," ");
				
				System.out.print(st.nextToken()+" ");
				System.out.print(st.nextToken()+" ");
				System.out.print(st.nextToken()+" ");
				System.out.print(st.nextToken()+" ");
				int sum=Integer.parseInt(st.nextToken());
				System.out.print(sum+" ");
				double avg=Double.parseDouble(st.nextToken());
				System.out.println(avg);
				totalSum+=sum;
				totalAvg+=avg;
				count++;
				}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("읽은 횟수 전체 합계 전체 평균");
			System.out.println(count+"\t"+totalSum+"\t"+totalAvg/count);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
