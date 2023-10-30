package main.java.com.ohgiraffer.Health;

public class Application {
    // 비만도 측정하는 기능
//    사람의 신장(H)와 몸무게(W)를 입력받아 비만도(B)를 계산하는 프로그램
//
//    표준체중:SW=(H-100)*0.9
//    비만도: B(%)=(W-SW)/SW * 100
//
//    부모 클래스(HealthInfo.java)를 상속받는 비만도 계산 클래스를 설계한다.(HealthRate.java)
//    표준체중 계산하는 메소드를 정의한다.
//    비만 여부를 구하는 메소드를 정의한다.
//            (비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)
//    출력 예시 (HealthTest.java)
//    박둘리님의 신장 160, 몸무게 45kg => 정상입니다.
//    홍길동님의 신장 168, 몸무게 90kg => 비만입니다.


    public static void main(String[] args){
        StandartWeightTest health1 = new StandartWeightTest("박지호", 165, 60);
        StandartWeightTest health2 = new StandartWeightTest("유현", 170, 100);
        StandartWeightTest health3 = new StandartWeightTest("이동현", 170, 75);
        health1.toStatus();
        health2.toStatus();
        health3.toStatus();
    }


}
