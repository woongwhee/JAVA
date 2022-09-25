package com.kh.chap02_network.run;

import com.kh.chap02_network.tcp.Client;
import com.kh.chap02_network.tcp.Client2;

public class ClientRun {
	public static void main(String[] args) {
//		Client c =new Client();
		Client2 c2 =new Client2();
		c2.clientStart();
	}
}
