package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement(){
        /*
        * [switch 문 표현식]
        * switch(비교할 변수){
        *   case 비교값1 : 비교값 1과 일치하는 경우 실행할 구문; break;
        *   case 비교값2 : 비교값 2와 일치하는 경우 실행할 구문; break;
        *   case 비교값3 : 비교값 3와 일치하는 경우 실행할 구문; break;
        * }
        *
        * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다
        * 따라서 일부 호환이 가능하다.
        * 하지만, switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
        * 실수와 논리는 비교할 수 없다.
        * 또한 정확하게 일치하는 경우에만 비교할 수 있으며 대소비교를 할 수 없다는 게 특징이다.
        * case 절에는 변수를 사용하지 못한다.
        * 또한 문자열 비교는 jdk1.7부터 가능하다
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 정수 입력: ");
        int first = scan.nextInt();
        System.out.println("두번째 정수 입력: ");
        int second = scan.nextInt();

        System.out.println("연산 기호 입력(+, -, *, /, %)");
        char sign = scan.next().charAt(0);

        int result = 0;
        switch (sign){
            case '+' : result = first + second;
                break;
            case '-' : result = first - second;
                    break;
                case '*' : result = first * second;
                    break;
                case '/' : result = first / second;
                    break;
                case '%' : result = first % second;
                    break;
        }
        System.out.println(first + " " + sign + " " + second + " = " + result);
    }

    public String test03(){
        /*
         * 사용자가 선택한 음료와 가격을 문자열로 반환해주자
         * 프로그램의 콘솔 출력은 반환받은 값을 main에서 출력할 것이다.
         *
         * 단 자판기는 switch 를 이용해서 만든다.
         * */
        System.out.println("=== OhGiraffers vending machine ===");
        System.out.println("  사이다(500)   콜라(600)   환타(700)   바카스(1000)  핫식스(1500)  ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();
        String order = "";
        int price = 0;
        switch (selectedDrink){
            case "사이다" : price = 500;
                break;
            case "콜라" : price = 600;
                break;
            case "환타" : price = 700;
                break;
            case "바카스" : price = 1000;
                break;
            case "핫식스" : price = 1500;
                break;
            default:
                System.out.println("다시 입력해주세요");
        }
        order = selectedDrink + " 가격은 " + price;
        return order;
    }

//    public void quiz01(){
//        Scanner scan = new Scanner(System.in);
//        int price = 0;
//        String product = "";
//        for(;;){
//            System.out.println("자판기 입니다. 음료수를 선택해주세요. 계산을 원하시면 계산을 입력해주세요. \n사이다, 콜라, 환타, 바카스, 핫식스");
//            System.out.println("음료수를 선택해주세요 : ");
//             product = scan.next();
//             if(product.equals("사이다")){
//                price += 500;
//            }if(product.equals("콜라")){
//                price += 600;
//            }if(product.equals("환타")){
//                price += 700;
//            }if(product.equals("바카스")){
//                price += 1000;
//            }if(product.equals("핫식스")){
//                price += 1500;
//            } if(product.equals("계산")){
//                System.out.println("가격은 " + price + "원 입니다");
//                break;
//            }
//        }
//    }

    public void VendingMachine() {
        //
        Scanner scan = new Scanner(System.in);

        int price = 0;

        System.out.println("자판기 입니다. 음료수를 선택해주세요");
        System.out.println("사이다-500원  콜라-600원  환타-700원  바카스-1000원  핫식스-1500원");
        while (true) {

            System.out.println("계산을 원하시면 계산을 입력해주세요");

            String product = scan.next();

            switch (product) {
                case "사이다":
                    price += 500;
                    break;
                case "콜라":
                    price += 600;
                    break;
                case "환타":
                    price += 700;
                    break;
                case "바카스":
                    price += 1000;
                    break;
                case "핫식스":
                    price += 1500;
                    break;
                case "계산":
                    System.out.println("가격은 " + price + "원 입니다.");
                    return;
                default:
                    System.out.println("잘못된 음료수입니다. 다시 선택해주세요.");
            }
        }
    }


}
