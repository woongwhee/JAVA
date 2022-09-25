package com.kh.chap02_set.part01_hashset.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashset.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		HashSet<String> hs1=new HashSet();//제네릭으로 들어갈 타입을 고정해둘수 있다.
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("안녕하세요."));
		hs1.add("안녕하세요.");
		hs1.add(new String("안녕하세요."));
		//hs1.add(50);//The method add(String) in the type HashSet<String> is not applicable for the arguments (int)
		System.out.println(hs1);//[안녕하세요., 반갑습니다.]
		//1. 해시셋의 특성 저장 순서유지x 중복값 저장 x
		//2.크기구하기 :size()
		System.out.println(hs1.size());//2
		//3.값 삭제 :remove(삭제할 값)
		hs1.remove("안녕하세요.");//인덱스를 통한 삭제가 아닌 값을 통한 값을 삭제
		System.out.println(hs1);//[반갑습니다.]
		//4. 모든값을 삭제 :clear();
		hs1.clear();
		System.out.println(hs1);//[]
		
		HashSet<Student> hs2=new HashSet<Student>();
		hs2.add(new Student("경민 ",24,80));
		hs2.add(new Student("경민2 ",26,100));
		hs2.add(new Student("민경민 ",28,90));
		hs2.add(new Student("경민",24,80));
		hs2.add(new Student("경민24",8,0));
//		System.out.println(hs2);
		//객체에 equals 메소드랑 hashCode메소드를 재정의 해놓으지 않았으면 해시테이블이 재대로 비교되지 않는다.
//		System.out.println("std와 는 std2같은가?"+std.equals(std2));
//		System.out.println("std와 는 std2같은가?"+std.equals(std2));
//		System.out.println("std hash"+std.hashCode());
//		System.out.println("std2 hash"+std2.hashCode());//hash489727001 둘다 같은 해시 값이 나온다.
//		String str="사과를 주시옵고 당근을 주시옵고 주시옵고 고처주시옥고고처주시옵고 이옵고 이옵고";
//		System.out.println("긴글 해시"+str.hashCode());
//		set=>무작위 객체가 저장되어 있음.=>인덱스 개념이없음=>반복문 활용불가.
		//그렇다면 ,담겨있는 객체를 순차적으로 접근하고자 할때?
		System.out.println("For문==============");
		//1. for문 활용(단 foreach문 만 사용가능)
		for(Student s:hs2) {
			System.out.println(s);
		}
		System.out.println("ArrayList==============");
		//2.ArrayList활용
		ArrayList<Student> list=new ArrayList<Student>();
		list.addAll(hs2);//해시셋을 집어넣음
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//3. HashSet 클래스에서 제공하는 Iterator 반복자를 이용한 방법.
		//hs2에 담겨있는 객체들을 Iterator에 담는 과정.
		System.out.println("Iterator=========");
//		Iterator의 장점
//		1. 컬렉션에서 요소를 제어하는 기능
//		2. next() 및 previous()를 써서 앞뒤로 이동하는 기능
//		3. hasNext()를 써서 더 많은 요소가 있는지 확인하는 기능
		Iterator<Student> it= hs2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	} 
}
