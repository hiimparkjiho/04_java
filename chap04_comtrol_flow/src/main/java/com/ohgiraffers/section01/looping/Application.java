package main.java.com.ohgiraffers.section01.looping;

import main.java.com.ohgiraffers.section01.conditional.D_switch;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        A_for afor = new A_for();
        //afor.test01();

//        afor.testForExample();
//        afor.testForExample2();

//        Scanner scan = new Scanner(System.in);
//        System.out.println("숫자를 입력해주시오: ");
//        int firstNum = scan.nextInt();
//        afor.gugudan(firstNum);

        B_while bWhile = new B_while();
        bWhile.testSimpleWhileStatement();

        Quiz quiz = new Quiz();
        //quiz.quiz01();

        // 랜덤 함수를 활용해서

        // 사용자 이름
        D_switch dSwitch = new D_switch();
       // dSwitch.VendingMachine();

        Jap jap = new Jap();
        //ap.quiz01();
        //afor.testForExample4();


    }
}
