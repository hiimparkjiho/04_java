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
        int totalLottoGenerated = 0;    // 구매한 로또 개수
        while (true){
            System.out.println("구매할 복권을 개수를 입력해주세요 (최대 10개까지 구매할 수 있습니다.) : ");
            int num = scan.nextInt();
           if(num <= 0 || num > 10){
               System.out.println("다시 시도해주세요"); // 0개 이하로 사거나 10개 넘어가서 구매시 취소
               return;
           }else{
               for(int i = 1; i <= num; i++){
                   Set<Integer> lottoNum = new HashSet<>();
                   while(lottoNum.size() < 6){
                       int luckyNum = random.nextInt(45) + 1;// 복권 행운번호 랜덤
                       lottoNum.add(luckyNum);// 세트에 값 대입
                   }
                   System.out.println(i + "번째 행운번호: " + lottoNum);
                   totalLottoGenerated++; //증감 연산자로 구매할 때마다 구매한 로또 개수 증가
                   if (totalLottoGenerated >= 10) {
                       System.out.println("복권 번호 10개를 모두 생성했습니다.");
                       Set<Integer> winningNumber = new HashSet<>();
                       while (winningNumber.size() < 6){
                           int winningNum = random.nextInt(45) + 1;
                           winningNumber.add(winningNum);
                       }
                       if(lottoNum.equals(winningNumber)){
                           System.out.println("당첨번호: " + winningNumber);
                           System.out.println("당첨되었습니다.");
                           return;
                       }else{
                           System.out.println("당첨번호: " + winningNumber);
                           System.out.println("당첨자가 없습니다.");
                           return; // 프로그램 종료
                       }
                   }
               }
           }

        }


    }






}
