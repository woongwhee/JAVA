package com.kh.practice.map.model.vo;

public class Member implements Comparable<Member>{
	private String password;
	private String name;
	public Member() {}
	public Member(String password, String name) {
		super();
		this.password = password;
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Member m) {
		return this.compareTo(m);
	}
	@Override
	public String toString() {
		return name+"-"+password;
	}
	
}
