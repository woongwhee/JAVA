package com.kh.chap02_byte.run;

import com.kh.chap02_byte.dao.FileByteDao;

public class Run {
/* 바이트 기반스트림
 * 바이트스트림 : 1byte 단위로 입출력할수 있는 좁은 통로다(xxinputStream/xxoutputStream)
 * 기반스트림 :외부매체와 직접적으로 연결되는 통로.
 * 
 *  "바이트기반스트림" : 외부매체를 지정ㅎ고 그 외부매체와 직접적으로 연결되는 1byte단위의 통로를 만들겠다.
 *  
 *  xxxinputstream: xxx매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 가지고 오겠다. 읽어오겠다)
 *  xxxoutputstream: xxx매체로부터 데이터를 출력받는 통로(외부매체로부터 데이터를 내보내겠다. 쓰겠다.)
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		FileByteDao fd=new FileByteDao();
		fd.fileRead();
	}
}
