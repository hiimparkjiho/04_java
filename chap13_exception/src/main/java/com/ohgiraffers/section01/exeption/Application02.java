package main.java.com.ohgiraffers.section01.exeption;

public class Application02 {

    public static void main(String[] args){

        ExceptionTest et = new ExceptionTest();

        try{
            et.checkedEnoughMoney(5000, 10000);
            et.checkedEnoughMoney(1000, 500);
            et.checkedEnoughMoney(500, 5000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
