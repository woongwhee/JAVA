package com.kh.chap01_beforeVsafter.after.moder.vo;

public class Desktop extends Product {
	private boolean allInOne;

	public Desktop() {
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		//받아온 매개변수 값을 가지고 부모클래스인 product에 있는 필드를 초기화 하는방법
	
		//super키워드를 사용하면 부모클래스의 주소값을 호출할수있다.
		//1. 부모필드에 직접 접근하여 값을 초기화
		//super.brand=brand;
		//부모클래스의 private필드를 protected 로 설정해 놔야 되기때문에 잘사용하지않음.
		//2. 부모클래스의 setter메소드를 호출하여 초기화
		///super.setBrand(brand);
		//3. 부모의 생성자를 호출하여 사용
		super(brand, pCode, pName, price);
		// ※ 이때 부모생성자는 반드시 첫줄에 작성해 줘야된다.
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	//오버라이딩
	//부모클래스에서 정의한 메소드를 자식클래스에서 재정의하는 것을 오버라이딩이라고 한다.
	public String info() {
		return super.info()+" "+allInOne;
	}
}
