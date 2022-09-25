package com.kh.chap04_class.model.vo;
/* 클래스에서 사용 가능한 접근제한자 종료: public default(생략가능)
 * default: 같은 패키지에서만 접근가능,
 *
 * 
 * 
 */

public class Person {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;

	public Person() {
	}

	public void setId(String id) {//매개변수명은 필두부와 동일하게
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	};

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
	public String info(){
		return id+" "+pwd+" "+name+" "+age+" "+gender+" "+phone+" "+email;
	}
	public String info2(){
		return "Id : "+id+"\nPassWord : "+pwd+"\nName : "+name+"\nAge : "+age+"\nGender : "+gender+"자\nPhone : "+phone+"\nEmail : "+email;
	}
}
