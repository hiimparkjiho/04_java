package source.src.main.java.com.ohgiraffers.section03.abstaction;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){

        //원 을 Class 로 설계하세요.
        //멤버 변수는 아래를 참조 하세요.

        // 예)원의 넓이 : 200.96
        // 원의 둘레 : 50.24

        Scanner scan = new Scanner(System.in);
//        System.out.println("반지름을 입력하시오 : ");
//        int radius = scan.nextInt();
//        Circle circle = new Circle(radius);
//        circle.calculateArea(radius);
//        circle.calculateRound(radius);

//        System.out.println("숫자를 입력하시오 : ");
//        int num = scan.nextInt();
//        for(int i = num; i > 0; i--){
//            for(int j = i; j > 0; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

        int[][] scores = {
                {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
                {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
                {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
                {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
                {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
        };

        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores.length; j++){
                System.out.println(scores.length);
                System.out.println(scores[i].length);
                //System.out.print(scores[i][j] + " ");
            }
        }
    }
}
