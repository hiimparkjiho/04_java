package main.java.com.ohgiraffers.section01.list.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){
        //문제: 사용자로부터 숫자를 입력받아 이를 ArrayList에 저장하고, 입력이 끝나면 ArrayList의 모든 숫자를 출력하는 Java 프로그램을 작성하세요.

        Scanner scan = new Scanner(System.in);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int input;
//        for(;;){
//            System.out.println("숫자를 입력해주세요 :   (입력 종료는 -1)");
//            input = scan.nextInt();
//            if(input == -1){
//                System.out.println("입력 종료");
//                break;
//            }
//            arrayList.add(input);
//        }
//        System.out.println(arrayList);

        //문제: 사용자로부터 문자열을 입력받아 이를 ArrayList에 저장한 후, 입력이 끝나면 ArrayList의 문자열을 알파벳 순으로 정렬하고 출력하는 Java 프로그램을 작성하세요.
        ArrayList<String> stringList = new ArrayList<>();
        String result;
        for(;;){
            System.out.println("알파벳을 입력해주세요: ");
            result = scan.next();

            if(result.equals("end")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            stringList.add(result);
        }
        System.out.println(stringList);
    }
}
