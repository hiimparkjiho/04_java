package main.java.com.ohgiraffer.section01;

public class Application8 {
    public static void main(String[] args){
        /*
        * static 메소드
        *
        * static 메소드를 호출하는 방법
        * 클래스.메소드명();
        * */

        // 권장하지 않는 방식
        Application8 app8 = new Application8();
        int result = app8.sunToNumbers(1,2);

        // 권장하는 방식
        int result2 = Application8.sunToNumbers(1,2);
    }
    public static int sunToNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
