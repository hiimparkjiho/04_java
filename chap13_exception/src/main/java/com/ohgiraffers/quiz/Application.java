package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
//        사용자로부터 두 개의 숫자를 입력받습니다.
//                입력된 두 숫자를 나누려고 시도합니다.
//        만약 0으로 나누려고 시도하거나 숫자가 아닌 값을 입력하면, 예외 처리를 통해 오류 메시지를 출력합니다.
//                나눗셈이 가능한 경우 결과를 출력합니다.
//        힌트: 예외 처리에는 try-catch 블록을 사용하면 됩니다.
//
//                이 문제를 풀어보면 예외 처리의 기본적인 사용법을 익힐 수 있을 것입니다.

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = scanner.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }

            double result = num1 / num2;
            System.out.println("나눈 결과: " + result);
        } catch (ArithmeticException e) {
            System.err.println("예외 발생: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("예외 발생: 숫자가 아닌 값이 입력되었습니다.");
        }
    }
}
