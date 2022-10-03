package com.kh.stream;

import com.kh.stream.vo.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Stream_03Method {
    public static void main(String[] args) {
        ArrayList<Product> plist=new ArrayList<Product>();
        plist.add(new Product("갤럭시 z플립4",135,5,"삼성"));
        plist.add(new Product("갤럭시 z플립3",122,5,"삼성"));
        plist.add(new Product("갤럭시 z폴드3",100,5,"삼성"));
        plist.add(new Product("갤럭시 z폴드4",133,5,"삼성"));
        plist.add(new Product("아이폰14 ProMax",250,5,"애플"));
        //stream에서 원하는 값을 얻어내기 위한 메소드들
        //1)filter:조건에 맞는 값만 추려주는 메소드.
        String[]foods={"마라탕","마라탕","마구로","마시멜로우","김밥","김치찜","삼겹살","짬뽕","떡볶이"};
        //음식 이름이 마로 시작하는 음식 추리기
        //Arrays.asList()들어온 배열을 리스트화시킴(메소드 사용은불가능 [가능한데?])
        System.out.println("------filter----");
        List <String>arr=Arrays.asList(foods);
        arr.stream().filter(food->food.charAt(0)=='마').forEach(System.out::println);
        //2)distinct():중복값을 제거해주는 메소드
        System.out.println("------distinct----");
        arr.stream().distinct().filter(food->food.charAt(0)=='마').forEach(System.out::println);
        //3)map관련 메소드들
        //3_1)mapXXX:현재 요소를 해당 자료형의 값으로 대체하여 스트림변화

        System.out.println("------맵----");
        arr.stream().map(food->food+"맛있다.").forEach(System.out::println);
        //3_2)flatMapxxx:특정요소가 여러개의 요소로 대체되는 스트림 변환.
        System.out.println("-----flatMap---");
        List<String> arr2=Arrays.asList("마라탕 짬뽕 훠궈 양꼬치");
        arr2.stream().flatMap(f->Arrays.stream(f.split(" "))).forEach(System.out::println);
        //3_3)asXXXStream,boxed():형변환 관려네메소드
        int[] iArr={1,2,3,4,5,6};
        Arrays.stream(iArr)
                .asDoubleStream().forEach(System.out::println);
        Arrays.stream(iArr)
                .boxed().forEach(i-> System.out.printf("%s ",i.hashCode()));

        //4)정렬 sorted()정렬.
        //5)루프메소드
        //5-1)forEach:최종처리 스트림, 마지막에 호출해야됨
        //5-2)peek:중간처리메서드, 중간에 호출해야 정상작동함.

//        System.out.println("\npeek");
//        List<String> list=Arrays.asList(foods);
//        Stream<String> firstStream=list.stream();
//        firstStream.distinct().filter(food->food.length()==3);
//        System.out.println("남아있는음식은?");
//        System.out.println(firstStream.peek(food->System.out.println("남아있는 음식은?"+food)).count());
        //파이프라인을 끊어서 사용해 보기위해 시도해봤지만 메소드 체이닝이 끊기면 스트림이 자동으로 닫혀서 사용 할 수 없었다.
        //떄문에 위와같이 사용하기 위해서는 결과값을 담기위한 새로운 스트림 객체를 선언해야 된다.
        // 이렇게 해도 안된다.
        //case1
//        List<String> list=Arrays.asList(new String[]{"마라탕","마라탕","마라탕","마시멜로우","김밥","김치찜","삼겹살","짬뽕","떡볶이"});
//        Stream<String> firstStream=list.stream();
//        Stream<String> secondStream=firstStream.distinct().peek(System.out::print).filter(food->food.length()==3);
//        System.out.println("남아있는음식은?");
//        System.out.println(secondStream.peek(food->System.out.print(food+"(2)")).count());
        //실행순서가 예측처럼 안된다.
        //마라탕->마라탕두번째스트림->마시멜로우->김밥->김치찜->김치찜두번째스트림->삼겹살->삼겹살두번째스트림->짬뽕->떡볶이->떡볶이두번째스트림->4;

    }

}
