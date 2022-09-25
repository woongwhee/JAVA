package com.kh.chap02_set.part01_hashset.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;
	public Student() {}
	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int hashCode() {
		return (name+age+score).hashCode();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o==this) {return true;}//1.주소값이 같은가?=>무조건 같은 객체
		
		if(o.getClass()!=this.getClass()) {return false;}//1.다른 클래스의 객체인가? 그렇다면 거짓
		Student other=(Student) o;
		if(!(this.name.equals(other.name))||this.age!=other.age||this.score!=other.score) {
			return false;
		}
		
		return true;
	}
}
