package main.java.com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application03 {
    public static void main(String[] args){
        /*
        * TreeSet 클래스
        * Tree Set 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
        * 이전 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
        * jdk 1.2 부터 제공되고 있으며 Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지하는 것이
        * 다른 점이다.
        * */

        TreeSet<String> test = new TreeSet<>();
        Set<String> test2 = new TreeSet<>();

        test.add("java");
        test.add("oracle");
        test.add("jdbc");
        test.add("html");
        test.add("css");

        System.out.println(test);

        Iterator iter = test.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Object[] arr = test.toArray();
        for (Object obj: arr) {
            System.out.println(obj);
        }

        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size() < 6){
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println(lotto);
    }
}
