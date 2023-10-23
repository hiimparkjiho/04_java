package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args){
        // 5명의 자바 점수를 정수로 입력받아서 함계와 평균을 실수로 구하는 프로그램을 만들어주세요.

        Scanner scan = new Scanner(System.in);

        int[] score = new int[5];
        int sum = 0;
        for(int i = 0; i < score.length; i++){
            System.out.println(i + 1 + "번째 자바 점수를 입력해주세요 : ");
            score[i] = scan.nextInt();
            sum += score[i];
        }
        double average = sum / score.length;
        System.out.println("평균 점수 : " + average);
    }
}
