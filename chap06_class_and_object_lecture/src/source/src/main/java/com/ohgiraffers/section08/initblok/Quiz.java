package source.src.main.java.com.ohgiraffers.section08.initblok;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("숫자를 입력 : ");
//        int num = scan.nextInt();
//
//        for(int i = 1; i < num+1; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //마름모찍기


        for (int i = 1; i < 6; i++) {

            for (int j = 5; j >= i; j--) {   // 1. 5 4 3 2 1 공백찍기 감소
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) { // 2. 1 3 5 7 9 가되는 *찍기 증가
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i + 1; j++) {    // 3. 1 2 3 4 공백찍기 증가
                System.out.print(" ");
            }
            for (int k = 6; k > 2 * i - 1; k--) {   // 4. 7 5 3 1 가되는 *찍기 감소
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i - 1; j++) {     // 1 2 3 4 공백
                System.out.print("@");
            }
            for (int k = 9; k >= i * 2 - 1; k--)     //9 7 5 3 1
                System.out.print("*");
            System.out.println();
        }
        System.out.println("========================================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");
        for (int i = 1; i <= 5; i++) {    // 1~5까지 돈다
            for (int j = 5; j >= i; j--) { //5-4-3-2-1
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========================================");
        for (int i = 1; i <= 5; i++) {    // 5열
            for (int j = 4; j >= i; j--) {  // 4 3 2 1
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // 1 2 3 4 5
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {   // 4 3 2 1 0
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++)            // 1 3 5 7 9
                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {  // 1 2 3 4
                System.out.print(" ");
            }
            for(int k = 7; k>=i*2-1; k--){    //7 5 3 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
