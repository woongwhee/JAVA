package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		switch (select) {
		case 1:
			circleMenu();
			break;
		case 2:
			rectangleMenu();
			break;
		case 9:
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			mainMenu();
			break;
		}
	}

//			+ mainMenu() : void
	public void circleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		switch (select) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			mainMenu();
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			mainMenu();
			break;
		}
	}

	public void rectangleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		switch (select) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			mainMenu();
			break;
		}
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcPerimeterint(x, y, radius));
		mainMenu();

	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
		mainMenu();
	}

	public void calcPerimeter() {// 사각형둘레
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("가로길이 : ");
		int height = sc.nextInt();

		System.out.print("세로길이 : ");
		int width = sc.nextInt();

		System.out.println(rc.calcPerimeterint(x, y, height, width));
		mainMenu();
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("가로길이 : ");
		int height = sc.nextInt();

		System.out.print("세로길이 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
		mainMenu();
	}
//			+ rectangleMenu():void
//			+ calcCircum():void
//			+ calcCircleArea():void
//			+ calcPerimeter():void
//			+ calcRectArea():void
}
