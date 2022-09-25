package com.kh.chap02_abstractandinterface.part01_interface.model.vo;

public abstract class Person {
	private String name;
	private String weight;
	private int health;

	public Person() {
	}

	public Person(String name, String weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", health=" + health + "]";
	}
	public abstract void eat();
	public abstract void sleep();
}
