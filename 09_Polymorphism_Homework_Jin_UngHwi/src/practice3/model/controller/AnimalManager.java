package practice3.model.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] aArr = new Animal[100];
		for (int i = 0; i < aArr.length; i++) {
			int random = (int) (Math.random() * 10) + 1;
			if (random > 5) {
				if (random == 6) {
					aArr[i] = new Cat("나비" + i, "페르시안고양이", "지붕 위", "흰색");

				} else if (random == 7) {
					aArr[i] = new Cat("나비" + i, "삵", "자동차 아래", "노랑색");

				} else if (random == 8) {
					aArr[i] = new Cat("나비" + i, "호랑이", "숲", "얼룩무늬");
				} else {
					aArr[i] = new Cat("나비" + i, "사자", "사바나 초원", "주황색");
				}
			} else {
				if (random % 2 == 0) {
					aArr[i] = new Dog("백구" + i, "진돗개", 15);
				} else {
					aArr[i] = new Dog("찹쌀개" + i, "삽살개", 16);
				}

			}
			aArr[i].speak();

		}	
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출

	}
}
