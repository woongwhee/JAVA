package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedExcpetion;
import com.kh.exception.controller.B_CheckedException;
import com.kh.exception.controller.C_CustomException;

public class Run {
/* 에러 종류
 * -시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러-> 소스코드로 해결안됨
 * -컴파일 에러 : 소스코드상의 문법적인 문제로 발생한느 에러=>소스코드로 수정으로 해결
 * -런타임 에러 :소스코드상으로는 문제없지만, 프로그램 실행중 발생하는 에러.=>사용자의 잘못이거 ,개발자가 예측하지 못한상황
 * -논리에러 : 소스코드상의 문법적인 문제도 없고 실행했을때도 굳이 문제가 되지 않지만 프로그램의 의도상 맞지 않은 경우.
 * 
 *	시스템 에러를 제외한 컴파일 에러 런타임 에러 논리 에러와 같은 비교적 덜 심각한 것들을 가지고 "예외처리" 작업을 진행한다.
 *
 * 소스코드상 "예외"가 발생했을 경우를 대비해서 "처리"하는 방법을 정의해두는것을 예외처리 라고함
 * 
 * 예외처리를 해야하는 이유 : 예외가 발생했을떄 [프로그램이 강제로 종료되는 것]을 막기위함.
 *
 */
/*	
 *RuntimeException
 *- 프로그램 실행시 발생되는 예외들
 * 
 *Runtime Exception의 자식클래스들.
 *-ArrayIndexOutofBoundsException: 배열의 부정확한 인덱스로 접근할때 발생하는예외
 *-NegativeArraySizeExceptio : 배열의 크기를 음수로 지정할 경우 발생하는 예외
 *-ClassCastException:허용할 수 없는 형변환이 진행될 경우 발생하는 예외.
 *-NullPointerException : 레퍼런스가 아직 null임에도 불구하고 접근하려고 할 때 발생하는 예외.
 *-ArthemticException: 나누기 연산시 0으로 나눌때 발생하는 예외.
 *-......
 *
 * =>이러한 RuntimeException과 관련한 예외는 충분한 예측가능한 상황이기 때문에
 *   예외 자체가 발생이 안되게끔 조건문으로 해결 가능하긴함.
 *   굳이 예외처리를 할 필요가 없음.
 *  !모든 오류를 예외처리로 잡으려고 하지 않기 오류와 예외는 다르다.
	정상적으로 작동 해야하는 것은 성능을 위해 예측이 가능한 경우엔 if 문으로 걸러내는 것이 좋다.
	ex) 사용자 입력 제대로 받기. 뭐 2글자 이상 못받으면 다시 받게 한다던지 등등
	분산처리, 네트워크 문제 이런건 예측할 수 없는 경우에 고장이 나기도 한다.
	논리적으로 예측이 어려운 경우엔 예외를 쓰는 것이 좋다.
	
	 * 예외 처리방법
	 *1. try catch문을 이용
	 *2. throws를 이용(떠넘기기)
	 *3. throw를 이용(에러강제발생)
	 *
	 *
	 *
 */
	public static void main(String[] args) throws IOException{
		
		A_UncheckedExcpetion au=new A_UncheckedExcpetion();
//		au.method3();
		B_CheckedException bc=new B_CheckedException();
//		bc.method2();
		
//		throw new C_CustomException(""); 커스텀 에러문구
		
	}
	
	
}