package main.java.com.ohgiraffer.section01;

public class Application7 {
    public static void main(String[] args){
        /*
        * 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 함수
        * */
        int num1 = 10;
        int num2 = 2;
        Application7 app7 = new Application7();

        System.out.println("더한 값은? : " + app7.plusMethod(num1, num2));
        System.out.println("뺀 값은? : " + app7.minusMethod(num1, num2));
        System.out.println("곱한 값은? : " + app7.multiplyMethod(num1, num2));
        System.out.println("나눈 값은? : " + app7.divideMethod(num1, num2));
    }
    public int plusMethod(int num1, int num2){  // 접근제어자 반환타입 메소드명(매개변수)

        return num1 + num2;
    }

    public int minusMethod(int num1, int num2){

        return num1 - num2;
    }

    public int multiplyMethod(int num1, int num2){

        return num1 * num2;
    }

    public int divideMethod(int num1, int num2){

        return num1 / num2;
    }
}
