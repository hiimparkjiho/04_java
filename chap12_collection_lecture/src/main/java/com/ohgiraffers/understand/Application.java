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
        Map<String, Set<Integer>> lotto = new HashMap<>();
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int count = 0;
        for(;;){
            System.out.println("구매할 복권의 개수를 입력해주세요: ");
            int num = scan.nextInt();
            if(num > 10 || num <= 0){   // 10개 이상이나 0개 이하로 입력 불가능하게 한다.
                System.out.println("알맞은 개수를 입력해주세요");
                return;
            }
            for(int i = 1; i <= num; i++){ // 스캐너로 받은 정수만큼 랜덤으로 로또번호 생성
                Set<Integer> lottoNum = new HashSet<>();
                while(lottoNum.size() < 6){
                    int luckNum = random.nextInt(45)+1;
                    lottoNum.add(luckNum);
                }
                count++; // 증감연산자로 로또 번호가 카운트
                System.out.println(i +"번째 복권 : " + lottoNum);
                if(count >= 10){    // 로또 번호가 10개가 되면 당첨번호 생성
                    System.out.println("당첨 번호가 생성됩니다.");
                    Set<Integer> winningNumber = new HashSet<>();
                    while(winningNumber.size() < 6){
                        int winningNum = random.nextInt(45) + 1;
                        winningNumber.add(winningNum);
                    }
                    if(lottoNum.equals(winningNumber)){ // 당첨시
                        System.out.println(winningNumber);
                        System.out.println("당첨입니다!");
                        return;
                    }else{  //당첨되지 않을 시
                        System.out.println(winningNumber);
                        System.out.println("당첨자가 없습니다");
                        return;
                    }
                }
            }


        }


    }
}
