package com.kh.chap01_thread.thread;
/* 스레드 생성방법 2(Runnable)
 * 	
 */
public class Thread2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+i);
			//메소드의 해당 쓰레드에 접근하는방법 Thread.currentThread()
		}
	}
}
