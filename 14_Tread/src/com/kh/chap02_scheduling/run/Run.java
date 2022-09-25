package com.kh.chap02_scheduling.run;

import com.kh.chap02_scheduling.schedule.Car;
import com.kh.chap02_scheduling.schedule.Plane;
import com.kh.chap02_scheduling.schedule.Tank;

public class Run {
	public static void main(String[] args) {
		Thread th1=new Thread(new Car());
		Thread th2=new Thread(new Tank());
		Thread th3=new Thread(new Plane());
		th1.setName("자동차");
		th2.setName("탱크");
		th3.setName("비행기");
		th1.setPriority(Thread.MIN_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		
		//주종관계 설정
		// 메인스레드 종료시 다른스레드를 종료시킬려면 setDaemon키워드를 사용해야된다.
		// 주의점은 스레드중 한개라도setDaemon으로 설정시 스레드에 setDaemon
		// 
		th1.setDaemon(true);
		th2.setDaemon(true);
		th3.setDaemon(true);
		th1.start();
		th2.start();
		th3.start();
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
		//시작순서는 우선순위와 다르다
		
		//종료순서는 우선순위가 높은순으로 끝난다.
}
}
