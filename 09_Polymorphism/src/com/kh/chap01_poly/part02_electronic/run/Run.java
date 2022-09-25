package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {
	public static void main(String[] args) {

		ElectronicController ec = new ElectronicController();
		// 가게에 전자재품을 납품
//		ec.insert(new Desktop("삼성", "데탑", 1220000, "Geforce 1070"));
//		ec.insert(new NoteBook("Lg", "그램", 1200000, 4));
//		ec.insert(new Tablet("애플", "아이패드프로", 990000, true));
		// 가게에 있는 상품들 조회
//		System.out.println(ec.selectDesktop());// => jvm이 자동으로 toString 메소드를 실행시켜줌
//		System.out.println(ec.selectNoteBook());
//		System.out.println(ec.selectTablet());
		System.out.println("=============다형성 적용예시===============");
		ElectronicController2 ec2 = new ElectronicController2();
		ec2.insert(new Desktop("삼성", "데탑", 1220000, "Geforce 1070"));
		ec2.insert(new NoteBook("Lg", "그램", 1200000, 4));
		ec2.insert(new Tablet("애플", "아이패드프로", 990000, true));
		ec2.insert(new Tablet("애플", "아이패드프로", 990000, true));
		ec2.insert(new NoteBook("Lg", "그램", 1200000, 4));
		
		for (int i = 0; i < ec2.elecLength(); i++) {
			System.out.println(ec2.select(i));
		}
		// 코드가훨씬 간결해 젔나?
		/*다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 자식들을 받아줄수 있음.
		 * => 부모타입 하나만으로 다양한 자식객체를 커버가능
		 * 2. 메소드의 매개변수나 반환형에 다향성을 적용하게되면 메소드의 개수가 확 줄어든.
		 * 
		 * 
		 * 
		 */
	}

}
