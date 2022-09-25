package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class Run {
	/*
	 * 컬렉션(collection)
	 * 
	 * 자료구조가 내장되어있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는프레임워크다. 대부분의 자료구조가 포함되어있 리스트 스택 큐 덱
	 * 트리 그래프 등
	 *
	 * 데이터들이 새로이 추가되거나 삭제가 되거나 수정이되는 기능 (알고리즘활)들이 이미 정의되어있는 틀이 colletion입니다.
	 * 
	 * 배열과 컬렉션의 차이
	 * 
	 * -배열의 특징 1.크기가 정해저있다. 2.인덱스를 활용하여 빠르게 조회가가능하다. 3.데이터를 중간에 변경하는게 불가능
	 * 
	 * -컬렉션의 장점. 1. 크기에 제약이 없다. =>중간에 값을 추가하거나 삭제하는 경우 값을 때겨주는 코드가 이미 메소드로정의 되어있다.
	 * 2. 중간에 값을 추가하거나 삭제하는 경우 값을 땡겨주는 코드가 이미 메소드로 정의되어있다. 3. 기본적으로 여러타입의 데이터를 저장할 수
	 * 있음(제너릭 설정을 통해서 한 타입의 데이터들만 들어올수 있게끔도 가능.)
	 *
	 * 방대한 데이터를 단지 담아만두고 조회할꺼면 =>배열사용 방대한 데이터를 빈번하게 추가 , 삭제, 수정할거 같다면 => 컬렉션.
	 *
	 *
	 * 
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);// 빈리스트는 [] 가나
		// 1. add(E e): 해당 리스트 끝에 전달된 e를 추가시켜주는 메소드 자료형을 통일할 필요도없다?!
		list.add(new Music("Out of Time", "The Weekend"));
		list.add(new Music("Attention", "new jeans"));
		list.add(new Music("Pycho", "RedVelvet"));
		list.add("여기까지.");
		list.add(10);
		int arr[] = new int[100];
		list.add(arr);// 배열까지 들어
		System.out.println(list);//
		// 특징
		// 순서가 유지되면서 추가 크기에 제약이 없다. 다양한타입의 값이 추가가능하다.
		// 2. add(int index,E e)
		// 해당 인덱스 에 비집고 들어가는 메소
		list.add(1, new Music("Black Mamba", "espa"));
		System.out.println(list);//
		// 3.set(int index,E e)리스트의해당인덱스를 전달되는 값으로 변경시켜주는 메소드
		System.out.println(list);//
		// 4.list.remove();//해당 인덱스에있는 노드를 제거한다. 그리고 해당 노드를 리턴한다.

		System.out.println(list);//
		System.out.println(list.size());// 멤버변수를 반환해주는 단순한 메소드
		// 에드나 리무브를하면 자동으로사이즈를 변경하는식;
		// Music m=list.get(0);
		Music m = (Music) list.get(0);// 오브젝트 객체로 저장되어있다.
		int a = (Integer) list.get(5);
		System.out.println(m);
		System.out.println(a);
		// 어떤 인덱스에 어떤 클래스의 자료가 담겨 있는 정확하지 않으니 classCastException이 이러나기 쉽다.
		// 때문에 제네릭 <> 를 통해 객체의클래스를 고정해둬서 사용하는것을 권장한다.
		ArrayList<Music> mList = new ArrayList();
		mList.add(new Music("Black Mamba", "espa"));
		mList.add(new Music("Black Mamba", "espa"));
		mList.add(new Music("Black Mamba", "espa"));
		mList.add(new Music("Black Mamba", "espa"));
		mList.add(new Music("Black Mamba", "espa"));
		mList.add(new Music("Black Mamba", "espa"));
		mList.add(new Music("Black Mamba", "espa"));
		mList.add(new Music("Black Mamba", "espa"));
		Music m1 = mList.get(0);
		System.out.println(m1);
		for (int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i));
		}
		for (Music ms : mList) {// 향상된 포문도 사용가능하다 자동으로 get메소드를 호출해
			System.out.println(ms);
		}

		// 7. subList(int index1,int index2);1번 인덱스부터 2번인덱스전까지 잘라내는 메소
		List<Music> sub = mList.subList(0, 3);
		// 8.addAll(collection c) :해당 리스트에 다른 컬렉션에 있는 데이터들을 째로 추가해주는 메소드
		mList.addAll(sub);
		System.out.println(mList);
		// 9.isEmpty() 빈 리스트 인지 묻는 메소드 빈값이면 true 아니면 false;
		// 10.clear() 리스트를 비워주는 메소드;
		System.out.println(mList.isEmpty());
		mList.clear();
		System.out.println(mList.isEmpty());
		//11.sort()정렬//객체를 정렬하는방법 comparable<> 인터페이스를 재정의해줘야 된다.
		
	}
}
