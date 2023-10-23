package main.java.com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){
        int[] num = {4, 3, 2, 1, 2, 4, 3, 3, 2, 1};
        int[] freq = new int[5]; // 0:이 인덱스는 버린다.  1 2 3 4 => 각각의 빈도수를 저장

        for (int i = 0; i < num.length; i++) {
            freq[num[i]] += 1;
        }

        for (int i = 1; i < freq.length; i++) {
           System.out.println(i + ":" + freq[i] + "개");
        }

        // 문제
        // 2개의 인덱스 값을 scanner로 받아 해당 index 값들을 서로 바꿔주는 문제.
//        Scanner scan = new Scanner(System.in);
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.print("두 개의 index를 입력하세요:");
//        int idx1 = scan.nextInt();
//        int idx2 = scan.nextInt();
//
//        int temp = numbers[idx1];
//        numbers[idx1] = numbers[idx2];
//        numbers[idx2] = temp;
//
//        for(int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }

        System.out.println("===================배열 값 합하기==================");
        int[] numbers = {1,2,3,4,5,2,3};
        // 배열 값 돌려서 합하기
        int sum = 0; // 합 넣어줄 변수 선언
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println("===================배열에서 최대값 찾기==================");
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(max);


//        System.out.println("===================시급 구하기 문제==================");
//        Scanner scan = new Scanner(System.in);
//        // 시급 구하기 문제
//        int[] work = new int[7];
//        int money = 0;
//        // 주말 시급 : 9000
//        // 평일 시급 : 8500
//        for(int i = 0; i < work.length; i++){
//            if(i > 4){
//                System.out.println("주말에 일한 시간을 입력하시오");
//                int weeknd1 = scan.nextInt();
//                int weeknd2 = scan.nextInt();
//                money += work[i] * 2000;
//            }else{
//                System.out.println("평일에 일한 시간을 입력하시오");
//                int weekday1 = scan.nextInt();
//                int weekday2 = scan.nextInt();
//                int weekday3 = scan.nextInt();
//                int weekday4 = scan.nextInt();
//                int weekday5 = scan.nextInt();
//                money += work[i] * 1000;
//            }
//        }
//        System.out.println("1주일 총 시급은 : " + money + "원 입니다");

        //    염라대왕이 화나셨다! 명부 리스트에서 몇 명을 추출하여
        //    그 중에 한 명을 지옥에 보낼려고 한다.


        // 배열과 for문을 한 번씩 써야한다.
        //    보이는 출력은 아래와 같다.
        /* EX)
        *  사람들을 몇 명 뽑을까요?
        *      3
        * 1번째 운 없는 자의 이름을 입력하세요 :
          홍길동
          2번째 운 없는 자의 이름을 입력하세요 :
          고길동
          3번째 운 없는 자의 이름을 입력하세요 :
          강수진
          *
          * 지옥에 갈 사람은 누구입니다!
        *
        * */

        Scanner scan = new Scanner(System.in);
        int[] people = new int[3];
        for(int i = 0; i < people.length; i++){
            System.out.println(i + 1 + "번째 운 없는 자의 이름을 입력하세요");
            
            int unlNum = (int)(Math.random() * people.length);
        }
        System.out.println("지옥에 갈 사람은 " + people[unlNum] + "입니다!");


    }
}
