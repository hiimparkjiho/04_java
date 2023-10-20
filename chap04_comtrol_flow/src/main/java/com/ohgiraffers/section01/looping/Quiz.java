package main.java.com.ohgiraffers.section01.looping;

import java.util.Scanner;

public class Quiz {
    // do while을 이용하여 사용자에 1단 부터 n단 까지 출력하는 구구단 프로그램을 보여줍니다.
    // 프로그램은 다음과 같습니다.
    // EX) 사용자 입력값이 6이라면 1~6단까지의 단을 출력해주세요.
    // 중첩 반복문을 사용해야 합니다.

    public void quiz01(){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int firstNum = 0;
        do{
            System.out.println("입력 값: ");
            firstNum = scan.nextInt();
            for(int i = 1; i <= firstNum; i++){
                for(int j = 1; j < 10; j++){
                    sum += i * j;
                    System.out.println(i + " x " + j + " = " + (i * j));
                }if(i % 2 == 0){// 2의 배수를 없애는
                    continue;
                }
            }break;
        }while(firstNum <= 9);
    }

}
