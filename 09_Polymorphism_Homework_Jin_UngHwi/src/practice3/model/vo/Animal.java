package practice3.model.vo;

public abstract class Animal {
	private String name;
	private String kind;

	protected Animal() {
	}

	protected Animal(String name, String kind) {
		this.name = name;
		this.kind = kind;

	}

	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고 , 종류는" + kind + "입니다.";
	}

	public abstract void speak();

}
