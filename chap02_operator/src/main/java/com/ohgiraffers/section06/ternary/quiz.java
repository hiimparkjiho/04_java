package com.ohgiraffers.section06.ternary;

public class quiz {
    public static void main(String[] args){
        // A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 30만원 , 와인 : 36만원 , 고량주 : 27만원 이다.

    // 마트의 주당 평균 총 매출이 140 만원일때

    // 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),

    // 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.

    // 다음과 같은 양식을 가진다.


    // A마트 이번 주 주류 당 평균 실적은 ()만원이고, 세금을 제외한 총 매출은 ()만원이며 세금은 ()만원을 냈다.

    // 이번 주 총 매출은 평균 총 매출보다 높다/낮다. (삼항연산자 사용)
        System.out.println("==================1번 문제======================");
        int soju = 45;
        int beer = 30;
        int wine = 36;
        int gor = 27;

        int sum = 45 + 30 + 36 + 27;
        double average = sum / 4;
        double tax = average * 0.1;
        double sales = average - tax;
        int avr = 140;

        System.out.println("A마트 이번 주 주류 당 평균 실적은 " + (int)average + "만원이고, 세금을 제외한 총 매출은 " + sum + " 만원이며 세금은 " + (int)tax + "만원을 냈다.");
        String result1 = (sum > 140)? "높다" : (sum < 140)? "낮다" : "평균보다 낮다";
        System.out.println("이번 주 총 매출은 평균 총 매출보다 " + result1);

        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        // 조건
        // 삼항 연산자를 사용하시오

        int passenger1 = 113;
        int passenger2 = 127;

        String quiz21 = (passenger1 > 120)? "탑승" : (passenger1 < 120)? "탑승 불가" : "탑승 불가능합니다";
        String quiz22 = (passenger2 > 120)? "탑승" : (passenger2 < 120)? "탑승 불가" : "탑승 불가능합니다";

        System.out.println("==================2번 문제======================");
        System.out.println("키가 " + passenger1 + "cm 이므로 " + quiz21);
        System.out.println("키가 " + passenger2 + "cm 이므로 " + quiz22);

        //삼항연산자를 이용해 1이 4보다 작으면 바보 . 4보다 크면 천재를 출력

        System.out.println("==================3번 문제======================");
        String quiz3 = (1 < 4)?"바보" : (1 > 4)? "천재":"천재" ;
        System.out.println(quiz3);

        System.out.println("==================4번 문제======================");
        //1. ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것
        char ch1 = 'X';
        char ch2 = 'Z';

        System.out.println(( (int)ch1 == (int)ch2));

        System.out.println("==================5번 문제======================");
        //2. 자신의 나이를 집어넣고 20 보다 작으면 미성년자, 20보다 높으면 성인이 출력되도록 한다

        int age = 26;
        String quiz5 = (age > 20)? "성인" : (age < 20)? "미성년자":"미성년자";
        System.out.println(quiz5);


        System.out.println("==================6번 문제======================");
//        3.길동이의 첫달 월급은 100만원이다
//        짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
//        길동이 연봉은?

        double evenBonus = (100 * 0.1) * 6;
        double oddBonus = (100 * 0.15) * 6;
        //System.out.println(oddBonus);
        double sum2 = (100 * 12) + evenBonus + oddBonus;
        System.out.println((int) sum2);

        System.out.println("==================7번 문제======================");
//        한 축구 구단의 직원 수는 약 1892명 이다.
//        올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수를 15% 줄여야 한다.
//        17위 이상을 기록하면 구단의 직원수는 15% 증가한다.
//        (삼항연산자로 해보기)

        int employee = 1892;
        int ranking = 10;
        double residual = employee + (1892 * 0.15);
        double relegation = employee - (1892 * 0.15);
        //int staff =

        //String quiz7 = ()

        /* 300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라. */
        System.out.println("==================8번 문제======================");
        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;
        String result = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";
        System.out.println(result);

        System.out.println("==================9번 문제======================");
        //시험과목 3개의 점수가 50,40,60이다 평균 40을 넘기면 합격 못넘기면 불합격 출력
        int score1 = 50;
        int score2 = 40;
        int score3 = 60;
        
        double average2 = (score1 + score2 + score3) / 3;
        if(average2 > 40){
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }

        System.out.println("===================내 문제======================");
        // 영어시험을 본 결과 1번 학생은 90점 2번 학생은 95점 3번 학생은 81점을 맞았다 평균을 구한 후 논리 연산자를 이용해 90점 이상~100점 이하라면 true를 출력, 아니라면 false를 출력하라.

        int stu1 = 90;
        int stu2 = 95;
        int stu3 = 81;

        int sum3 = stu1 + stu2 + stu3;
        double average3 = sum3 / 3;

        System.out.println("average : " + (int)average3);

        System.out.println((90 <= average3) && (100 >= average3));
    }
}
