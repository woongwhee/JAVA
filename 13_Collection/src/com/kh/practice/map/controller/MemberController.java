package com.kh.practice.map.controller;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private TreeMap<String, Member> map= new TreeMap<String,Member>();
//	public MemberController() {
//		map.put("aaaaa",new Member("1q2w3e4r","김민수"));
//		map.put("bbbbb",new Member("1q2w3e4r","김민수"));
//		map.put("ccccc",new Member("1q2w3e4r","신민수"));
//	}//코드 확인용 생성자
	public boolean joinMembership(String id, Member m) {
		if(map.get(id)==null) {
			map.put(id, m);
			return true;
		}else {
			return false;
		}
	}
	
	public String logIn(String id,String password) {
		String result =null;
		if(map.get(id)!=null&&map.get(id).getPassword().equals(password)) {
			result=map.get(id).getName();
		}
		return result; 
	}
	public boolean changePassword(String id,String oldPw,String newPw) {
		if(map.get(id)!=null&&map.get(id).getPassword().equals(oldPw)) {
			map.put(id, new Member(newPw, map.get(id).getName()));
			return true;
		}
		return false;
	}
	public void changeName(String id,String newName) {
		map.get(id).setName(newName);
	}
	public TreeMap<String,Member> sameName(String name) {
		TreeMap<String, Member> result= new TreeMap<String,Member>();
		Set<Entry<String,Member>> entry=map.entrySet();//Member부터 접근하려면 set으로 변경해야된다?
//		for (Entry<String, Member> entry2 : entry) {
//			if(entry2.getValue().getName().equals(name)) {
//				result.put(entry2.getKey(),entry2.getValue());
//			}
//		}
		Iterator<Entry<String,Member>>  it =entry.iterator();
		while(it.hasNext()) {
			Entry<String,Member> entry3=it.next();
			if(entry3.getValue().getName().equals(name)) {
				result.put(entry3.getKey(),entry3.getValue());
			}
		}
		
		return result;
		
	}	
	
}
