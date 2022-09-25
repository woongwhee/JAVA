package com.kh.chap01_beforeVsafter.before.run;

import com.kh.chap01_beforeVsafter.before.moder.vo.Desktop;
import com.kh.chap01_beforeVsafter.before.moder.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.before.moder.vo.Tv;

public class Run {
	public static void main(String[] args) {
		Desktop d=new Desktop("samsung","DM500SEA-AC24W","Slim Pentium",1_000_0000,true);
		SmartPhone sp=new SmartPhone("samsung", "SM-S901NIDEKOO", "갤럭시 S22", 999_900, "자급제");
		Tv t=new Tv("LG", "27ART10AKPL", "LG스탠바이미", 1_040_000,27);
		/*매클래스마다 중복된 코드를 일일히 기술해두게되면 수정과 같은 유지보수성이 떨어짐
		 * ex 빌드명수정 새로운 필드추가
		 * "상속 "이라는 개념을 적용시켜 
		 * 각클래스마다 중복되는 필드,메소드들을 단 한번만  다른 클래스에작성하도록하자
		 * 그클래스를 가저다쓰는 방식이 훨씬 간편하다
		 * 
		 * 
		 * 
		 */
	}
}
