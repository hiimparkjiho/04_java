package source.src.main.java.com.ohgiraffers.section03.abstaction;

public class Circle {

    private int radius;

    // 행위: 메소드
    // 생성자
    public Circle(int raduis) {
        this.radius = radius;
    }

    // 넓이 구하기
    public void calculateArea(int radius) {
        System.out.println("원의 넓이는 : " + radius * radius * 3.14);
    }

    // 둘레 구하기
    public void calculateRound(int radius) {
        System.out.println("원의 둘레는 : " + radius * 2 * 3.14);
    }

    // 개수의 따른 넓이
    // overloading : 메소드 이름은 같은데 파라미터의 개수가 다르거나, 파라미터의 타입이 다른경우
    // 다른 메소드로 인지하고 일치하는 메소드로 자동 호출 되는 것
//    public void calculateArea(int radius, int count) {  // 파라미터로 개수를 받는다.
//        System.out.println(calculateArea(radius) * count);
//    }

}
