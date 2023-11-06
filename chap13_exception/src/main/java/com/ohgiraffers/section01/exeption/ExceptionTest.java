package main.java.com.ohgiraffers.section01.exeption;

public class ExceptionTest {

    public void checkedEnoughMoney(int price, int money) throws Exception{  //
        System.out.println("가지고 있는 돈은 : " + money + "원 입니다.");

        if(money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        }else{
            throw new Exception();  // 일부로 예외를 던짐, 예외를 강제화 시킴
        }
        System.out.println("즐쇼~");
    }


}
