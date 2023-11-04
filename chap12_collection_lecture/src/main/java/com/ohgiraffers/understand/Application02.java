package main.java.com.ohgiraffers.understand;

import com.sun.jdi.Value;

import java.util.*;

// 로또 프로그램
// 로또가 10번 팔리면 당첨번호가 생성이 됨 (랜덤으로)
// 1번 로또:key(String)   로또 번호:value(Set으로 이루어져 있다)
//로또의 번호는 1~45까지 랜덤으로 생성이되며 중복되면 안 된다.
// 구매하는 사람은 최대 10개까지 구매할 수 있다.
public class Application02 {
    public static void main(String[] args){
        Map<String, Set<Integer>> lotto = new HashMap<>();
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        while (true){
            Set<Integer> lottoNum = new HashSet<>();
            System.out.println("구매할 복권을 개수를 입력해주세요 (최대 10개까지 구매할 수 있습니다.) : ");
            int num = scan.nextInt();

           if(num <= 10){
               System.out.println(lottoNum);
               break;
           }

            while(lottoNum.size() < 6){
                int luckyNum = random.nextInt(45) + 1;
                lottoNum.add(luckyNum);
            }
        }


    }






}
