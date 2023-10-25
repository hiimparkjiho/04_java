package source.src.main.java.com.ohgiraffers.section03.abstaction;

public class Circle {
    // 행위: 메소드
    // 생성자
    // 넓이 구하기
    public double calculateArea(int radius) {
        return radius * radius * 3.14;
    }

    // 둘레 구하기
    public double calculateRound(int radius) {
       return  radius * 2 * 3.14;
    }

    // 개수의 따른 넓이
    public double calculateArea(int count, int radius) {  // 파라미터로 개수를 받는다. 오버로딩 활용
         return calculateArea(radius) * count;
    }

}
