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

    public void testForExample4(){
        /*
        * 숫자 두 개를 입력받아 작은 수에서 큰 수까지의 합계를 구하세요
        * 단 , 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결을 합니다.
        * */

        /*
        * 프로그램
        * 목표 : 두 수를 입력받아서 작은 수부터 큰 수까지의 합계를 구한다.
        * 주의 : 두 수의 값은 같을 수 없다.
        *
        * 1. 두 수를 입력받아야한다.
        * 2. 입력 받은 수가 같은지 확인한다.
        *   2-1. false , 두 수가 같지 않다면 다음으로 넘긴다.
        *   2-2 true면 두 수를 다시 입력한다.
        * 3. 같지 않다면 작은 수와 큰 수를 구한다.
        * 4. 작은 수부터 큰 수까지의 합계를 구한다.
        * */

        System.out.println("두 수를 입력받아 작은 수부터 큰 수까지 합계를 구하는 프로그램입니다.");


    }
    /**
    * 구구단을 위한 함수입니다.
    * n ~ 9단
    * @Parameter first : 해당 단을 수행함
    * @Return void
    * */
    public void gugudan(int firstNum){
        //Scanner scan = new Scanner(System.in);  // 몇단을 수행할건지 받는다
        //System.out.println("숫자를 입력해주시오: ");
        //int num = scan.nextInt();
        for(int i = 1; i < 10; i++){
            System.out.println(firstNum + " x " + i + " = " + firstNum * i);
        }
    }

}
