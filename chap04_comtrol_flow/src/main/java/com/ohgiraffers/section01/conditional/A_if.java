package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement(){
        /*
        * [if문 표현식]
        * if(조건){
        *   조건이 참일 경우 실행할 내용
        * }
        *
        * 조건식이 참 혹인 거짓이 나오는 연산식을 조건식이라고 한다.
        * if문은 조건식의 결과 값이 창이면 {}안에 있는 코드를 실행하고
        * 조건식의 결과 값이 거짓이면 {}안의 내용을 무시한다.
        *
        * 정수를 한 개 입력받고 그 수가 짝수인지 아닌지 검사하는 프로그램을 만들어보자
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력해주세요: ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("짝수입니다");
        }else{
            System.out.println("짝수가 아닙니다");
        }
    }

    public void testNessdlstatement(){
        /*
        * 중첩반복문
        *
        * 정수 한개를 입력하여 그 수가 양수인 경우에만 짝수인지를 확인하고
        * 짝수이면 "입력하신 숫자는 인수이면서 짝수입니다"
        * 그 외 둘 중 하나라도 아니면 프로그램을 종료한다
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("수를 입력해주세요: ");
        int num = scan.nextInt();
        // 양수, 0, 음수
        if(num > 0){    // 양수인지 확인
            System.out.println("양수입니다.");
            // 짝수 판단
            if((num & 2) == 0){
                System.out.println("짝수입니다");
            }else{
                System.out.println("양수이면서 홀수입니다.");
            }
        }else if(num < 0){
            System.out.println("음수입니다.");
        }else{
            System.out.println(0 + "입니다");
        }

    }
}
