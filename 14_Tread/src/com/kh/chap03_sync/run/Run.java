package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.ATM;
import com.kh.chap03_sync.sync.Account;

public class Run {
	public static void main(String[] args) {
		Account acc=new Account();
		Runnable run1=new ATM(acc);
		Runnable run2=new ATM(acc);
		Thread th1=new Thread(run1 , "에이티엠원");
		
		Thread th2=new Thread(run2 ,"에이티엠투");
		th1.start();
		th2.start();
		//동기화가 되어있지 않아 데이터가 섞인다.
		//즉 앞에 쓰레드가 실행되는동안 다른 쓰레드가 같은 자원에 접근하면 안된다(동기화 필요)
		//동기화란?
		//멀티쓰레딩 프로그램에서 스레드간의 공유자원에 대한 처리를 의미한다.
		//공유자원에 대한 사용순서를 정해주는것. 공유자원에 대한 Lock을 획득한 스레드만 접근이 가능하다.
		
		//동기화 방법
		//1. synchronize 
	}
}
