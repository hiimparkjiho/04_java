package com.ohgiraffers.section06.ternary;

public class Qui {
    public static void main(String[] args){
        // A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 30만원 , 와인 : 36만원 , 고량주 : 27만원 이다.

        // 마트의 주당 평균 총 매출이 140 만원일때

        // 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),

        // 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.

        // 다음과 같은 양식을 가진다.


        // A마트 이번 주 주류 당 평균 실적은 ()만원이고, 세금을 제외한 총 매출은 ()만원이며 세금은 ()만원을 냈다.

        // 이번 주 총 매출은 평균 총 매출보다 높다/낮다. (삼항연산자 사용)
        int soju = 45;
        int beer = 30;
        int wine = 36;
        int gor = 27;

        double tax = 0.1;

        int sum = soju + beer + wine + gor;

        double average = sum / 4;

        double qwe = sum - (sum * tax);



        System.out.println(qwe);

        System.out.println("A마트 이번 주 주류 당 평균 실적은" + average + "세금을 제외한 총 매출은 " + sum + "세금은 " + (sum * 0.1) + "이다");
        String result = (sum > 140)? "평균보다 높다":"낮음";
        System.out.println(result);

    }
}
