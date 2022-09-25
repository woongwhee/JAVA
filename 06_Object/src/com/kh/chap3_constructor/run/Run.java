package com.kh.chap3_constructor.run;

import com.kh.chap3_constructor.medule.vo.User;

public class Run {
	public static void main(String[] args) {
		User u = new User();
		User u2=new User("aaddb","1q2w3e4r","진윤희");
		User u3= new User("wlsdndgnl","dndgnl","진웅휘",11,'M');
		System.out.println(u.info());
		System.out.println(u2.info());
		System.out.println(u3.info());
		
	}
}
