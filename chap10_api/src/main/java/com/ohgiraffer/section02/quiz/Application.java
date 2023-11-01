package main.java.com.ohgiraffer.section02.quiz;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//            *         공백 4개   1
//           ***        공백 3개   3
//          *****       공백 2개   5
//         *******      공백 1개   7
//        *********     공백 0개   9
//         *******      공백 1개   7
//          *****       공백 2개   5
//           ***        공백 3개   3
//            *         공백 4개   1


        System.out.println("숫자를 입력해주세요 : ");
        int quiz01 = scan.nextInt();
        for(int i = 1; i <= quiz01; i++){     // scan으로 받은 행
            for(int j = quiz01-1; j >= i; j--){    // 공백은 하나씩 줄어든다
                System.out.print(" ");

            }
            for(int k = 1; k <= i * 2-1; k++)
                System.out.print("*");  // 1 3 5 7 9 별찍기
            System.out.println();   // 행 변경
        }
        for(int i = 1; i < quiz01; i++){     // 4줄
            for(int j = 1; j <= i; j++){           // 공백 1 2 3 4
                System.out.print(" ");
            }
            for(int k = (quiz01 *2)-3; k >= i*2-1; k--){      // 7 5 3 1 별찍기
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=======================================");
        // 입력 The Curious Case of Benjamin Button 출력 : 6
//        String quiz1 = "The Curious Case Of Benjamin Button";
//        String[] splitQuiz = quiz1.split(" ");
//        int num = 0;
//        for(int i = 0; i < splitQuiz.length; i++){
//            num += i++;
//        }
//        System.out.println("단어의 갯수는 : " + num);


//        System.out.println("문장 입력 : ");
//        String quiz01 = scan.nextLine();
//        String[] quiz01Split = quiz01.split(" ");
//        int num = 0;
//        for(int i = 0; i < quiz01Split.length; i++){
//            num = i+1;
//        }
//        System.out.println(num);

        //첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
//        System.out.println("단어를 입력해주세요");
//        String quiz02 = scan.next();
//        System.out.println(quiz02.length());

        //단어
        //$S$와 정수
        //$i$가 주어졌을 때,
        //$S$의
        //$i$번째 글자를 출력하는 프로그램을 작성하시오.

//        System.out.println("단어를 입력하세요 : ");
//        String quiz03St = scan.next();
//        System.out.println("숫자를 입력해주세요 : ");
//        int quiz03Int = scan.nextInt();
//
//        char quiz02Ch = quiz03St.charAt(quiz03Int - 1);
//        System.out.println(quiz02Ch);

//        알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
//        팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
//        level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

//        System.out.println("단어를 입력하시오: ");
//        String quiz04 = scan.next();
//        String quiz04Re = new StringBuilder(quiz04).reverse().toString();
//
//        if(quiz04.equals(quiz04Re)){
//            System.out.println("1");
//        }else{
//            System.out.println("0");
//        }

        System.out.println("문자열을 입력해주세요 : ");
        String quiz05 = scan.next();
        System.out.println(quiz05.length());
        if(!((quiz05.length() >= 1)) || !((quiz05.length() <= 10))){
            System.out.println("범위 내의 값을 입력해주세요");
            return;
        }
        char quiz05Ch0 = quiz05.charAt(0);
        char quiz05chl = quiz05.charAt(quiz05.length() - 1);
        System.out.print(quiz05Ch0);
        System.out.print(quiz05chl);
    }
}
