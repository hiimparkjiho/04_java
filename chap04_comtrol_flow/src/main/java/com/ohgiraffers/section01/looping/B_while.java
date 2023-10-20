package main.java.com.ohgiraffers.section01.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement(){
        /*
        * [while 표현식]
        * while(조건식){
        *
        * }
        * */

        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        int i = 0;
//        while (i < value.length()){
//            //System.out.println(i);
//            i++;
//            if(i%2 == 0){
//                continue;
//            } else if (i == 11) {
//                break;
//            }
//            System.out.println(i);
//        }

        /*
        * do while(표현식)
        * do{
        *
        * }while(조건식)
        * */
        boolean isTrue = false;
        // 먼저 조건을 판별하고 나서
        do{
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 아니라면 false를 입력");
            isTrue = scan.nextBoolean();
        } while (isTrue);

    }
}
