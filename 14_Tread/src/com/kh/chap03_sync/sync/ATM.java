package com.kh.chap03_sync.sync;

public class ATM implements Runnable{
	private Account acc;
	public ATM(Account acc) {
		this.acc=acc;
	}
	
	@Override
	public void run(){
		while(acc.getBalance()>50){
			int money=(int)(Math.random()*100)+1;
			acc.withdaraw(money);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
	
	
}
