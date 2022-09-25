package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	public StudentMenu() {
		StudentController sc=new StudentController();
		Student[] sArr= new Student[5];
		sArr=sc.printStudent();
		System.out.println("========== 학생 정보 출력 ==========");
		for (int i = 0; i < sArr.length; i++) {
			System.out.printf("이름 : %s / 과목 : %s / 점수 :%d\n",sArr[i].getName(),sArr[i].getSubject(),sArr[i].getScore() );
		}
		System.out.println("==========학생 성적 출력==========");
		System.out.println("학생 점수 합계"+sc.avgScore()[0]);
		System.out.println("학생 점수 평균"+sc.avgScore()[1]);
		System.out.println("==========성적 결과 출력==========");
		for (int i = 0; i < sArr.length; i++) {
			if(sArr[0].getScore()<StudentController.CUT_LINE) {
				System.out.printf("%s학생은 재시험 대상입니다.\n",sArr[i].getName());
			}else {
				System.out.printf("%s학생은 통과입니다.\n",sArr[i].getName());
				
			}
		}
	}
}



