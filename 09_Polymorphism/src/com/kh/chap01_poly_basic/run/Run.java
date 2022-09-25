package com.kh.chap01_poly_basic.run;

import com.kh.chap01_poly_basic.model.vo.Child1;
import com.kh.chap01_poly_basic.model.vo.Child2;
import com.kh.chap01_poly_basic.model.vo.Parent;
//상속구조에서
//부모클래스에 자식객체 형변환(o);//UpCasting
//자식클래스에 부모객체 형변환(x);//DownCasting
//자식클래스에 부모객체 명시적으로 형변환(o);//DownCasting
//
//부모클래스의 자식객체에서 부모메서드 접근(o)
//부모클래스의 자식객체에서 부모메서드를 오버라이드한 자식메서드 접근(o)
//※우선 순위를 가저감
//부모클래스의 자식객체에서 자식메서드 접근(x)
//부모클래스의 자식객체를 자식클래스로 형변환을해 자식메서드에 접근(o)

/* 하는 이유
 * 예를들어 햄버거집이라는 부모클래스와 그걸 상속받는 맥도날드클래스
 * 버거킹클래스 롯데리아클래스가 있다고 보자
 * 이때 메뉴판 호출()이라는 메서드를 호출하였을때   
 * 서로 다른 타입의 클래스로 같은 이름의 메서드를 관리하는 거보다
 * 부모타입의 자식객체들로 각기 다른 오버라이딩 된 메서드를 호출하는 방식이
 * 훨씬 더 관리하기 편하다는 것이다. ??
 *   
 * ex)
 * Child1 []arr1=new Child1[2];
 * arr1[0]
 * 
 * 
 * 
 */



public class Run {
	public static void main(String[] args) {
		// 명심할 사하 '='대입 연산자 기준 왼쪽과 오른쪽은 동일한 자료형이여야함.
		// 1. 부모타입레퍼런스로 부모객체를 다루는 경우.
		System.out.println("1. 부모타입레퍼런스로 부모객체를 다루는 경우.");
		Parent p1 = new Parent();
//	p1.printParent();
		// 2. 자식타입 래퍼런스로 자식 객체 다루는 경우
		System.out.println("2. 자식타입 래퍼런스로 자식 객체 다루는 경우");
		Child1 c1 = new Child1();// 부모클래스 생성자가 먼저 호출되 ()heap메모리에 할당이 된다.
									// 부모생성자를 명시적으로 호출하지 않으면 부모의 기본생성자를 JVM이 먼저 호출한다.
									// 만약의 기본 부모생성자가 없다면 컴파일러 에러가 난다.
									// 그위에 자식클래스의 생성자를 덮는다고 생각하면 된다.
		c1.printChild1();
		c1.printParent();
		// 자식클래스에서 부모클래스의 메서드에 접근할때 형변환이 자동으로 일어난다.
		// ((Parent)c1).printParent()

		Parent p2 = c1;// (o)

		// p2.printChild1();(x)//부모클래스에 들어간 자식클래스는 명시적으로 원래클래스를 형변환해줘야지 메서드에 접근할수있다.
		// 부모클래스에선 자식클래스에 대한 정보가 없기 때문
//		((Child1) p2).printParent();
		// Child1 c2=p1; (x) 부모클래스에는 자식 클래스에 대한 정보가 없다.
		
		Parent c2=new Child2();
//		c2.printParent();
		//c2.printChild2();
		//ex) 다형성적용전
		Child1 []arr1=new Child1[2];
		arr1[0]=new Child1(1, 2, 3);
		arr1[1]=new Child1(1, 2, 3);
		
		Child2 []arr2=new Child2[2];
		arr2[0]=new Child2(1, 2, 3);
		arr2[1]=new Child2(1, 2, 3);
		//ex)다형성 적용후 
		Parent [] arr=new Parent[6];
		arr[0]=new Child1(1, 2, 3);
		arr[1]=new Child1(1, 2, 3);
		arr[2]=new Child2(1, 2, 3);
		arr[3]=new Child2(1, 2, 3);
		arr[4]=new Parent(1,2);
		arr[5]=new Parent(1,2);
		System.out.println("다형성 오버라이딩");
		//메소드 사용법
//		((Child1)arr[0]).printChild1();
//		((Child1)arr[1]).printChild1();
//		((Child2)arr[2]).printChild2();
//		((Child2)arr[3]).printChild2();
		//각 객체가 어떤 객체를 참조하고 있는지 알아야 각각의 이름이 명명된 메서드를 호출할수있다.
		//이때 사용하는게 메서드 오버라이딩
//		for (int i = 0; i < arr.length; i++) {
//			arr[i].print();
//		}
		
		
		//특정 클래스만 사용해야되는 경우 
		//현재 레퍼런스가 실제로 어떤 클래스 타입을 참조하고있는지 확인할때 사용.
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Child2 ) {
				((Child2)arr[i]).printChild2();;
			}else {
				arr[i].print();//print를 눌러보면 .Parent.print()를 참조하고있지만 실제로컴파일이되면서 자식클래스 메서드를 찾아간다.
				/* 동적바인딩 : 프로그램이 실행되기전에 자동으로 컴파일되면서 정적바인딩됨.(레퍼런스타입의 메소드를 가리킴)
				 * 단, 실질적으로 참조하고있는 자식클래스에 해당 메소드가 오버라이딩 되어있다면
				 * 프로그램 실행시 동적으로 그 자식클래스의 메서드를 찾아가서 실행.
				 */
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Child2 ) {
				((Child2)arr[i]).setN(100);
			}else if(arr[i] instanceof Child1) {
				((Child1)arr[i]).setZ(100);
			}else {
				arr[i].setX(100);
			}
		}
		
		
	}
}
