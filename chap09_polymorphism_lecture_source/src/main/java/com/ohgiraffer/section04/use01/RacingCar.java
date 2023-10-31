package main.java.com.ohgiraffer.section04.use01;

public class RacingCar extends Car{

    @Override
    public void go() {
        System.out.println("레이싱 카가 달려갑니다");
    }

    @Override
    public void stop() {
        System.out.println("레이싱 카가 멈춥니다.");
    }
}
