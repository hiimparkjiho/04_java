package main.java.com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args){
        /*
        * 랜덤한 카드를 한 장 뽑아서 출력해보자.
        * */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] charNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int shapesNum = (int)(Math.random() * shapes.length);
        int num = (int)(Math.random() * charNumber.length);

        System.out.println(shapes[shapesNum] + num);

    }
}
