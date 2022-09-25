package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student st=new Student();
		st.setGrade(3);
		st.setClassroom(2);
		st.setName("진웅휘");
		st.setHeight(172.1);
		st.setGender('남');
		st.information();
	}
}
 	 