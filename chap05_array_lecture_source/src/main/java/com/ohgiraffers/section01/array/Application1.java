package main.java.com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] main){
        /*
        * 배열이란?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다
        * 배열은 heap영역에 new 연산자를 이용하여 할당한다..
        *
        * 배열의 사용 이유
        * 1. 연속된 메모리 공간으로 관리할 수 있다.
        * 2. 반복문을 이용한 연속 처리가 불가능하다.
        * */

        /*
        * 배열의 필요성을 느낀 부분
        *
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        System.out.println(sum);

        //sum = 10;
        //int[] array = new int[sum]; // 배열의 길이는 10

        sum = 0;
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        sum += array[0];
        sum += array[1];
        sum += array[2];
        sum += array[3];
        sum += array[4];
        System.out.println(sum);

        sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);


    }
}
