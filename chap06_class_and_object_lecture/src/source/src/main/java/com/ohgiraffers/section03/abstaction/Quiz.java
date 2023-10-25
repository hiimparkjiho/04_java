package source.src.main.java.com.ohgiraffers.section03.abstaction;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){

        //원 을 Class 로 설계하세요.
        //멤버 변수는 아래를 참조 하세요.

        // 예)원의 넓이 : 3.14
        // 원의 둘레 : 6.28
//        Circle circle = new Circle();
        Scanner scan = new Scanner(System.in);
//        System.out.println("반지름을 입력하시오 : ");
//        int radius = scan.nextInt();
//        System.out.println("원의 개수를 입력해주시오 : ");
//        int count = scan.nextInt();
//
//        System.out.println("원의 넓이: " + circle.calculateArea(radius));
//        System.out.println("원의 둘레: " + circle.calculateRound(radius));
//        System.out.println("원 " + count + "개의 넓이: " + circle.calculateArea(count, radius));

//        System.out.println("숫자를 입력해주세요: ");
//        int num = scan.nextInt();
//
//        for(int i = 0; i <= num; i++){
//            System.out.print("@");
//            for(int j = 0; j < i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        for(int i = 0; i < 5; i++) {  // 행
            for(int j = 0; j < 4 - i; j++) {// 공백
                System.out.print("@");
            }
            // 별찍기
            // 짝수: 2n,  홀수: 2n + 1 또는 2n - 1
            for(int j = 0; j < (2 * i) + 1; j++) { // 별의 개수는 홀수개, 공식만큼 돌린다.
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("========================================");
        for(int i = 0; i < 5; i++){
            for(int j = 9; j > i; j--){
                System.out.print("*");
            }
            for(int k = 0; k < i; k++){
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
