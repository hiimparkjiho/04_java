package main.java.com.ohgiraffer.section01;

public class Application9 {
    public static void main(String[] args){
        // 계산기 만들기

        int first = 100;
        int second = 50;

        int result = 0;

        Calculater cal = new Calculater();
        //Application9 app9 = new Application9();

        result = cal.minNumbersOf(first, second);
        System.out.println(result);

        result = Calculater.maxNumbers(first, second);
        System.out.println(result);
    }


}
