package com.kh.variable;

public class E_Print {
	public void printfTest() {
		/*
		 * println print printf 자바에는 메소드가 있다 1.System.out.printf("",변수,변수); 출력하는 변수 간에
		 * 타입이 달라도format에 맞춰 %d(정수)%f(실수) %c(문자) %s(문자열) 등 을 이용해 출력 할 수 있다. 
		 * %주의% 
		 * 1. format의 타입과 거기에 해당하는 변수의 타입은 같아야한다 
		 * 2. format의 개수와 변수의 개수가 같아야한다..
		 */
		int iNum1 = 10;
		int iNum2 = 20;

		System.out.println("iNum1 :" + iNum1 + "\niNum2 :" + iNum2);
		System.out.printf("iNum1 : %d iNum2 : %d\n", iNum1, iNum2);

		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		System.out.printf("%d + %d = %d", iNum1, iNum2, iNum1 + iNum2);
		
		//%뒤에 숫자가 오면 그만큼 빈칸을 확보한다
		//음수가 오면 뒤에서 그만큼을 확보함
		System.out.printf("%5d %-5d",iNum1,iNum2);
		//5칸만큼 확보해 뒷열을 맞출수있다.
		System.out.printf("%5d\n",500);
		System.out.printf("%5d\n",3000);
		System.out.printf("%5d\n",18000);//
		System.out.printf("%5d\n",1);
		//확보한 칸보다 긴 변수가 오면 삭제되지 않고 넘친다.
		System.out.printf("%5d\n",5000000);
		//실수 테스트
		double dNum1=1.23456789;
		double dNum2=1.23456789;
		
		System.out.printf("dNum1 : %f\n",dNum1);//1.234568로 출력됨
		//	뒤로오는 소수점은 반올림된다. 
		//%f는 기본적으로 %.6f 로 출력된다.
		System.out.printf("dNum1 .8 : %.8f\n",dNum1);
		System.out.printf("dNum1 .1 : %.1f\n",dNum1);
		System.out.printf("dNum1 .4 : %.4f\n",dNum1);
		
		char ch = 'a';
		String str ="Hello";
		
		System.out.printf("%c %s\n",ch,str);
		//%C %S를 쓰면 대문자로 바뀜
		System.out.printf("%C %S\n",ch,str);
		
		//System.out.printf("%d 음??돼?");   안됨
		System.out.printf("%d 음??돼?\\n",2);// 가능
		System.out.printf("%d 음??돼?\n",1,1);//되는데 두번째껀 안나옴
		System.out.printf("%s\n","음??돼?");// 가능
		System.out.printf("%s\n",ch);
		System.out.printf("%c\n",65);
		System.out.printf("%15.5s \n","난 살아있다.");
		System.out.printf("%15s\n","난 살아있다.");
		System.out.printf("20%% 할인중!");
		
	}
}
