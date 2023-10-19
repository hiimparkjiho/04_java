package main.java.com.ohgiraffer.section04.scanner;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){

        // 스캐너로 학생 3명의 점수를 입력 받아 평균을 구한다. 계산식은 클래스를 하나 더 만들어 static 메소드로 호출한다.
        //

        Scanner sc = new Scanner(System.in);
//        System.out.println("1번 학생의 점수를 입력하시오: ");
//        int score1 = sc.nextInt();
//        System.out.println("2번 학생의 점수를 입력하시오: ");
//        int score2 = sc.nextInt();
//        System.out.println("3번 학생의 점수를 입력하시오: ");
//        int score3 = sc.nextInt();
//
//        int sum = Price.sum(score1, score2, score3);
//        double average = Price.average(sum);
//        System.out.println("평균: " + (int)average);

//         A와 B라는 무작위의 숫자를 출력해 그 합을 반환하는 함수를 만들어 주세요.
//         답변 양식은  ("A의 값은 () B의 값은 () 이므로 합은 ()입니다.")
//         static 메소드를 활용해주세요

//        System.out.println("1번 숫자 출력 : ");
//        int a = sc.nextInt();
//        System.out.println("2번 숫자 출력 : ");
//        int b = sc.nextInt();

//        System.out.println("A의 값은 " + a + " B의 값은 " + b + "이므로 합은 " + StaticMethod.plus(a, b) + "입니다.");


        // 주문한 음식의 가격을 합을 출력하려고 한다.
        // 식당의 메뉴는 탕수육, 마파두부, 짜장면이 있으며,
        // 탕수육의 가격은 4만원
        // 마파두부의 가격은 2만원
        // 짜장면의 가격은 1만원 이다.

        // 탕수육, 마파두부, 짜장면 3그릇을 주문하였을 때 가격의 합을 출력하시오.
        // method 를 사용하시오.
        // 출력되는 값은 다음과 같다. "주문하신 음식 가격의 합은 : #만원 입니다."

        StaticMethod smethod = new StaticMethod();

        int tang = 4;
        int mapa = 2;
        int jj = 1;
        System.out.println("주문하신 음식 가격의 합은 : " + smethod.priceSum(tang, mapa, jj) + "만원입니다.");

        // "일 식비가 얼마나 되나요?(금액만 입력해주세요.)"가 출력된 후,
        // 일 식비를 입력했을 때, 10000원을 이상이면 "과소비된 식비입니다.",
        // 5000원을 이상이면 "검소한 식비입니다.",
        // 5000원 미만이면 "굶는 중입니다."가 화면에 출력되도록 하세요.
        // 이 때 메서드 한 개를 이용하되, static을 쓰지 않고 return 값 반환을 이용해서 만들어 보세요.

        System.out.println("일 식비 입력: ");
        int price = sc.nextInt();
        smethod.money(price);

        //        계산기 만들기
//        계산기에 필요한 기능은 + , - , * , / , %  총 5가지 연산자다.
//        ((예시))
//        첫 번 째 숫자를 입력하세요 :
//        2
//        연산할 기호를 쓰세요 :
//        +
//        두 번 째 숫자를 입력하세요 :
//        2
//        결과는 4입니다

        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int calc1 = sc.nextInt();
        System.out.println("연산할 기호를 쓰세요 : ");
        String sign = sc.nextLine();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int calc2 = sc.nextInt();
        System.out.println("");
    }
}
