package com.kh.stream;

import com.kh.stream.vo.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_01Test {
    /*
        스트림?
        스트림은 배열 및 컬랙션에 저장된 요소에 하나씩 접근해서 해당 값을 람다식으로 처리하는 반복자
        요소를 검색 및 필터링을하고 값을 처리하는데 목적이있다.

        스트림 특징
        1) 메서드의 배개변수에 람다식 사용가능
        2) 식이 간결해짐=> enum시간에 람다식 쓰기전 메서드 vs사용한후 메서드 비교
        3) 컬렉션 및 배열을 통한 연산결과를 언어오기 용이함.
   */
    public static void main(String[] args) {
        String[] sArr={"삼겹살","깻잎","쌈장","마늘"};
        //1)stream()메소드를 통한 스트림 객체선언
        Stream<String> strStream= Arrays.stream(sArr);
        //2)forEach반복문을 통해 배열요소에 하나씩접근;
        strStream.forEach((e)-> System.out.println(e));
        //int형 배열을 선언하여 연산테스트
        int[] iArr={1,2,3,4,7,8,9};
        //1)stream()메소드를 통한 스트림 객체선언
        IntStream istream=Arrays.stream(iArr);
        //2)forEach반복문을 통해 배열요소에 하나씩 접근;
        int sum=0;//지역변수
        String test="지역변수";
        final int sum2=10;
//        istream.filter(e->e%2==1).forEach((num)->
//                (System.out.println(num);
//                        System.out.println(sum2+num);)
//                        //sum+=e;//람다식에서 지역변수를 사용하려면 그 값이 final이거나 사실상 값이 할당된 후 바뀌지 않아서 final처럼 사용되는 경우에만 가능.
//                        //람다 캡쳐링 즉 ,지역변수의 값이 람다식 내부에서 바뀌면 안됨.
//                );

        //컬랙션에서의 stream 상요법
        ArrayList<Product> plist=new ArrayList<Product>();
        plist.add(new Product("갤럭시 z플립4",135,5,"삼성"));
        plist.add(new Product("갤럭시 z플립3",122,5,"삼성"));
        plist.add(new Product("갤럭시 z폴드3",100,5,"삼성"));
        plist.add(new Product("갤럭시 z폴드4",133,5,"삼성"));

        Stream<Product> proStream= plist.stream();

        proStream.forEach(product -> System.out.println(product));

    }
}
