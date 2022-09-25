package com.kh.chap01_thread.run;

import com.kh.chap01_thread.thread.Thread1;
import com.kh.chap01_thread.thread.Thread2;

public class Run {
	public static void main(String[] args) {
		/*
		 * 프로세스 -현재 동작하고있는 프로그램
		 * 스레드 -한개의 프로세스내에서 실제로 작업을 수행하는 소단위
		 * - 모든 프로세스에는 메인 스레드가 존재하여 작업을 수행한다.
		 *
		 * 멀티스레드 -한개의 프로그램을 실행하고 그 내부적으로 여러 작업을 처리하는것 
		 * -멀티스레드의 장점
		 * 1) 자원을 보다 효율적으로 사용
		 * 
		 * 2) 사용자 입장에서 일처리가 빠르게 보인다.
		 * 
		 * 3) 작업이 분리되어있음.
		 * 
		 */
//		for (int i = 0; i < 100; i++) {
			//생성방법 1. Thread 클래스 상속받기
			//객체 생성후start()메서드를 호출해야됨
			// start에서 호출안 하면 메인쓰레드에서 해당 메소드를 호출함
			// 
			Thread1 th1=new Thread1();
			th1.setName("쓰레드 1 ");
			th1.start();
			//생성방법 2. Runable 인터페이스 구현하기
			// 쓰래드 클래스에 Runable 구현체 전달하기
			Thread th2=new Thread(new Thread2());//메인스레드로나오는데?
			th2.setName("쓰레드 2 ");
			th2.start();
			// 생성방법 3. 익명클래스이용
			//굳이 클래스를 만들 필요없이 1회용으로만 만들자고 할때 사용.
			new Thread(){
				@Override 
				public void run(){
					for (int i = 0; i < 100; i++) {
						System.out.println(Thread.currentThread().getName()+" "+i);
					}
				}
				}.start();			
			//		}
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println("메인 쓰래드 출력"+i);
//		}
		System.out.println("메인 스레드 종료");
		// 메인스레드가 종료 되더라도 하위 스레드는 종료되지 않는다.
		// 즉 프로세스도 종료되지 않는다는것이다.
		
		
		
	}
	
}
