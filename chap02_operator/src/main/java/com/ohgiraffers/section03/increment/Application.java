package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args){
        // 증강연산자
        /*
        * ++ X / X++  : 앞 또는 뒤에 있는 피연산자의 값을 1씩 증가시킨다.
        * --X / X-- : 앞 또는 뒤에 있는 피연산자의 값을 1씩 뺀다
        *
        * */
        int num = 10;
        int result = 1;
        result = result + num++;
        System.out.println(result);
    }
}
