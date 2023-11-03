package main.java.com.ohgiraffers.understand;

import com.sun.jdi.Value;

import java.util.*;

public class Application {
    public static void main(String[] args){
        // 로또 프로그램
        // 로또가 10번 팔리면 당첨번호가 생성이 됨 (랜덤으로)
        // 1번 로또:key(String)   로또 번호:value(Set으로 이루어져 있다)
        //로또의 번호는 1~45까지 랜덤으로 생성이되며 중복되면 안 된다.
        // 구매하는 사람은 최대 10개까지 구매할 수 있다.

        Random random = new Random();
        Map<Integer, Set<Integer>> buyerLotto = new HashMap<>();
        Set<Integer> winningNumber = new HashSet<>();
            for(int i = 0; i < 10; i++){
                Set<Integer> lottoNumber = new HashSet<>();
                while(lottoNumber.size() < 6){  // 유저 로또
                    int number = random.nextInt(45) + 1;
                    lottoNumber.add(number);
                }
                buyerLotto.put(i+1, lottoNumber);
                System.out.println("행운번호: " + lottoNumber);
            }

            while(winningNumber.size() < 6){
                int winningNum = random.nextInt(45) + 1;
                winningNumber.add(winningNum);
            }
            System.out.println("당첨번호는? " + winningNumber);

            if(buyerLotto.equals(winningNumber)){
                System.out.println("당첨입니다");
            }else{
                System.out.println("이번 회차 당첨자 없음");
            }

    }
}
