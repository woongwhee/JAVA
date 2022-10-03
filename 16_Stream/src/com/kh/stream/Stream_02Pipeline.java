package com.kh.stream;

import com.kh.stream.vo.Product;

import java.util.ArrayList;

public class Stream_02Pipeline {
    /*
        pipeline?
        데이터의 처리결과가 다음단계의 데이터처리에 사용되며 또 다음 데이터처리에 사용되는
        연속적인 처리구조를 의미함(jQuery의 메소드 체이닝과 유사)
        파이프라인은 여러개의 스트림ㅇ르 연결하여 사용하는데
        중간처리스트림 n개 최종처리 스트림 1개로 구성된다.

        중간 처리스트림:필요데이터검색및필터링 및 형변환()
        최종처리 스트림역할:중간처리스트림의 값을 토대로 결과값 반환(sum,min,max,..)

     */

    public static void main(String[] args) {
        ArrayList<Product> plist=new ArrayList<Product>();
        plist.add(new Product("갤럭시 z플립4",135,5,"삼성"));
        plist.add(new Product("갤럭시 z플립3",122,5,"삼성"));
        plist.add(new Product("갤럭시 z폴드3",100,5,"삼성"));
        plist.add(new Product("갤럭시 z폴드4",133,5,"삼성"));
        plist.add(new Product("아이폰14 ProMax",250,5,"애플"));

//        Stream<Product> avgPrice= plist.stream();
        double avg=plist.stream()
                .filter(product -> product.getBrand().equals("삼성"))
                .mapToInt(produce->produce.getPrice())
                .average()
                .getAsDouble();
        System.out.println("삼성폰의 평균가격은?:"+avg);
        //메소드참조(::)더블콜론.
        plist.stream()
                .map(product -> product.toString())
                .forEach(System.out::println);
        /*
         * 람다식을 더욱 간결하게 해주는 방법
         * 람다표현식이 단하나의 메소드만 참조하는 경우 매개변수를 제거해서 사용할수 있도록함.
         * [표현법]
         * 클래스이름 or 변수이름 :: 메소드이름
         */
        plist.stream().map(Product::toString).forEach(System.out::println);
    }
}
