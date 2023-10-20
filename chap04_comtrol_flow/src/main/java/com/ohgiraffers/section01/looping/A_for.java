package main.java.com.ohgiraffers.section01.looping;

import java.util.Scanner;

public class A_for {

    /*
    * for[표현식]
    * for(초기값; 조건식; 증감식){
    *
    * }
    * */
    public void test01(){
        for(int i = 0; i <= 10; i+=2){
            System.out.println(i);
        }
    }

    public void testForExample(){
        // 반의 학생이 10명인 학생의 이름을 입력받기
        Scanner scan = new Scanner(System.in);
//        System.out.println("1번째 학생의 이름을 입력해주세요: ");
//        String name = scan.nextLine();
        for(int i = 0; i < 10; i++){
            System.out.println((i+1) + "번째 학생의 이름을 입력해주세요");
            String student = scan.nextLine();
            System.out.println((i+1) + "번째 학생의 이름은: " + student + "입니다");
        }
    }

    public void testForExample2(){
        // 1~10까지 합을 구한다
        int sum = 0;
        for(int i = 1; i < 11; i++) {
           sum += i;
        }
        System.out.println(sum);
    }

    // 반복문에 조건문 사용
    public void testForExample3(){
        for (int i = 0; i <= 10; i++){
            if(i == 0){
                System.out.println("0입니다.");
            }else if(i%2 == 0){
                System.out.println("짝수");
            } else{
                System.out.println("홀수 입니다");
            }
        }
    }

}
