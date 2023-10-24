package source.src.main.java.com.ohgiraffers.section03.abstaction;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){

        //원 을 Class 로 설계하세요.
        //멤버 변수는 아래를 참조 하세요.

        // 예)원의 넓이 : 200.96
        // 원의 둘레 : 50.24

        Scanner scan = new Scanner(System.in);
        System.out.println("반지름을 입력하시오 : ");
        int radius = scan.nextInt();
        Circle circle = new Circle(radius);
        circle.calculateArea(radius);
        circle.calculateRound(radius);

    }
}
