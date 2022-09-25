package com.kh.practice.map.view;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public void mainMenu() {
		while (true) {
			System.out.print("1.회원가입\n2.로그인\n3.같은 이름 회원 찾기\n9. 프로그램 종료\n메뉴 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			switch (select) {
			case 1:	joinMembership();break;
			case 2:	logIn(); break;
			case 3:	sameName();	break;
			case 9:	System.out.println("프로그램을 종료합니다.");return;
			default:System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");		break;
			}
		}
	}
	public void joinMembership() {
		System.out.print("이름 :");
		String name=sc.nextLine();
		System.out.print("아이디 :");
		String id=sc.nextLine();
		System.out.print("비밀번호 :");
		String password=sc.nextLine();
		boolean result=mc.joinMembership(id, new Member(password, name));
		if (result) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		}else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}
	public void logIn() {
		System.out.print("아이디 :");
		String id=sc.nextLine();
		System.out.print("비밀번호 :");
		String password=sc.nextLine();
		String result=mc.logIn(id, password);
		if(result!=null) {
			System.out.println(result+"님 환영합니다.");
			memberMenu();
		}else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			logIn();
		}
		
	}

	public void memberMenu() {
		while(true) {
			System.out.print("1. 비밀번호 바꾸기\n2. 이름 바꾸기\n3. 로그아웃\n메뉴 번호 선택 : ");
			int select =sc.nextInt();
			sc.nextLine();
			switch(select) {
			case 1: changePassword();break;
			case 2: changeName();break;
			case 3: System.out.println("성공적으로 로그아웃되었습니다.");
				return;
			default:System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");break;
			}
		}
	} 


	

	public void changePassword() {
		System.out.print("아이디 :");
		String id=sc.nextLine();
		System.out.print("현재 비밀번호 :");
		String oldPw=sc.nextLine();
		System.out.print("새로운 비밀번호 :");
		String newPw=sc.nextLine();
		boolean result=mc.changePassword(id, oldPw, newPw);
		if (result) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		}else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요");
		}
	}

	public void changeName() {
		
		System.out.print("아이디 :");
		String id = sc.nextLine();
		System.out.print("비밀번호 :");
		String password = sc.nextLine();
		String oldName = mc.logIn(id, password);
		if (oldName == null) {
			System.out.println("잘못입력하셨습니다 다시 입력해 주세요.");
			changeName();
			return;
		}
		System.out.println("현재 이름 : " + oldName);
		System.out.print("변경할 이름 : ");
		String newName = sc.nextLine();
		if (oldName.equals(newName)) {
			System.out.println("중복된이름입니다.다시입력해주세요");
			changeName();
			return;
		}
		mc.changeName(id, newName);
		System.out.println("이름 변경에 성공하였습니다.");
		
		
	}

	public void sameName() {
		System.out.print("검색할 이름 :");
		String name = sc.nextLine();
		TreeMap<String, Member> result=mc.sameName(name);
		if(result.size()==0) {
			System.out.println("일치하는 아이디가 없습니다.");
		}else {
			Set<Entry<String,Member>> entry=result.entrySet();
			for (Entry<String, Member> entry2 : entry) {
				System.out.println(entry2.getValue().getName()+"-"+entry2.getKey());
			}
		}
	}
}
