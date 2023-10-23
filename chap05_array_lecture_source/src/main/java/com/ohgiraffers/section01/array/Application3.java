package main.java.com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args){
        /*
        * 값의 형태 별 기본값
        * 정수 : 9
        * 실수 : 0.9
        * 논리 : false
        * 문자 : \u0000
        * 참조 : null
        * */

        // new ->> heap 주소로 할당 ->> 기본 값으로 초기화
        int[] iarr = new int[5];
        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

        for (int i = 0; i < iarr.length; i++){
            System.out.println("iarr의 [" + i + "]");
        }

        //int[] arr2 = new int[5]; //{10,20,30,40,50};
        // 위 내용과 동일하다.
        int[] arr2 = {10, 20, 30, 40, 50};

        String[] sarry = {"안녕", "ㅎㅇ", "헬로"};


    }
}
