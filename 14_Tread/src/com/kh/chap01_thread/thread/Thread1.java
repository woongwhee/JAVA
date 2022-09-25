package com.kh.chap01_thread.thread;

public class Thread1 extends Thread{
	
	//작업하고자 하는 코드를 반드시 run클래스에 정의해야된다.
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(getName()/*스레드의 이름을 반환하는 메소드 */+i);
		}
	}
}
