package main.java.com.ohgiraffers.section01.looping;

import java.util.Scanner;

public class Jap {
    public static void main(String[] args){


    }

    public void quiz01() {
        Scanner scan = new Scanner(System.in);
        int price = 0;
        String product = "";
        for(;;){
            System.out.println("자판기 입니다. 음료수를 선택해주세요. 계산을 원하시면 계산을 입력해주세요. \n사이다, 콜라, 환타, 바카스, 핫식스");
            System.out.println("음료수를 선택해주세요 : ");
            product = scan.next();
            if(product.equals("사이다")){
                price += 500;
            }if(product.equals("콜라")){
                price += 600;
            }if(product.equals("환타")){
                price += 700;
            }if(product.equals("바카스")){
                price += 1000;
            }if(product.equals("핫식스")){
                price += 1500;
            } if(product.equals("계산")){
                System.out.println("가격은 " + price + "원 입니다");
                break;
            }

        }

    }

}
