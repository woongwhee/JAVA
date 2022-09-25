package com.kh.chap03_map.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.model.vo.Snack;

public class Run {
	public static void main(String[] args) {
		//Map은 Collection을 구현한 클래스가 아니다.
		//값을 집어넣을려면 push로 key+value세트로 추가해 줘야한다.  
		//
		HashMap<String,Snack> hm=new HashMap<>();
		//1.put(K key,V value)=>map 공간에 key+value 세트로 추가해주는 메소드.
		hm.put("다이제",new Snack("초코맛",750));
		hm.put("새우깡",new Snack("매운맛",5000));
		hm.put("포테이토칩",new Snack("어니언맛",5000));
		hm.put("칸쵸",new Snack("초코맛",3000));
		hm.put("칸쵸",new Snack("빨간맛",3000));//이경우 덮어씌워진다.
		System.out.println(hm);
		// 순서유지가안된다. 출력을하면 key와 value가 묶여서 나온다.
		// 벨류값은 상관이없지만 key값은 중복이안되다.
		//2. get(Object key):V=> Map에서 해당 키 값의 value값을 돌려주는 메서드.
		System.out.println(hm.get("노"));
		//3. size()-> map에 담겨있는 개수.
		System.out.println(hm.size());
		//4. replace(K key, V value)=> 맴에 해당하는 key값을 찾아 새로 전달된 value로 변경시켜주는 메소드.
		hm.replace("포테이토칩",new Snack("단짠단짠",500));
		System.out.println(hm.get("포테이토칩"));
		hm.replace("포테이토침",new Snack("단짠단짠",500));
		System.out.println(hm);//
		//5. remove(Object key)=>맵에 해당하는 key를 찾아 key+value 전체 지워주는 메소드.
		hm.remove("칸쵸");
		System.out.println("=================");
		
		//ArrayList List=new ArrayList(hm) 해시 맵이 컬랙션인터페이스 소속이 아니라사용이 불가능한 방법
		//for each문  그대로 사용불가.
		//Iterator it=hm.iterator();//해시맵 그대로 사용불가
		//Map을 Set으로 바꿔주는 메소드를 사용(2개)
		//HashMap=>set계열 =>Iterator;
		//hm.values() values값만 컬랙션으로 반환
		Set<String> keySet=hm.keySet();//키를 얻어오는 방법
		Iterator<String> it= keySet.iterator();
		//Iterator<String> it=hm.keySet(i).iterator();
		
		while(it.hasNext()) {
			String key= it.next();
			Snack value=hm.get(key);
			System.out.println(key+value);//키값만 나옴
			
			
		}
		//2. entrySet()이용하는방법.
		//1)해수맵에 있는 모든 key+value를 set에 담는방법(집합형태.)
		
		Set<Entry<String,Snack>>entrySet=hm.entrySet();
		Iterator<Entry<String,Snack>>itEntry=entrySet.iterator();
		
		while(itEntry.hasNext()) {
			Entry<String,Snack>entry =itEntry.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getKey());
		}
		for (Entry<String, Snack> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("============");
		System.out.println(hm.values());//리턴값이 컬랙션~
		
	}
}
